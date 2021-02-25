package com.company;

public class AutoProduction {
    private String country;
    private String companyName;
    private String address;
    private int number;

    public AutoProduction(String country, String companyName, String address, int number) {
        this.country = country;
        this.companyName = companyName;
        this.address = address;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
}
