package com.workintech.s18d4.service;

import com.workintech.s18d4.dao.AddressRepository;
import com.workintech.s18d4.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements  AddressService{
    private final AddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address find(long id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Address with given id is not found:" + id));
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address update(long id, Address address) {
       Address existingAddress = find(id);
       address.setId(id);
       return addressRepository.save(address);
    }

    @Override
    public Address delete(long id) {
        Address address = find(id);
        addressRepository.delete(address);
        return address;
    }
}
