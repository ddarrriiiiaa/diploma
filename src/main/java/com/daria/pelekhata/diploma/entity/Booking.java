package com.daria.pelekhata.diploma.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Builder
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "id_service", referencedColumnName = "service_id")
    private ServiceItem serviceItem;

    @Column(name = "time")
    private String time;

    @Column(name = "name")
    private String name;

    @Column(name = "phone")
    private String phone;

    public Booking() {
    }
}
