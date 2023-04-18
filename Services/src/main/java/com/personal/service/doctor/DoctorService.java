package com.personal.service.doctor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.domain.model.doctor.Doctor;
import com.personal.repository.dto.doctor.DoctorRepository;

@Service
public class DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@PostConstruct
	public void saveDoctor() {
		doctorRepository.saveAll(Stream
				.of(new Doctor(101, "Hello", "Surgen"), new Doctor(102, "Hi", "MBBS"), new Doctor(103, "y", "FCSP"))
				.collect(Collectors.toList()));
	}

	public List<Doctor> getAll() {
		return doctorRepository.findAll();
	}

}
