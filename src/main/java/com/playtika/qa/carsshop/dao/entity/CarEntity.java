package com.playtika.qa.carsshop.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT")
    private long id;

    @Column(unique = true, nullable = false, length = 25)
    private String plate_number;

    @Column(nullable = false, length = 50)
    private String model;

    @Column(nullable = false)
    @Check(constraints = "year >= 1900")
    private int year;

    @Column(length = 50)
    private String color;

    public CarEntity(String plate_number, String model, int year, String color) {
        this.plate_number = plate_number;
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
