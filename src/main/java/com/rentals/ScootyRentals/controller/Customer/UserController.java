package com.rentals.ScootyRentals.controller.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentals.ScootyRentals.Station.Outlet;

@RestController
public class UserController {

	@Autowired
	Outlet outlet;

	@RequestMapping(value = "/search/station")
	String getNearByStation(@RequestParam("x") String myVariable, @RequestParam("y") String myVariable2) {
		
		return outlet.getNearByAvailableStation(myVariable, myVariable2);

	}

}
