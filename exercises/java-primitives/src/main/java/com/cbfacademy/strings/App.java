package com.cbfacademy.strings;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Concatenate the three input strings and return the result
        return word1 + word2 + word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Determine whether the two input strings are equal
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        // Format the string as "Item: [item]. Price: £[price]. Quantity: [quantity]"
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
    }
}
