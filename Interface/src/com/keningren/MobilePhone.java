package com.keningren;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber, boolean isRinging) {
        this.myNumber = myNumber;
        this.isRinging = isRinging;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("MobilePhone is powered on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("No ringing " + phoneNumber + " on mobilephone");
        } else {
            System.out.println("Mobile phone switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if ((phoneNumber == myNumber) && (isOn)) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;

    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
