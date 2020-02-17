package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        setPetAge(age);
        setPetName(name);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        setPetAge(age);
        setPetName("Cat name");

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        setPetName(name);
        setPetAge(0);

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        setPetName("Cat name");
        setPetAge(0);

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }
}
