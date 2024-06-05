package com.example.dbpmkk.Domain;

import jakarta.persistence.*;


@Entity
@Table(name="support")
public class PolicyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Business_number")
    private int businessNumber;

    @Column(name = "Business_classification")
    private String businessClassification;

    @Column(name = "Business_details")
    private String businessDetails;

    @Column(name = "Business_name")
    private String businessName;

    @Column(name = "Business_support_budget")
    private String businessSupportBudget;

    @Column(name = "Business_support_organization_name")
    private String businessSupportOrganizationName;



    // Getters and setters
    public int getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(int businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getBusinessClassification() {
        return businessClassification;
    }

    public void setBusinessClassification(String businessClassification) {
        this.businessClassification = businessClassification;
    }

    public String getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(String businessDetails) {
        this.businessDetails = businessDetails;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessSupportBudget() {
        return businessSupportBudget;
    }

    public void setBusinessSupportBudget(String businessSupportBudget) {
        this.businessSupportBudget = businessSupportBudget;
    }

    public String getBusinessSupportOrganizationName() {
        return businessSupportOrganizationName;
    }

    public void setBusinessSupportOrganizationName(String businessSupportOrganizationName) {
        this.businessSupportOrganizationName = businessSupportOrganizationName;
    }
}