package com.keningren.packageexport;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private ArrayList<T> members = new ArrayList<T>();


    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()) {
            return -1;
        } else if (this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on team: " + this.name);
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team: " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won ++;
        } else if (ourScore == theirScore) {
            this.tied ++;
        } else {
            this.lost ++;
        }
        this.played ++;

        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return won * 2 + tied;
    }


}
