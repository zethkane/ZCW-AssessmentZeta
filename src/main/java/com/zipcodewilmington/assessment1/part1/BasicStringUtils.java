package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String toCamalCase;
        toCamalCase = str.substring(0, 1).toUpperCase() + str.substring(1);
        return toCamalCase;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String toReverse = new StringBuilder(str).reverse().toString();

        return toReverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String toReverse = new StringBuilder(str).reverse().toString();
        String toCamalCase = toReverse.substring(0, 1).toUpperCase() + toReverse.substring(1);
        return toCamalCase;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder toRemove = new StringBuilder(str);
        toRemove.deleteCharAt(0).deleteCharAt(toRemove.length()-1);
        String finalString = "";
        finalString += toRemove;
        return finalString;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] invertCasing = str.toCharArray();
        for (int i = 0; i < invertCasing.length; i++) {
            char c = invertCasing[i];
            if (Character.isUpperCase(c))
            {
             invertCasing[i]= Character.toLowerCase(c);
            }
            if (Character.isLowerCase(c))
            {
                invertCasing[i] = Character.toUpperCase(c);
            }
        }
        return new String(invertCasing);
    }
}
