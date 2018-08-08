package com.keningren;

public class Main {

    public static void main(String[] args) {
        //Account bobsAccount = new Account();
        Account bobsAccount = new Account("1", 101.0, "Kening Ren", "rknlh.jobs@gmail.com", "770-862-6008");
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        Account timsAccount = new Account("Tim", "tim@gmail.com", "678-123-4567");
        System.out.println("Name: " + timsAccount.getCustomerName() + " Email Address: " + timsAccount.getCustomerEmailAddress() + " Phone Number: " + timsAccount.getCustomerPhoneNumber());


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        VipPerson person2 = new VipPerson("Bob", 25000);
        System.out.println(person2.getName());
        VipPerson person3 = new VipPerson("Tim", 100, "tim@gmail.com");
        System.out.println(person3.getName());
    }
}
