package com.clitesol.chd.controller;

import com.clitesol.chd.model.BaseResponse;
import com.clitesol.chd.model.Customer;
import com.clitesol.chd.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController  {
    @Autowired
    private CustomerService customerService;

    @GetMapping(name="/Monitor",produces = "application/json")
    public BaseResponse monitor(){
        BaseResponse response = new BaseResponse();
        response.setStatus("success");
        return response;
    }

    @RequestMapping("/all")
    public List<Customer> search(){
        return customerService.getAll();
    }
    @PostMapping(consumes = "application/json")
    public Customer insert(@RequestBody Customer customer){
        return customerService.insert(customer);
    }
    @PutMapping(name="/{id}", consumes = "application/json")
    public Customer update(@PathParam("id") String id,@RequestBody Customer customer){
        return customerService.insert(customer);
    }
}
