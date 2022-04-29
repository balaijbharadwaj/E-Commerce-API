package com.example.springapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderModel {


    public OrderModel(String orderId, String productName, int quantity, String totalPrice, String status, String price) {
        this.orderId = orderId;
//        this.userId = userId;
        this.productName = productName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
        this.price = price;
    }

    public OrderModel() {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Id
    private String orderId;
    @ManyToOne
    @JoinColumn(name = "email")
    private UserModel theUserModel;
//    private String userId;
    private String productName;
    private int quantity;
    private String totalPrice;
    private String status;
    private String price;
}
