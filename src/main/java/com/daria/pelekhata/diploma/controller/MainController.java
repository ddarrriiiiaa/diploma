package com.daria.pelekhata.diploma.controller;

import com.daria.pelekhata.diploma.entity.Booking;
import com.daria.pelekhata.diploma.entity.ServiceItem;
import com.daria.pelekhata.diploma.service.BookingService;
import com.daria.pelekhata.diploma.service.ServiceService;
import com.daria.pelekhata.diploma.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class MainController {

    @Autowired
    private ServiceService serviceService;
    @Autowired
    private BookingService bookingService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        model.addAttribute("serviceType", serviceTypeService.readAll());
        model.addAttribute("services", serviceService.readAll());
        return "index";
    }
    @GetMapping("/shop")
    public String getShopPage(Model model) {
        return "shop";
    }

    @PostMapping("/bookService")
    public String bookService(@RequestParam ServiceItem serviceItem, @RequestParam String date, @RequestParam String time,
                              @RequestParam String name, @RequestParam String phone, Model model) {

        Booking serviceBooking = Booking.builder()
                .serviceItem(serviceItem)
                .date(date)
                .time(time)
                .name(name)
                .phone(phone)
                .build();

        bookingService.create(serviceBooking);

        model.addAttribute("showPopup", true);
        return "index";
    }
}
