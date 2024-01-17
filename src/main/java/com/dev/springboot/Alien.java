package com.dev.springboot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // helps to create more than one object using getBean
public class Alien {
    private int aid;
    private String aname;

    public Alien(){
        System.out.println("Object");
    }
       // Getter for aid
    public int getAid() {
        return aid;
    }

    // Setter for aid
    public void setAid(int aid) {
        this.aid = aid;
    }

    // Getter for aname
    public String getAname() {
        return aname;
    }

    // Setter for aname
    public void setAname(String aname) {
        this.aname = aname;
    }

    public void show(){
        System.out.println("In the Show");
    }

}
