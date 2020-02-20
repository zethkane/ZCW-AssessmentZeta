package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    private String petName;
    private Integer petAge;
    private PetOwner owner;

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Integer getPetAge() {
        return petAge;
    }

    public void setPetAge(Integer petAge) {
        this.petAge = petAge;
    }

    public Pet() {
        String name = "";
        Integer age = 0;
    }

    public Pet(String name) {
        this.petName = name;
    }


    public Pet(int age) {
        this.petAge = age;
    }


    public Pet(String name, int age) {
        this.petName = name;
        this.petAge = age;
    }


    public String getName() {

        return petName;
    }


    public Integer getAge() {
        return petAge;
    }


    public void setOwner(PetOwner newPetOwner) {
        owner = newPetOwner;
    }

    public PetOwner getOwner() {
        return owner;
    }
}
