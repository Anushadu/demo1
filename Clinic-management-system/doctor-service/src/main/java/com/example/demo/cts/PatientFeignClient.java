package com.example.demo.cts;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Patient;

import feign.Headers;

@Headers("Content-Type: application/json")

@FeignClient(name = "patient-service", url = "${DOCTOR_SERVICE:http://localhost:9196}")
//@FeignClient(name = "patient-service")
public interface PatientFeignClient {
	@GetMapping("/api/patient/doctor/{doctorId}")
	List<Patient> getPatientByDoctorId(@PathVariable("doctorId") long doctorId);
}

