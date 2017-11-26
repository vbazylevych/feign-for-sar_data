package com.playtika.qa.carsshop.service;

import com.playtika.qa.carsshop.domain.CarInStore;
import java.util.Optional;
import java.util.Collection;


public interface CarServiceRepository {

    CarInStore add(CarInStore carInStore);

    Optional<CarInStore> get(Integer id);

    Collection<CarInStore> getAll();

    Boolean delete(Integer id);
}
