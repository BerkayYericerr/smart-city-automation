
//This is the implementation of the Observer Pattern as suggested in Homework1.
//The purpose of this implementation is to allow CityMonitor to notify multiple observers  like (Residents, Authorities)


import java.util.ArrayList;
import java.util.List;

// CityMonitor class acts as the Subject in the Observer Pattern.

class CityMonitor {
    // List to hold all observers (like Residents and  Authorities)
    private List<Observer> observers = new ArrayList<>();
    CityMonitor() {
    }
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    // Method to remove a observer from the list
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    // Method to notify all registered
    public void notifyObservers(String message) {
        for (Observer observer : this.observers) {
            observer.update(message);
        }
    }
}


// Both Resident and Authority implement  in this interface.
interface Observer {
    void update(String message);
}
class Resident implements Observer {
    private String name; // Name of the resident
    public Resident(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(this.name + " received alert: " + message);
    }
}

// Authority class implements the Observer interface
class Authority implements Observer {
    private String department; // Name of the department

    public Authority(String department) {
        this.department = department;
    }

    @Override
    public void update(String message) {
        System.out.println(this.department + " department received alert: " + message);
    }
}
