package com.example.shalevifrach.aquasensebeta;

import java.util.Date;

/**
 * Created by shalevifrach on 04/06/2017.
 */

public class Mission {
    String customer;
    String[] items;
    Date date;

    public Mission(String customer, String[] items, Date date) {
        this.customer = customer;
        this.items = items;
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
