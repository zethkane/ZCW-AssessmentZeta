package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer count = 0;
        for (int i = 0; i <= input.length(); i++) {
            for(int j = i + 1; j <= input.length(); j++){
                String checker = input.substring(i,j);
                String reversed = new StringBuilder(checker).reverse().toString();
                if (checker.equals(reversed)){
                    count++;
                }
            }

        }
        return count;
    }
}
