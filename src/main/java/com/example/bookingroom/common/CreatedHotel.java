package com.example.bookingroom.common;

public class CreatedHotel {

    private String name;
    private String address;
    private String image;

    public CreatedHotel() {
    }

    public CreatedHotel(String name, String address, String image) {
        this.name = name;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
