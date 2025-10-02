package exercise1;


import exercise1.creational.*;
import exercise1.behavioral.*;
import exercise1.structural.*;


public class DemoRunner {
public static void main(String[] args) {
System.out.println("--- Creational: Singleton ---");
Singleton s1 = Singleton.getInstance();
Singleton s2 = Singleton.getInstance();
s1.doWork(); s2.doWork();


System.out.println("--- Creational: Factory ---");
Product pA = ProductFactory.create("A");
Product pB = ProductFactory.create("B");
System.out.println("Created: " + pA.name() + ", " + pB.name());


System.out.println("--- Behavioral: Observer ---");
Subject subject = new Subject();
subject.attach(new ConcreteObserver("Obs1"));
subject.attach(new ConcreteObserver("Obs2"));
subject.notifyAllObservers("Event-1");


System.out.println("--- Behavioral: Strategy ---");
CalculatorContext ctx = new CalculatorContext();
ctx.setStrategy(new AddStrategy());
System.out.println("Add: " + ctx.compute(3,4));
ctx.setStrategy(new MultiplyStrategy());
System.out.println("Multiply: " + ctx.compute(3,4));


System.out.println("--- Structural: Adapter ---");
Adaptee adaptee = new Adaptee();
Target adapter = new Adapter(adaptee);
System.out.println(adapter.request());


System.out.println("--- Structural: Decorator ---");
Component comp = new ConcreteComponent();
Component decorated = new ConcreteDecorator(comp);
System.out.println(decorated.operation());


System.out.println("\nAll demos finished.");
}
}