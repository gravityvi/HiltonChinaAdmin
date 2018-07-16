package com.example.ravi.hiltonadmin1;

public class Order {
    String orderId;
    String userName;
    String address;
    String paid;
    String Phone;
    String PaymentType;
    String Progress;
    String registrationToken;

    public Order(String orderId, String userName, String address, String paid, String phone, String paymentType, String progress,String registrationToken) {
        this.orderId = orderId;
        this.userName = userName;
        this.address = address;
        this.paid = paid;
        Phone = phone;
        PaymentType = paymentType;
        Progress = progress;
        this.registrationToken = registrationToken;
    }

    public String getRegistrationToken() {
        return registrationToken;
    }

    public void setRegistrationToken(String registrationToken) {
        this.registrationToken = registrationToken;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public String getPhone() {
        return Phone;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public String getProgress() {
        return Progress;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getPaid() {
        return paid;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }
}
