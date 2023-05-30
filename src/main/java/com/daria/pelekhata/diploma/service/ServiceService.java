package com.daria.pelekhata.diploma.service;

import com.daria.pelekhata.diploma.entity.ServiceItem;

import java.util.List;

public interface ServiceService {

    public void create(ServiceItem serviceItem);

    public List<ServiceItem> readAll();

    public ServiceItem read(int id);

    public boolean update(ServiceItem serviceItem, int id);

    public boolean delete(int id);
}
