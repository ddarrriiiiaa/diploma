package com.daria.pelekhata.diploma.service.impl;

import com.daria.pelekhata.diploma.entity.ServiceType;
import com.daria.pelekhata.diploma.repository.ServiceTypeRepository;
import com.daria.pelekhata.diploma.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> readAll() {
        return serviceTypeRepository.findAll();
    }
}
