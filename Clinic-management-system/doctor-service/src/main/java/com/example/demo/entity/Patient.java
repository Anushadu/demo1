package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;

	@Column(name = "patientName", nullable = false)
	private String patientName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "pPhone")
	private String pPhone;
	
	@Column(name = "pAddress")
	private String pAddress;
	
	
	public Patient() {
		super();
	}

	public Patient(int patientId, String patientName, String gender, int age, String pPhone, String pAddress) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.age = age;
		this.pPhone = pPhone;
		this.pAddress = pAddress;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPPhone() {
		return pPhone;
	}

	public void setPPhone(String pPhone) {
		this.pPhone = pPhone;
	}

	public String getPAddress() {
		return pAddress;
	}

	public void setPAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	
}
