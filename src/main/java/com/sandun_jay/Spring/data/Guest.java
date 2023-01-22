package com.sandun_jay.Spring.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "GUEST_ID")
    private long guestId;
    @Column (name = "FIRST_NAME")
    private String fName;
    @Column (name = "LAST_NAME")
    private String lName;
    @Column (name = "EMAIL_ADDRESS")
    private String email;
    @Column (name = "ADDRESS")
    private String address;
    @Column (name = "COUNTRY")
    private String country;
    @Column (name = "STATE")
    private String state;
    @Column (name = "PHONE_NUMBER")
    private String phoneNumber;

    public long getgId() {
        return guestId;
    }

    public void setgId(long gId) {
        this.guestId = gId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "gId=" + guestId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
