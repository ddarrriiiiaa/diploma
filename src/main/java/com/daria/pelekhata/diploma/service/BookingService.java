package com.daria.pelekhata.diploma.service;

import com.daria.pelekhata.diploma.entity.Booking;

import java.util.List;

public interface BookingService {

    public void create(Booking booking);

    public List<Booking> readAll();

    public Booking read(int id);

    public boolean update(Booking booking, int id);

    public boolean delete(int id);
}
