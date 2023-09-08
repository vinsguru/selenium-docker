package com.vinsguru.tests.vendorportal.model;

public record VendorPortalTestData(String username,
                                   String password,
                                   String monthlyEarning,
                                   String annualEarning,
                                   String profitMargin,
                                   String availableInventory,
                                   String searchKeyword,
                                   int searchResultsCount) {
}

/*
public class VendorPortalTestData {

    private String username;
    private String password;
    private String monthlyEarning;
    private String annualEarning;
    private String profitMargin;
    private String availableInventory;
    private String searchKeyword;
    private int searchResultsCount;

    public VendorPortalTestData() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMonthlyEarning() {
        return monthlyEarning;
    }

    public void setMonthlyEarning(String monthlyEarning) {
        this.monthlyEarning = monthlyEarning;
    }

    public String getAnnualEarning() {
        return annualEarning;
    }

    public void setAnnualEarning(String annualEarning) {
        this.annualEarning = annualEarning;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getAvailableInventory() {
        return availableInventory;
    }

    public void setAvailableInventory(String availableInventory) {
        this.availableInventory = availableInventory;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public int getSearchResultsCount() {
        return searchResultsCount;
    }

    public void setSearchResultsCount(int searchResultsCount) {
        this.searchResultsCount = searchResultsCount;
    }
}
*/