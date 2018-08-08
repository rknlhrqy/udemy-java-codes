package com.keningren;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends Team>  {
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (league.contains(team)) {
            return false;
        } else {
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable() {
        // The following built-in class and its method is using
        // CompareTo() of built-in class Comparable.
        Collections.sort(league);

        for(T t: league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
