package com.greenfoxacademy.orientationexam.model;
import javax.persistence.Entity;

@Entity
public class Car {

    String plate;
    String car_brand;
    String car_model;
    String color;
    String year;

    public Car() {
    }

    public Car(String plate, String car_brand, String car_model, String color, String year) {
        this.plate = plate;
        this.car_brand = car_brand;
        this.car_model = car_model;
        this.color = color;
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
