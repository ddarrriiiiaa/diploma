package com.daria.pelekhata.diploma.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Entity
@Table(name = "service")
public class ServiceItem {

    @Id
    @Column(name="service_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="service_name")
    private String name;

//    @Column(name="category_id")
    @ManyToOne
    @JoinColumn(name = "service_category_id", referencedColumnName = "category_id")
    private ServiceType categoryId;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="max_price")
    private BigDecimal maxPrice;

    @Column(name="time")
    private Integer timeInMinutes;

}
