package com.example.ss3_th.controller;

import com.example.ss3_th.model.Customer;
import com.example.ss3_th.service.ICustomerService;
import com.example.ss3_th.service.ImplCustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
//Annotation @Controller dùng để đánh dấu 1 class là Srping MVC Controller (dùng cho web application)

@RequestMapping("/customer")
//Annotation @RequestMapping("customer") dùng để ánh xạ các request tới xử lý các controller tương ứng

public class CustomerController {
    private ICustomerService customerService = new ImplCustomerService();

    @GetMapping("")
//    @GetMapping("") là biến thể của @RequestMapping
// Annotation @GetMapping xác định phương thức index sẽ đón nhận các
// request có Http method là Get và URl pattern là "/"
    public String index(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers",customerList);
        return "/index";
    }
// Phương thức index được truyền vào có kiểu dữ liệu là Model(Model là interface).
// Model có nhiệm vụ là truyền dữ liệu từ Controller tới Views
// Ở đây, chúng ta sẽ ra danh sách các khách hàng thông qua customerService.findAll()
// Sau đó gắn danh sách này vào Model thông qua phương thức addAttribute()
// customers chính là tên bến đại diện cho danh sách mà ta sẽ dùng ở View
// Phương thức sẽ trả về String từ String này mà Spring MVC sẽ suy ra View nào nhận dữ liệu từ
// Controller(return "index"), vậy View sẽ nhận dữ liệu ở đây là index.html
@GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "/create";
}
@PostMapping("/save")
    public String save(Customer customer){
        customer.setId((int) (Math.random()*1000));
        customerService.save(customer);
        return "redirect:/customer";
    }
// Do request gửi lên có HTTP method là POST, nên ta sẽ sử dụng @PostMapping.
// customer.setId() sẽ tạo Id ngẫu nhiên cho đối tượng customer.
// Sau khi lưu customer, chúng ta sẽ redirect về trang danh sách khách hàng.
// Chuỗi đằng sau "redirect:" là đường dẫn của trang mà mình muốn redirect.
// Đồng thời, chúng ta cũng sẽ gửi một Flash message về trang danh sách khách hàng để
// thông báo lưu thành công, bằng cách sử dụng redirect.addFlashAttribute(messageName, messageContent).
@GetMapping("/(id)/edit")
    public String edit(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "/edit";
}
@PostMapping("/update")
    public String doUpdate(Customer customer){
        customerService.update(customer.getId(),customer);
        return "redirect:/customer";
}
@GetMapping("/{id}/delete")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "/delete";
}
@PostMapping("/delete")
    public String doDelete(Customer customer, RedirectAttributes redirect){
        customerService.remote(customer.getId());
        redirect.addFlashAttribute("success","\"Removed customer successfully!\"");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id,Model model){
        model.addAttribute("customer",customerService.findById(id));
        return "/view";
    }


}
