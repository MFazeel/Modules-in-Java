package com.personal.repository.dto.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personal.domain.model.doctor.Doctor;

public interface DoctorRepository  extends JpaRepository<Doctor, Integer>{

}
