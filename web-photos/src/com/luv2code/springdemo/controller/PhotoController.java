package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.entity.Photo;
import com.luv2code.springdemo.service.PhotoService;

@Controller
@RequestMapping("/photo")
public class PhotoController {

	@Autowired
	private PhotoService photoService;

	@GetMapping("/list")
	public String listCustomers(Model model) {

		List<Photo> photos = photoService.getPhotos();

		model.addAttribute("photos", photos);

		return "photos-list";
	}

//	@GetMapping("/showFormForAdd")
//	public String showFormForAdd(Model model) {
//
//		// create model attribute to bind form data
//		Photo newCustomer = new Photo();
//
//		model.addAttribute("customer", newCustomer);
//
//		// save the customer using our service
//		customerService.saveCustomer(newCustomer);
//
//		return "customer-form";
//	}
//
//	@PostMapping("/saveCustomer")
//	public String saveCustomer(@ModelAttribute("customer") Photo newCustomer) {
//
//		customerService.saveCustomer(newCustomer);
//
//		return "redirect:/customer/list";
//	}
//
//	@GetMapping("/showFormForUpdate")
//	public String showFormForUpdate(@RequestParam("customerId") int id, Model model) {
//
//		// get the customer from db
//		Photo customer = customerService.getCustomer(id);
//
//		// set customer as a model attribute to pre-polulate the form
//		model.addAttribute("customer", customer);
//
//		return "customer-form";
//
//	}
//
//	@GetMapping("/delete")
//	public String deleteCustomer(@RequestParam("customerId") int id) {
//
//		customerService.deleteCustomer(id);
//
//		return "redirect:/customer/list";
//	}
//
//	@GetMapping("/search")
//	public String searchCustomer(@RequestParam("theSearchName") String theSearchName, Model model) {
//
//		List<Photo> customers = customerService.searchCustomers(theSearchName);
//		
//		model.addAttribute("customers", customers);
//		
//		return "list-customers";
//	}

}
