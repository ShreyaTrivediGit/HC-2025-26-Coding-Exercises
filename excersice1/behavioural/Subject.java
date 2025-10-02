package exercise1.behavioral;


import java.util.*;


public class Subject {
private final List<Observer> observers = new ArrayList<>();
public void attach(Observer o) { observers.add(o); }
public void detach(Observer o) { observers.remove(o); }
public void notifyAllObservers(String event) {
for (Observer o : observers) o.update(event);
}
}