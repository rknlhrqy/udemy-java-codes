package com.keningren;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void powerOn() {
        System.out.println("Power on Phone");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dial number: " + phoneNumber);
    }

    @Override
    public void answer() {
        System.out.println("Answer phone call");
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }
}
