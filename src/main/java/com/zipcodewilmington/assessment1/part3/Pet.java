package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    private String petName;
    private Integer petAge;

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

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     */
    public Pet() {
        String name = "";
        Integer age = 0;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.petName = name;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.petAge = age;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.petName = name;
        this.petAge = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {

        return petName;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return petAge;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        PetOwner name = new PetOwner(getName());

    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return null;
    }
}
