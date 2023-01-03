package com.tianye.partydemo.controller;

import com.tianye.partydemo.entities.Customer;
import com.tianye.partydemo.service.DefaultCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private DefaultCustomerService defaultCustomerService;

    @GetMapping("/")
    public int index() {
        List<Customer> customers = defaultCustomerService.getIds();
        return customers.size();
    }

}
