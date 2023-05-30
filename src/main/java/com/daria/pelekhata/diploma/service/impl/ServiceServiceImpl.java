package com.daria.pelekhata.diploma.service.impl;

import com.daria.pelekhata.diploma.entity.ServiceItem;
import com.daria.pelekhata.diploma.repository.ServiceRepository;
import com.daria.pelekhata.diploma.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;


    @Override
    public void create(ServiceItem serviceItem) {
        serviceRepository.save(serviceItem);
    }

    @Override
    public List<ServiceItem> readAll() {
        return serviceRepository.findAll();
    }

    @Override
    public ServiceItem read(int id) {
        return serviceRepository.getReferenceById(id);
    }

    @Override
    public boolean update(ServiceItem serviceItem, int id) {
        if (serviceRepository.existsById(id)) {
            serviceItem.setId(id);
            serviceRepository.save(serviceItem);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (serviceRepository.existsById(id)) {
            serviceRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
