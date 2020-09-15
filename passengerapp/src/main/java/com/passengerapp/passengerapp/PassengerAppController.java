package com.passengerapp.passengerapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PassengerAppController {

    @Autowired
    private PassengerAppService passengerAppService;


    @RequestMapping("/drivers")
    public List<Driver> getAllDrivers()
    {
        return passengerAppService.getAllDrivers();

    }

    @RequestMapping(method = RequestMethod.POST,value = "/createdriver")
    public ResponseDTO addDriver(@RequestBody Driver driver)
    {

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setId(passengerAppService.addDriver(driver));
        responseDTO.setStatus("SUCCESS");

        return responseDTO;


    }



    @RequestMapping("/getDistance")
    public List<Driver> getDistance(@RequestParam("latitude") Double latitude ,
                                    @RequestParam("longitude") Double longitude)
    {
        return passengerAppService.getDistance(latitude,longitude);

    }
}
