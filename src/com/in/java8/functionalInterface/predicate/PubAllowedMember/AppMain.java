package com.in.java8.functionalInterface.predicate.PubAllowedMember;

import java.util.Scanner;
import java.util.function.Predicate;

public class AppMain {
    public static void main(String[] arg){
        Predicate<SoftwareEng> allowed = softwareEng -> softwareEng.age>18 && softwareEng.isheavingGf;

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the firstName :: " );
        String firstName=sc.nextLine();
        System.out.println("Please enter the age :: " );
        int age= Integer.parseInt(sc.nextLine());
        System.out.println("Please if have GF :: " );
        boolean isHeavingGf= Boolean.parseBoolean(sc.nextLine());

        SoftwareEng softwareEng=new SoftwareEng(age,isHeavingGf);
        while(!allowed.test(softwareEng)){
            System.out.println("Please enter the age :: " );
            age= Integer.parseInt(sc.nextLine());
            System.out.println("Please if have GF :: " );
            isHeavingGf= Boolean.parseBoolean(sc.nextLine());
            softwareEng=new SoftwareEng(age,isHeavingGf);
        }
        System.out.println("Welcome to PUB " +firstName + " With your GF ");

    }
}
