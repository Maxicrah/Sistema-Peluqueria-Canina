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
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int num_client;
    private String name;
    private String breed;
    private String color;
    private String alergic;
    private String special_attention;
    private String observation;
    @OneToOne
    private Owner oneOwner;

    public Pet() {
    }

    public Pet(int num_client, String name, String breed, String color, String alergic, String special_attention, String observation, Owner oneOwner) {
        this.num_client = num_client;
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.alergic = alergic;
        this.special_attention = special_attention;
        this.observation = observation;
        this.oneOwner = oneOwner;
    }

    public int getNum_client() {
        return num_client;
    }

    public void setNum_client(int num_client) {
        this.num_client = num_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergic() {
        return alergic;
    }

    public void setAlergic(String alergic) {
        this.alergic = alergic;
    }

    public String getSpecial_attention() {
        return special_attention;
    }

    public void setSpecial_attention(String special_attention) {
        this.special_attention = special_attention;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Owner getOneOwner() {
        return oneOwner;
    }

    public void setOneOwner(Owner oneOwner) {
        this.oneOwner = oneOwner;
    }

    @Override
    public String toString() {
        return "Pet{" + "num_client=" + num_client + ", name=" + name + ", breed=" + breed + ", color=" + color + ", alergic=" + alergic + ", special_attention=" + special_attention + ", observation=" + observation + ", oneOwner=" + oneOwner + '}';
    }
    
    
}
