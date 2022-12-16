package com.example.ss4_bt_bai3.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;

public class MedicalDeclaration {
    private String name;
    private Integer yearOfBirth;
    private Boolean gender;
    private String nationality;
    private String nationalityId;
    private String transportVehicle;
    private String vehicleId;
    private String seatNo;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date endDate;
    private String visitedCity;
    private String cityOfAddress;
    private String districtOfAddress;
    private String wardOfAddress;
    private String livingOfAddress;
    private String phone;
    private String email;
    private ArrayList<String> symptom;
    private  Boolean visitDangerousPlaces;
    private  Boolean contactIllPerson;

    public MedicalDeclaration() {
    }

    public MedicalDeclaration(String name, Integer yearOfBirth, Boolean gender, String nationality, String nationalityId, String transportVehicle, String vehicleId, String seatNo, Date startDate, Date endDate, String visitedCity, String cityOfAddress, String districtOfAddress, String wardOfAddress, String livingOfAddress, String phone, String email, ArrayList<String> symptom, Boolean visitDangerousPlaces, Boolean contactIllPerson) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.nationalityId = nationalityId;
        this.transportVehicle = transportVehicle;
        this.vehicleId = vehicleId;
        this.seatNo = seatNo;
        this.startDate = startDate;
        this.endDate = endDate;
        this.visitedCity = visitedCity;
        this.cityOfAddress = cityOfAddress;
        this.districtOfAddress = districtOfAddress;
        this.wardOfAddress = wardOfAddress;
        this.livingOfAddress = livingOfAddress;
        this.phone = phone;
        this.email = email;
        this.symptom = symptom;
        this.visitDangerousPlaces = visitDangerousPlaces;
        this.contactIllPerson = contactIllPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getTransportVehicle() {
        return transportVehicle;
    }

    public void setTransportVehicle(String transportVehicle) {
        this.transportVehicle = transportVehicle;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getVisitedCity() {
        return visitedCity;
    }

    public void setVisitedCity(String visitedCity) {
        this.visitedCity = visitedCity;
    }

    public String getCityOfAddress() {
        return cityOfAddress;
    }

    public void setCityOfAddress(String cityOfAddress) {
        this.cityOfAddress = cityOfAddress;
    }

    public String getDistrictOfAddress() {
        return districtOfAddress;
    }

    public void setDistrictOfAddress(String districtOfAddress) {
        this.districtOfAddress = districtOfAddress;
    }

    public String getWardOfAddress() {
        return wardOfAddress;
    }

    public void setWardOfAddress(String wardOfAddress) {
        this.wardOfAddress = wardOfAddress;
    }

    public String getLivingOfAddress() {
        return livingOfAddress;
    }

    public void setLivingOfAddress(String livingOfAddress) {
        this.livingOfAddress = livingOfAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getSymptom() {
        return symptom;
    }

    public void setSymptom(ArrayList<String> symptom) {
        this.symptom = symptom;
    }

    public Boolean getVisitDangerousPlaces() {
        return visitDangerousPlaces;
    }

    public void setVisitDangerousPlaces(Boolean visitDangerousPlaces) {
        this.visitDangerousPlaces = visitDangerousPlaces;
    }

    public Boolean getContactIllPerson() {
        return contactIllPerson;
    }

    public void setContactIllPerson(Boolean contactIllPerson) {
        this.contactIllPerson = contactIllPerson;
    }
}
