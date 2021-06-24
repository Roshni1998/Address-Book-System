package com.bridgelabz;

public class ContactDetail {
    private  String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipNo;
    private String mobileNo;
    private String emailId;

    //Constructor
    public ContactDetail(String firstName, String lastName, String address, String city, String state, String zipNo, String mobileNo, String emailId  ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipNo = zipNo;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public ContactDetail() {

    }

    //Standard getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipNo() {
        return zipNo;
    }

    public void setZipNo(String zipNo) {
        this.zipNo = zipNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "Personal Details [ First Name = "+firstName+", Last Name = "+lastName+", Address = "+address+", City = "+city+", State = "+state+", Zip No. = "+zipNo+
                ", Mobile No. = "+mobileNo+", Email ID = "+emailId+ "]";
    }

}
