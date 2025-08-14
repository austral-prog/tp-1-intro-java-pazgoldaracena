package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        ;
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int product = 1;
        for  (int i = 1; i <= n; i++ ) {
            product *= i;
        }
        return product;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        int chars = 0;
        for (int i = 0; i < input.length(); i++) {
            chars += 1;
        }
        return chars;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String reverse_string = "";
                for (int i = input.length() - 1; i >= 0; i--) {
                    reverse_string += input.charAt(i);
                }
        return reverse_string;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
       int sum = 0;
       for (int i = 0; i < array.length; i++ ) {
           sum += array[i];
       }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double converted = (celsius * 9/5) + 32;
        return converted;
    }
}
