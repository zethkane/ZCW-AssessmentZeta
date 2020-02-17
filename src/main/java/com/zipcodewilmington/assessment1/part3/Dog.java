package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        setPetName(name);
        setPetAge(age);

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        setPetAge(age);
        setPetName("Dog name");
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        setPetName(name);
        setPetAge(0);

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        setPetName("Dog name");
        setPetAge(0);
    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
