package com.keningren;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("DeskPhone already powered on.");
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("No ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
