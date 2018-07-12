package com.clitesol.chd.service;

import com.clitesol.chd.model.Customer;
import com.clitesol.chd.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerService implements BaseService<Customer> {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findOne(String id) {
        return customerRepository.findById(id);
    }


    @Override
    public Customer insert(Customer customer) {
        return customerRepository.insert(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public Customer delete(String id) {
        return null;
    }
}
