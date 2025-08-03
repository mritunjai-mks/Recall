package com.in.ObjectClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    int rollNumber;

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(String firstName) {
        this.firstName = firstName;
    }

    Student(String firstName, int rollNumber) {
        this.firstName = firstName;
        this.rollNumber = rollNumber;
    }

//    public String toString(){
//        return firstName;
//    }


    @Override
    public int hashCode() {
        return 1;
    }


    public static void main(String[] arg) {
        Student student = new Student("Mritunjai");
        Student student1 = new Student("Mritunjai");
        System.out.println("The two agrument contructor : " + student);
        System.out.println("The one argument contructor : " + student1);
        System.out.println("Equal check :: " + student.equals(student1));
        if (student1 == student) {
            System.out.println("== return true");
        } else {
            System.out.println("== return false");
        }
        System.out.println("hasCode ");

        Student student2 = new Student("mritunjai", 223);
        Student student3 = new Student("sharma", 3434);
        Student student4 = new Student("mritunjai", 223);
        Student student5 = student2;
        System.out.println("First   check : :" + student2.equals(student3));
        System.out.println("Second  check : :" + student2.equals(student4));
        System.out.println("Third   check : :" + student2.equals(student5));

        String s1 = new String("mks");
        String s2 = new String("mks");
        String s3 = "mks";
        String s4 = "mks";
        System.out.println("1.String equal method :: " + s1.equals(s2));
        System.out.println("2.String == method      :: " + s1 == s2);

        System.out.println("3.String equal method :: " + s3.equals(s4));
        System.out.println("4.String == method      :: " + s3 == s4);

        StringBuffer s5 = new StringBuffer("mks");
        StringBuffer s6 = new StringBuffer("mks");

        System.out.println("StringBuffer equal method :: " + s5.equals(s6));
        if (s5 == s6) {
            System.out.println("StringBuffer == method      :: " + true);
        } else {
            System.out.println("StringBuffer == method      :: " + false);
        }

        Student student6 = new Student("mks", 342);
        Class c = student6.getClass();
        System.out.println("class name :: " + c);
        Field[] f = c.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field fildResult : f) {
            arrayList.add(fildResult);
        }
        Constructor[] constructor = c.getDeclaredConstructors();
        for (Constructor conResult : constructor) {
            arrayList.add(conResult);
        }
        System.out.println("Total field and constuctor ::  " + arrayList);

        String unique = "check";
        System.out.println("String listernal :: " + unique.intern());


        String s9=new String("Mks");
        s9=s9.concat("famous");
        String s10=s1.concat("add");
        String sFinal=s9.concat("Sharma");
        System.out.println("Final s9 : : "+s9);
        System.out.println("Final s10 : : "+s10);
        System.out.println("Final sFinal : : "+sFinal);

        String si="Mks";
                si.concat("famout");
        System.out.println("String si final : : "+si);
    }

}
