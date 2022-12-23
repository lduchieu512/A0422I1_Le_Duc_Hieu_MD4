package com.codegym.ss9_th_bai1.service.customer;

import com.codegym.ss9_th_bai1.exception.DuplicateEmailException;
import com.codegym.ss9_th_bai1.model.Customer;
import com.codegym.ss9_th_bai1.model.Province;
import com.codegym.ss9_th_bai1.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll()throws Exception {
        if (true) throw new Exception("a dummy exception");
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id)throws Exception {
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer)throws DuplicateEmailException {
        try {
            return customerRepository.save(customer);
        }catch (DataIntegrityViolationException e ){
            throw new DuplicateEmailException();
        }
    }

    @Override
    public void remove(Long id) throws Exception{
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (!customerOptional.isPresent()) {
            throw new Exception("customer not found!");
        }
        customerRepository.deleteById(id);

    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstname, pageable);
    }
}
