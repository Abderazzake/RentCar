package com.project.rentcar.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.rentcar.models.Vehicle;
import com.project.rentcar.services.EmployeeService;
import com.project.rentcar.services.LocationService;
import com.project.rentcar.services.VehicleMakeService;
import com.project.rentcar.services.VehicleModelService;
import com.project.rentcar.services.VehicleService;
import com.project.rentcar.services.VehicleStatusService;
import com.project.rentcar.services.VehicleTypeService;

@Controller
public class VehicleController {
	
	@Autowired private VehicleService vehicleService;
	@Autowired private VehicleTypeService vehicleTypeService;
	@Autowired private VehicleMakeService vehicleMakeService;
	@Autowired private VehicleModelService vehicleModelService;
	@Autowired private LocationService locationService;
	@Autowired private EmployeeService employeeService ;
	@Autowired private VehicleStatusService vehicleStatusService;


	//Get All Vehicles
	@GetMapping("vehicles")
	public String findAll(Model model){		
		model.addAttribute("vehicles", vehicleService.findAll());
		model.addAttribute("vehicleTypes", vehicleTypeService.findAll());
		model.addAttribute("vehicleModels", vehicleModelService.findAll());
		model.addAttribute("vehicleMakes", vehicleMakeService.findAll());
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("employees", employeeService.findAll());
		model.addAttribute("vehicleStatuses", vehicleStatusService.findAll());

		return "vehicle";
	}	
	
	@RequestMapping("vehicles/findById") 
	@ResponseBody
	public Optional<Vehicle> findById(Integer id)
	{
		return vehicleService.findById(id);
	}
	
	//Add Vehicle
	@PostMapping(value="vehicles/addNew")
	public String addNew(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}	
	
	@RequestMapping(value="vehicles/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}
	
	@RequestMapping(value="vehicles/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		vehicleService.delete(id);
		return "redirect:/vehicles";
	}
}
