package com.keningren;

import java.lang.reflect.Array;
import java.util.ArrayList;

class intClass {
    private int myValue;
    public intClass(int myValue) {
        this.myValue = myValue;
    }
    public int getMyValue() {
        return this.myValue;
    }
}



public class Main {

    public static void main(String[] args) {
        String[] strArray= new String[10];
        int[] intArray = new int[20];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<intClass> intClassArrayList = new ArrayList<intClass>();
        intClassArrayList.add(new intClass(54));

        Integer integer = new Integer(54);
        Double doubleV = new Double(10.2);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i < integerArrayList.size(); i++) {
            System.out.println(integerArrayList.get(i).intValue());
        }

        Integer myInteger = new Integer(54);
        Integer myIntValue = 54;
        Integer myIntValue2 = Integer.valueOf(54);


        int myInt = myIntValue;
        int myInt2 = myIntValue2.intValue();

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for(double dbl = 0.0; dbl < 10.0; dbl += 1.0) {
            doubleArrayList.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < doubleArrayList.size(); i++) {
            double dvalue = doubleArrayList.get(i).doubleValue();
            System.out.println("dvalue = " + dvalue);
        }





    }
}
