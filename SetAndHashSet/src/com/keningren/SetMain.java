package com.keningren;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i= 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("squares size: " + squares.size() + " cubes size: " + cubes.size());
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println(union.containsAll(cubes));
        System.out.println("union size: " + union.size());
        union.retainAll(cubes);
        System.out.println("union size: " + union.size());
        union.removeAll(cubes);
        System.out.println("union size: " + union.size());


    }
}
