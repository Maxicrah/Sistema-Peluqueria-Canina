/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.dog_groomer.Persistance;

import com.maxi.dog_groomer.Logic.Owner;
import com.maxi.dog_groomer.Logic.Pet;
import com.maxi.dog_groomer.Persistance.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maxii
 */
public class ControllerPersistance {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        //crear en la BD dueño
        ownerJpa.create(owner);
        //crear mascota en la BD
        petJpa.create(pet);
    }

    public List<Pet> bringPets() {
        
        return petJpa.findPetEntities();
        
    }

    public void deletePet(int num_cliente) {
        
        try {
            petJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistance.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Pet traerPet(int num_cliente) {
      return  petJpa.findPet(num_cliente);
    }

    public void editPet(Pet pet) {
        
        try {
            petJpa.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Owner findOwner(int id_owner) {
            return ownerJpa.findOwner(id_owner);
        }

    public void modificarDuenio(Owner owner) {
        
        try {
            ownerJpa.edit(owner);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
