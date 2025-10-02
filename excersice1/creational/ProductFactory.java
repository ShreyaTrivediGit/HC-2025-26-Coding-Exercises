package exercise1.creational;


public class ProductFactory {
public static Product create(String type) {
switch (type) {
case "A": return new ConcreteProductA();
case "B": return new ConcreteProductB();
default: throw new IllegalArgumentException("Unknown type: " + type);
}
}
}