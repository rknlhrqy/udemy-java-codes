package com.keningren;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567, false);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();


        timsPhone = new MobilePhone(7701234, false);
        timsPhone.powerOn();
        timsPhone.callPhone(7701234);
        timsPhone.answer();;


    }
}
