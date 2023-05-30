package com.daria.pelekhata.diploma.repository;

import com.daria.pelekhata.diploma.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
}
