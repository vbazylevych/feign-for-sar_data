package com.playtika.qa.carsshop.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarEntityRepository extends JpaRepository<CarEntity, Long> {

    List<CarEntity> findByPlateNumber(String s);
    void deleteById(Long id);

}
