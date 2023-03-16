package com.rentals.ScootyRentals.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentals.ScootyRentals.Station.Location;
import com.rentals.ScootyRentals.Station.Outlet;

@RestController
public class ScootyController {
	
	@Autowired
	Outlet outlet;
	
	@RequestMapping(value = "/stations")
	Map<String, Location> getAvailableStations(){
		return outlet.getAvailableStations();
	}

}
