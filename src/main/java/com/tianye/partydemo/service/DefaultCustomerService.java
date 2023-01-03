package com.tianye.partydemo.service;

import com.tianye.partydemo.entities.Customer;
import com.tianye.partydemo.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service("customerService")
public class DefaultCustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getIds()
    {
        return customerRepository.findAll();
    }
}
