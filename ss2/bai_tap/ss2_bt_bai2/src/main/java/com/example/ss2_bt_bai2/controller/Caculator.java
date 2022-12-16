package com.example.ss2_bt_bai2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Caculator {
    @RequestMapping(value = "/")
    public String home(){
        return "result";
    }


    @RequestMapping(value = "/realizable",method = RequestMethod.POST)
    public String Caculator(@RequestParam ("number1") String number1, @RequestParam("number2") String number2, @RequestParam("calculator") String caculator, Model model){
        int result =0;
        switch (caculator){
            case "+":
                result= Integer.parseInt(number1)+Integer.parseInt(number2);
                break;
            case "-":
                result= Integer.parseInt(number1)-Integer.parseInt(number2);
                break;
            case "*":
                result= Integer.parseInt(number1)*Integer.parseInt(number2);
                break;
            case "/":
                result= Integer.parseInt(number1)/Integer.parseInt(number2);
                break;

            default:

        }
        model.addAttribute("result",result);

        return "result";
    }
}
