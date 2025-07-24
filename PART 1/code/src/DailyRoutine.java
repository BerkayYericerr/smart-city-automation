
//This is the implementation of the Template Method Pattern as suggested in Homework1.
//The purpose of this implementation is to define a template for daily routines in the city system
// like (turning on lights, checking public safety, and managing utilities )

abstract class DailyRoutine {
    DailyRoutine() {
    }

    public void executeRoutine() {
        this.turnOnLights();
        this.checkPublicSafety();
        this.manageUtilities();
    }
    // Abstract method for turning on lights as in subclasses
    abstract void turnOnLights();
    // Abstract method for checking public safety as in subclasses
    abstract void checkPublicSafety();
    // Abstract method for managing utilities as in subclasses
    abstract void manageUtilities();
}


class CityRoutine extends DailyRoutine {
    CityRoutine() {
    }
// Turning on the lights
    void turnOnLights() {
        System.out.println("Turning on the street lights...");
    }
// Checking Public Safety
    void checkPublicSafety() {
        System.out.println("Checking public safety...");
    }
// Managing Utillities
    void manageUtilities() {
        System.out.println("Managing utilities like water and electricity...");
    }
}
