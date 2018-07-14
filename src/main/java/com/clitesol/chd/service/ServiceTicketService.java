package com.clitesol.chd.service;

import com.clitesol.chd.model.Customer;
import com.clitesol.chd.model.ServiceTicket;
import com.clitesol.chd.repository.CustomerRepository;
import com.clitesol.chd.repository.ServiceTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ServiceTicketService implements BaseService<ServiceTicket> {

    @Autowired
    private ServiceTicketRepository serviceTicketRepository;


    @Override
    public List<ServiceTicket> getAll() {
        return serviceTicketRepository.findAll();
    }

    @Override
    public Optional<ServiceTicket> findOne(String id) {
        Optional<ServiceTicket> ticket = serviceTicketRepository.findById(id);
        return ticket;
    }

    @Override
    public ServiceTicket insert(ServiceTicket serviceTicket) {
        return serviceTicketRepository.insert(serviceTicket);
    }

    @Override
    public ServiceTicket update(ServiceTicket serviceTicket) {
        return serviceTicketRepository.save(serviceTicket);
    }

    @Override
    public ServiceTicket delete(String id) {
        return null;
    }
}
