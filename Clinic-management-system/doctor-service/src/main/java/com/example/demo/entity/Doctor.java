package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	

	@Column(name = "doctorName", nullable = false)
	private String doctorName;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "specialization")
	private String specialization;
	
	@Column(name = "basicFees")
	private int basicFees;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "doc_id", referencedColumnName = "id")
	List<Patient> patients = new ArrayList<>();

	public Doctor() {
		super();
	}

	public Doctor(int id, String doctorName, String phone, String qualification, String experience, String address,
			String specialization, int basicFees) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.phone = phone;
		this.qualification = qualification;
		this.experience = experience;
		this.address = address;
		this.specialization = specialization;
		this.basicFees = basicFees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getBasicFees() {
		return basicFees;
	}

	public void setBasicFees(int basicFees) {
		this.basicFees = basicFees;
	}	
	
}
