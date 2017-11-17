package com.greenfoxacademy.orientationexam.repository;
import com.greenfoxacademy.orientationexam.model.LicencePlates;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<LicencePlates,Long>{
}
