package ca.uwaterloo.cs446;

import java.util.*;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void sendNotice() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    abstract public int getState();

    abstract public void setState(int state);

}
