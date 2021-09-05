package com.javalearn.integration.jdbc;

import java.io.Serializable;

public class Book implements Serializable{
	String title;
    Double price;

    Book(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    Double getPrice() {
        return price;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("{title: %s, price: %s}", title, price);
    }
  }
