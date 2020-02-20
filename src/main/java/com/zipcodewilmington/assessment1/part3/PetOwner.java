package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
     private String petOwnerName;
     private ArrayList<Pet> list = new ArrayList<>();

    public PetOwner() {

    }

    public String getPetOwnerName() {
        return petOwnerName;
    }

    public void setPetOwnerName(String petOwnerName) {
        this.petOwnerName = petOwnerName;
    }

    public ArrayList<Pet> getList() {
        return list;
    }

    public void setList(ArrayList<Pet> list) {
        this.list = list;
    }

    public PetOwner(String name, Pet... pets) {
       this.petOwnerName = name;
       this.list = new ArrayList();
       if( pets != null)
       {
        for(Pet p: pets)
        {
           p.setOwner(this);
           this.list.add(p);
        }
       }


    }


    public void addPet(Pet pet) {
        list.add(pet);
    }

    public void removePet(Pet pet) {
        list.size();
        list.remove(pet);
    }

    public Boolean isOwnerOf(Pet pet) {
        return null;
    }

    public Integer getYoungetPetAge() {
        return null;
    }

    public Integer getOldestPetAge() {
        return null;
    }

    public Float getAveragePetAge() {
        return null;
    }

    public Integer getNumberOfPets() {
        return list.size();
    }

    public String getName() {
        return this.petOwnerName;
    }


    public Pet[] getPets() {

        return null;
    }
}
