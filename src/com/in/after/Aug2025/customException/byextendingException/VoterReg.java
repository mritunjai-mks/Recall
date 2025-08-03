package com.in.after.Aug2025.customException.byextendingException;

public class VoterReg {

    public void registerVoter(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be greater then 18 or above for the vote");
        } else {
            System.out.println("Vote given successfully ...");
        }
    }

    public static void main(String[] args) throws AgeValidationException {
        VoterReg vr = new VoterReg();
        vr.registerVoter(11);

    }
}
