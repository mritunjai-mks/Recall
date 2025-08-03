package com.in.before.Aug2025.exception.checked;

public class VoteRegerstration {
    public static void registration(int age) throws AgeValidationException {
        if(age<=18){
            throw new AgeValidationException("Age must be greater then 18");
        }else{
            System.out.println("Your are eligible for voting");
        }
    }
    public static void main(String[] arg){
        try {
            VoteRegerstration.registration(19);
        } catch (AgeValidationException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
