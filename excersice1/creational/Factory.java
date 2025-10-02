package exercise1.creational;


public interface Product {
String name();
}


// File: /exercise1/creational/ConcreteProductA.java
package exercise1.creational;


public class ConcreteProductA implements Product {
@Override
public String name() { return "Product-A"; }
}