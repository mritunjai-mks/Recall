package com.in.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class AppList {
    public static void main(String[] arg){
        //List --> LinkList, ArrayList, Vector-->Stack
        LinkedList ll=new LinkedList();
        ll.add("M");
        ll.add("A");
        ll.add(null);
        ll.add("C");
        ll.add(2);
        ll.add("Z");
        ll.add(null);
        ll.add("A");
        System.out.println("LinkedList ::"+ll+ " :: size: : "+ll.size());

        ArrayList al=new ArrayList();
        al.add("M");
        al.add("A");
        al.add(null);
        al.add("C");
        al.add(2);
        al.add("Z");
        al.add(null);
        al.add("A");
        System.out.println("ArrayList ::"+al+ " :: size: : "+al.size());

        //Cursor 1)Enurator 2)Iterator 3)ListIterator
        Vector v=new Vector();
        for(int i=0;i<=20;i++){
            v.add(i);
        }
        System.out.println("Vector store ::"+v);

        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            Integer i=(Integer) e.nextElement();
            if(i%2==0){
                System.out.print("Even number by Enumeration ::"+i + " ,");
            }
        }

    }
}

