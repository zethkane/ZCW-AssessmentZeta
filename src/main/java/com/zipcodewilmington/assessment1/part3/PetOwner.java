package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
     private static String petOwnerName;
     private ArrayList<Pet> list = new ArrayList<>();

    public PetOwner() {

    }

    public static String getPetOwnerName() {
        return petOwnerName;
    }

    public  static void setPetOwnerName(String petOwnerName) {
        PetOwner.petOwnerName = petOwnerName;
    }

    public ArrayList<Pet> getList() {
        return list;
    }

    public void setList(ArrayList<Pet> list) {
        this.list = list;
    }

    public PetOwner(String name, Pet... pets) {
        petOwnerName = name;
        if (pets != null){
            list.size();


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
