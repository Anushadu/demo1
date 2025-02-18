package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepository;

@Service
public class DoctorService implements IDoctorService {

	private final Logger logger = LoggerFactory.getLogger(DoctorService.class);

	@Autowired
	DoctorRepository doctorRepo;

	@Override
	public List<Doctor> getDoctorsFromDatabase() {
		logger.info("Fetching all doctors...");
		return doctorRepo.findAll();
	}

	@Override
	public Optional<Doctor> getDoctorById(int id) {
		return doctorRepo.findById(id);
	}

	@Override
	public void deleteDoctorById(int id) {
		doctorRepo.deleteById(id);
	}

	@Override
	public Doctor createDoctor(@Validated Doctor newDoctor) {
		return doctorRepo.save(newDoctor);
	}

	@Override
	public ResponseEntity<Doctor> updateDoctor(Integer doctorId, @Validated Doctor newDoctor) {
		Optional<Doctor> existingDoctor = doctorRepo.findById(doctorId);
		existingDoctor.ifPresent(doctor -> {
			doctor.setDoctorName(newDoctor.getDoctorName());
			doctorRepo.save(doctor);
		});
		return ResponseEntity.of(existingDoctor);
	}
}

