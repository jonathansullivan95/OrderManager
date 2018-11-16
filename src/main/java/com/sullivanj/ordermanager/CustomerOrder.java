package com.sullivanj.ordermanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private int productId;

    private String buyerName;

    public CustomerOrder() {

    }

    public CustomerOrder(int productId, String buyerName) {
        this.productId = productId;
        this.buyerName = buyerName;
    }

    public void setProductId(int id){
        this.productId = id;
    }
    public int getProductId(){
        return productId;
    }
    public void setBuyerName(String buyerName){
        this.buyerName = buyerName;
    }
    public String getBuyerName(){
        return buyerName;
    }
}
