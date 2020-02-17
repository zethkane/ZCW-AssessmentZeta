package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            count++;
        }
        return count;
    }
}
