package com.workintech.s18d4.controller;

import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
    @GetMapping("/address")
    public List<Address> findAll() {
        return addressService.findAll();
    }

    @GetMapping("/address/{id}")
    public Address find(@PathVariable long id) {
        return addressService.find(id);
    }

    @PostMapping("/address")
    public Address save(@RequestBody Address address) {
        return addressService.save(address);
    }

    @PutMapping("/address/{id}")
    public Address update(@PathVariable long id,@RequestBody Address address) {
        return addressService.update(id,address);
    }

    @DeleteMapping("/address/{id}")
    public Address delete(@PathVariable long id) {
        return addressService.delete(id);
    }
}
