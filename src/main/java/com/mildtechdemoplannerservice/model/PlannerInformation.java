package com.mildtechdemoplannerservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlannerInformation extends BaseResponse {
    private PlannerPersonalDetails personalDetails;

    public PlannerPersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PlannerPersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
}
