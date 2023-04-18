package com.personal.controller.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.domain.model.doctor.Doctor;
import com.personal.service.doctor.DoctorService;

@RestController
public class DoctorController {

	@Autowired
	public DoctorService doctorService;
	
	@GetMapping("/doctors")
	public List<Doctor> getAll(){
		return doctorService.getAll();
	}
	
}
