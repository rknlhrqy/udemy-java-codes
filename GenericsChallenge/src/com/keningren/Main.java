package com.keningren;

import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();
    }
}
