package exercise1.behavioral;


public class ConcreteObserver implements Observer {
private final String name;
public ConcreteObserver(String name) { this.name = name; }
@Override
public void update(String event) {
System.out.println("[" + name + "] received event: " + event);
}
}