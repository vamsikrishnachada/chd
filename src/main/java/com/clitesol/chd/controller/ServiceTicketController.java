package com.clitesol.chd.controller;

import com.clitesol.chd.model.BaseResponse;
import com.clitesol.chd.model.Customer;
import com.clitesol.chd.model.ServiceTicket;
import com.clitesol.chd.service.CustomerService;
import com.clitesol.chd.service.ServiceTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/ticket")
public class ServiceTicketController {
    @Autowired
    private ServiceTicketService serviceTicketService;



    @RequestMapping("/all")
    public List<ServiceTicket> search(){
        return serviceTicketService.getAll();
    }
    @PostMapping(consumes = "application/json")
    public ServiceTicket insert(@RequestBody ServiceTicket customer){
        return serviceTicketService.insert(customer);
    }
    @PutMapping(name="/{id}", consumes = "application/json")
    public ServiceTicket update(@PathParam("id") String id,@RequestBody ServiceTicket customer){
        return serviceTicketService.update(customer);
    }

    @RequestMapping("/monitor")
    public BaseResponse monitor(){
        BaseResponse response = new BaseResponse();
        response.setStatus("success");
        return response;
    }
}
