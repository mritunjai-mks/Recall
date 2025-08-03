package com.in.java8.functionalInterface.predicate.PubAllowedMember;

public class SoftwareEng {
    String firstName;
    int age;
    boolean isheavingGf;

    public SoftwareEng( int age, boolean isheavingGf) {
       // this.firstName = firstName;
        this.age = age;
        this.isheavingGf = isheavingGf;
    }


    @Override
    public String toString() {
        return "SoftwareEng{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", isheavingGf=" + isheavingGf +
                '}';
    }
}
