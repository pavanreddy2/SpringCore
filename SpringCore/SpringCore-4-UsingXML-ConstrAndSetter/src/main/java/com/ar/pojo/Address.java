package com.ar.pojo;

public class Address {
    private int houseNo;
    private String street;
    private String city;

    public Address(int houseNo, String street, String city) {
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo=" + houseNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    /*public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
*/
    public void addressDetails() {
        System.out.println("HouseNo "+ houseNo);
        System.out.println("street "+ street);
        System.out.println("City "+ city);
    }
}
