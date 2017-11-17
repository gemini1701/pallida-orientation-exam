package com.greenfoxacademy.orientationexam.controller;
import com.greenfoxacademy.orientationexam.model.LicencePlates;
import com.greenfoxacademy.orientationexam.repository.VehicleRepository;
import com.greenfoxacademy.orientationexam.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class MainController {

    @Autowired
    VehicleRepository vehicleRepo;

    @Autowired
    VehicleService vehicle;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<VehicleRepository> getCarByLicence(@PathVariable String plate, Model model){
        List<VehicleRepository> match = new ArrayList<>();

        for (int i = 0; i < vehicleRepo.count(); i++) {
            if ()
        }
        }
    }

}
