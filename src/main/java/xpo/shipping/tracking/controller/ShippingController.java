package xpo.shipping.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import xpo.shipping.tracking.dao.DataService;

@RestController
@RequestMapping(value="/home")
public class ShippingController {

	@Autowired
	private DataService dataService;
	
	 @RequestMapping(value="/login", method = RequestMethod.GET)
	public String smaple(){
		System.out.println("welcome");
		return dataService.getData("sme");
	}
}
