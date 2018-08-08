package com.keningren;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    private static HeavenlyBody addPlanet(String name, double orbitalPeriod) {
        HeavenlyBody body = new HeavenlyBody(name, orbitalPeriod);
        solarSystem.put(body.getName(), body);
        planets.add(body);
        return body;
    }

    private static void addMoon(HeavenlyBody planet, String name, double orbitalPeriod) {
        HeavenlyBody moon = new HeavenlyBody(name, orbitalPeriod);
        solarSystem.put(moon.getName(), moon);
        planet.addMoon(moon);
    }

    private static void printHeavenlyBody() {
         System.out.println("Planets: ");
        for(HeavenlyBody planet: planets) {
            System.out.println("\t" + planet.getName());
            if (planet.getSatellites().size() != 0) {
                System.out.println("\t\tMoon:");
                for (HeavenlyBody moon : planet.getSatellites()) {
                    System.out.println("\t\t\t" + moon.getName());
                }
            }
        }
    }

    public static void main(String[] args) {

        addPlanet("Mercury", 88);

        addPlanet("Venus", 225);

        HeavenlyBody earth = addPlanet( "Earth", 365);
        addMoon(earth, "moon", 27);

        HeavenlyBody mars = addPlanet("Mars", 687);
        addMoon(mars, "Deimos", 1.3);
        addMoon(mars, "Phobos", 0.3);

        HeavenlyBody jupitor = addPlanet("Jupitor", 4332);
        addMoon(jupitor, "Io", 1.8);
        addMoon(jupitor, "Europa", 1.8);
        addMoon(jupitor, "Ganymede", 7.1);
        addMoon(jupitor, "Callisto", 16.7);

        addPlanet("Saturn", 10759);

        addPlanet("Uranus", 30660);

        addPlanet("Neptune", 165);

        addPlanet("Pluto", 248);
        addPlanet("Pluto", 842);

        printHeavenlyBody();
    }
}
