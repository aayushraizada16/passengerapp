package com.passengerapp.passengerapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PassengerAppService {

  @Autowired
    private DriverRepository driverRepository;


    // Function for getting all drivers from db
    public List<Driver> getAllDrivers(){

        List<Driver> drivers = new ArrayList<>();
        driverRepository.findAll().forEach(drivers::add);
        return drivers;
    }


    // Function for adding new driver
    public Integer addDriver (Driver driver)
    {
        Driver drivernew = driverRepository.save(driver);

        return drivernew.getId();
    }


    //Function to get nearest drivers list
    public List<Driver> getDistance (Double cust_latitude, Double cust_longitude )
    {
        List<Driver> drivers = new ArrayList<>();

        driverRepository.findAll().forEach(driver -> {
            if (distance(cust_latitude, driver.getLatitude(), cust_longitude, driver.getLongitude()))
            {
                drivers.add(driver);
            }
        });


        return drivers;
    }

    //function to calculate distance between 2 coordinates
    public static boolean distance(double lat1,
                                   double lat2, double lon1,
                                   double lon2)
    {

        // The math module contains a function
        // named toRadians which converts from
        // degrees to radians.
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);

        // Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                + Math.cos(lat1) * Math.cos(lat2)
                * Math.pow(Math.sin(dlon / 2),2);

        double c = 2 * Math.asin(Math.sqrt(a));

        // Radius of earth in kilometers.
        double r = 6371;

        // calculate the result and return boolean if the drivers in 200m range

        if (c*r < 0.2)
            return true;
        return false;


    }



}
