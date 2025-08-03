package com.in.java8.imp.question;

public class OddEvenSeparator {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] oddNumbers = new int[numbers.length];
        int[] evenNumbers = new int[numbers.length];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[evenIndex++] = number;
            } else {
                oddNumbers[oddIndex++] = number;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
    }
}
