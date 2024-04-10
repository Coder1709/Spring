package org.example.pojo;

import java.util.List;
import java.util.Set;

public class CustomerQ3 {

    private int customerId;

    private String customerName;

    private double monthlyIncome;

    private String profession;

    private String designation;

    private String companyName;

    List<String> phoneNumber;

    Set<String> emailAddress;

    public CustomerQ3() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<String> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Set<String> emailAddress) {
        this.emailAddress = emailAddress;
    }
}
