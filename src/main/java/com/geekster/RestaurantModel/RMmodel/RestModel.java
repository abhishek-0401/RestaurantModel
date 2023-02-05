package com.geekster.RestaurantModel.RMmodel;

public class RestModel {
        private int restaurantId;
        private String name;
        private String address;
        private long number;
        private String speciality;
        private int totalStaff;
        RestModel(){}

    public RestModel(int restaurantId, String name, String address, long number, String speciality, int totalStaff) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    @Override
    public String toString() {
        return "RestModel{" +
                "restaurantId=" + restaurantId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", speciality='" + speciality + '\'' +
                ", totalStaff=" + totalStaff +
                '}';
    }
}
