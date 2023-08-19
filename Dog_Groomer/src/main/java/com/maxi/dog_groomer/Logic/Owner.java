/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.dog_groomer.Logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Maxii
 */
@Entity
public class Owner implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_owner;
    private String name;
    private String telOwner;

    public Owner() {
    }

    public Owner(int id_owner, String name, String telOwner) {
        this.id_owner = id_owner;
        this.name = name;
        this.telOwner = telOwner;
    }

    public int getId_owner() {
        return id_owner;
    }

    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelOwner() {
        return telOwner;
    }

    public void setTelOwner(String telOwner) {
        this.telOwner = telOwner;
    }

    @Override
    public String toString() {
        return "Owner{" + "id_owner=" + id_owner + ", name=" + name + ", telOwner=" + telOwner + '}';
    }
    
    
    
    
}
