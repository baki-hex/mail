package com.example.demo;

import org.springframework.beans.factory.annotation.Value;


public class Car {
    
    public Engn engn;
     @Value("${server.port}")
	 String val;

    public Car(Engn engn){
        this.engn=engn;
        System.out.println(val);
       
    }
    public void setEngn(Engn engn){
        this.engn = engn;
    }
    public Engn getEngn(){
        return engn;
    }

    public String ret(){
        return engn.name;
    }
}
