package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.service.AccountService;
import com.workintech.s18d4.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;
    private final CustomerService customerService;

    public AccountController(AccountService accountService, CustomerService customerService) {
        this.accountService = accountService;
        this.customerService = customerService;
    }

    @GetMapping
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping("/{id}")
    public Account find(@PathVariable long id) {
        return accountService.find(id);
    }


    @PostMapping("/{customerId}")
    public Account save(@PathVariable long customerId, @RequestBody Account account) {
        customerService.find(customerId);
        return accountService.save(customerId, account);
    }


    @PutMapping("/{customerId}")
    public Account update(@PathVariable long customerId, @RequestBody Account account) {
        customerService.find(customerId);
        return accountService.save(customerId, account);
    }

    @DeleteMapping("/{id}")
    public Account delete(@PathVariable long id) {
        accountService.find(id);
        return accountService.delete(id);
    }
}