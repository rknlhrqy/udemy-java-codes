package com.keningren;

class Movie {
    private String name;
    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }
    public String plot() {
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the galaxy`";
    }
}

class MyMovie extends Movie {
    public MyMovie() {
        super("My Movie");
    }
}

    class Fury extends Movie {
        public Fury() {
            super("Fury");
        }

        @Override
        public String plot() {
            return "Tank battle in WWII";
        }
    }

    class Alien extends Movie {
        public Alien() {
            super("Alien");
        }

        @Override
        public String plot() {
            return "Human fights the alien monster";
        }
    }

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 11; i++) {
            Movie myMovie = randomMovie();
            System.out.println("Movie: " + i + " is: " + myMovie.getName());
            System.out.println("Movie Plot: " + myMovie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 7) + 1;
        System.out.println("Random number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new MyMovie();
            case 6:
                return new Fury();
            case 7:
                return new Alien();
        }
        return null;
    }

}
