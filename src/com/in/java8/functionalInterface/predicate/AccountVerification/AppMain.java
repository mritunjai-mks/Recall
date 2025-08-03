package com.in.java8.functionalInterface.predicate.AccountVerification;

import java.util.Scanner;
import java.util.function.Predicate;

public class AppMain {
    public static void main(String arg[]) {
        Predicate<User> p = user -> user.userName.equalsIgnoreCase("mksmritunjai") && user.password.equalsIgnoreCase("test");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter userName :: ");
        String userName = sc.nextLine();
        System.out.println("Enter password :: ");
        String password = sc.nextLine();
        User user = new User(userName, password);

        while (!p.test(user)) {
            System.out.println("Invalid UserName or password. Try again.");
            System.out.print("Enter userName: ");
            userName = sc.nextLine();
            System.out.print("Enter password: ");
            password = sc.nextLine();
            user = new User(userName, password);
        }

        System.out.println("Valid User. Welcome!");

    }
}
