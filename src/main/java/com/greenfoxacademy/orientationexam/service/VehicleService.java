package com.greenfoxacademy.orientationexam.service;
import com.greenfoxacademy.orientationexam.model.LicencePlates;
import com.greenfoxacademy.orientationexam.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

}
