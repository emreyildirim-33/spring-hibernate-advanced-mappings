package com.workintech.s18d4.service;

import com.workintech.s18d4.dao.AccountRepository;
import com.workintech.s18d4.entity.Account;
import com.workintech.s18d4.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final CustomerService customerService;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll() ;
    }

    @Override
    public Account find(long id) {
        return accountRepository.findById(id)
                .orElse(null);
    }

    @Override
    public Account save(long customerId, Account account) {
        Customer customer = customerService.find(customerId);
        account.setCustomer(customer);
        return accountRepository.save(account);
    }


    @Override
    public Account delete(long id) {
        Account account = find(id);
        if (account != null) {
            accountRepository.delete(account);
        }
        return account;
    }
}
