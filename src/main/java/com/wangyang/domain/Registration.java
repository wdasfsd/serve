package com.wangyang.domain;

import lombok.Data;


import java.util.Date;
@Data
public class Registration {
    private Integer patientId;
    private String name;
    private String idCardNumber;
    private Date birthDate;
    private String gender;
    private String maritalStatus;
    private String contactPhone;
    private String address;
    private String purpose;
    private String department;
    private String doctorName;
    private Date appointmentTime;
    private String insuranceCardNumber;
    private String insuranceType;
    private String allergyDescription;
    private String paymentMethod;
    private String settlementMethod;
    private String emergencyContactName;
    private String emergencyContactPhone;
    private String relationship;
    private String symptomDescription;
    private String state;

    public Registration() {
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Date getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getInsuranceCardNumber() {
        return insuranceCardNumber;
    }

    public void setInsuranceCardNumber(String insuranceCardNumber) {
        this.insuranceCardNumber = insuranceCardNumber;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getAllergyDescription() {
        return allergyDescription;
    }

    public void setAllergyDescription(String allergyDescription) {
        this.allergyDescription = allergyDescription;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getSettlementMethod() {
        return settlementMethod;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getSymptomDescription() {
        return symptomDescription;
    }

    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Registration(Integer patientId, String name, String idCardNumber, Date birthDate, String gender, String maritalStatus, String contactPhone, String address, String purpose, String department, String doctorName, Date appointmentTime, String insuranceCardNumber, String insuranceType, String allergyDescription, String paymentMethod, String settlementMethod, String emergencyContactName, String emergencyContactPhone, String relationship, String symptomDescription, String state) {
        this.patientId = patientId;
        this.name = name;
        this.idCardNumber = idCardNumber;
        this.birthDate = birthDate;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.contactPhone = contactPhone;
        this.address = address;
        this.purpose = purpose;
        this.department = department;
        this.doctorName = doctorName;
        this.appointmentTime = appointmentTime;
        this.insuranceCardNumber = insuranceCardNumber;
        this.insuranceType = insuranceType;
        this.allergyDescription = allergyDescription;
        this.paymentMethod = paymentMethod;
        this.settlementMethod = settlementMethod;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
        this.relationship = relationship;
        this.symptomDescription = symptomDescription;
        this.state = state;
    }
}
