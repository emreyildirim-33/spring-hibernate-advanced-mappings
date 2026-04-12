package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.entity.Customer;
import com.workintech.s18d4.service.AddressService;
import com.workintech.s18d4.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/address")
    public List<Customer> findAll() {
        return customerService.findAll();
    }

    @GetMapping("/customer/{id}")
    public Customer find(@PathVariable long id) {
        return customerService.find(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/customer/{id}")
    public Customer update(@PathVariable long id,@RequestBody Customer customer) {
        return customerService.update(id,customer);
    }

    @DeleteMapping("/customer/{id}")
    public Customer  delete(@PathVariable long id, CustomerService customerService) {
        return customerService.delete(id);
    }
}
