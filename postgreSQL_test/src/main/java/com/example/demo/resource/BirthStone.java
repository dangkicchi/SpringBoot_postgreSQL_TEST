package com.example.demo.resource;

import java.io.Serializable;

public class BirthStone implements Serializable {

    private static final long serialVersionUID = 1L;

    private String month;

    private String name;

    private String color;

    public BirthStone (String month, String name, String color) {
        this.month = month;
        this.name = name;
        this.color = color;
    }

    // getter/setter
    public String getMonth () {
    	return this.month;
    }
    
    public void setMonth (String month) {
    	this.month = month;
    }
    
    public String getName () {
    	return this.name;
    }
    
    public void setName (String name) {
    	this.name = name;
    }
    
    public String getColor () {
    	return this.color;
    }
    
    public void setColor (String color) {
    	this.color = color;
    }
}

