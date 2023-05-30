package com.daria.pelekhata.diploma.service.impl;

import com.daria.pelekhata.diploma.entity.Booking;
import com.daria.pelekhata.diploma.repository.BookingRepository;
import com.daria.pelekhata.diploma.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepository bookingRepository;

    @Override
    public void create(Booking booking) {
        bookingRepository.save(booking);
    }

    @Override
    public List<Booking> readAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking read(int id) {
        return bookingRepository.findById(id).orElseThrow();
    }

    @Override
    public boolean update(Booking booking, int id) {
        if (bookingRepository.existsById(id)) {
            booking.setId(id);
            bookingRepository.save(booking);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (bookingRepository.existsById(id)) {
            bookingRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
