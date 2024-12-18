package com.example.jsondatabinding.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerModel {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private int age;
   

    
   @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
   public CustomerModel(@JsonProperty("id") Long ids,@JsonProperty("name") String names,@JsonProperty("email") String emails,@JsonProperty("phone") String phones,@JsonProperty("age") int ages)
    {
    	ids=id;
    	names=name;
    	emails=email;
    	phones=phone;
    	ages=age;
    	
    	
    	
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

}

