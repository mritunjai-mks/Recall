package com.in.before.Aug2025.java8.functionalInterface.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;
//WAP to remove all null or empty String from the array
public class AppMainToRemoveNull {
    public static void main(String[] arg){
        String[] store={"Mritunjai","Kumar",null,"Sharma","","Deloitte"};
        Predicate<String> p=result->result!=null && !result.isEmpty();
        ArrayList<String> addString=new ArrayList<String>();

        for (String result:store){
            if(p.test(result)){
                addString.add(result);
            }
        }
        System.out.print(addString);
    }
}
