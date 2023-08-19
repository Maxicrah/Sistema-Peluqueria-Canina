/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.dog_groomer.Logic;

import com.maxi.dog_groomer.Persistance.ControllerPersistance;
import java.util.List;

/**
 *
 * @author Maxii
 */
public class Controller {
    
    ControllerPersistance controlPersis = new ControllerPersistance();

    public void save(String namePet, String breed, String color, String obs, String nameOwner, String telOwner, String alergic, String specialAttention) {
        
        //creamos dueño y asignamos sus valores
        Owner owner = new Owner();
        owner.setName(nameOwner);
        owner.setTelOwner(telOwner);
        //creamos mascota y asignamos sus valores
        Pet pet = new Pet();
        pet.setName(namePet);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAlergic(alergic);
        pet.setSpecial_attention(specialAttention);
        pet.setObservation(obs);
        pet.setOneOwner(owner);
        
        controlPersis.save(owner,pet);
        
    }

    public List<Pet> bringPets() {
        
       return controlPersis.bringPets();
    }

    public void deletePet(int num_cliente) {
        
        controlPersis.deletePet(num_cliente);
    }

    public Pet traerPet(int num_cliente) {
        return controlPersis.traerPet(num_cliente);
        }

    public void editPet(Pet pet, String namePet, String breed, String color, String obs, String nameOwner, String telOwner, String alergic, String specialAttention) {
    
        pet.setName(namePet);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setObservation(obs);
        pet.setSpecial_attention(specialAttention);
        pet.setAlergic(alergic);
        
        //modifico mascota
        controlPersis.editPet(pet);
        //seteo valores duenio
        Owner owner = this.findOwner(pet.getOneOwner().getId_owner());
        
        owner.setName(nameOwner);
        owner.setTelOwner(telOwner);
        
        //llamar modificar duenio
        this.modificarDuenio(owner);
        
    }

    private Owner findOwner(int id_owner) {
        
        return controlPersis.findOwner(id_owner);
    }

    private void modificarDuenio(Owner owner) {
        controlPersis.modificarDuenio(owner);
    }

   
    
    
}
