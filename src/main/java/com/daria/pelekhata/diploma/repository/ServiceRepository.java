package com.daria.pelekhata.diploma.repository;

import com.daria.pelekhata.diploma.entity.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<ServiceItem, Integer> {
}
