package com.example.g3.structure;

public class Address {

    String city;
    String wilaya;
    String code;

    public Address(String city, String wilaya, String code) {
        this.city = city;
        this.wilaya = wilaya;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWilaya() {
        return wilaya;
    }

    public void setWilaya(String wilaya) {
        wilaya = wilaya;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
