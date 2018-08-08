package com.keningren;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    public void preparePC() {
       getMonitor().drawPixelAt(1500, 1200, "red");
       getMotherboard().loadProgram("Windows 1.0");
       getTheCase().pressPowerButton();
    }


}
