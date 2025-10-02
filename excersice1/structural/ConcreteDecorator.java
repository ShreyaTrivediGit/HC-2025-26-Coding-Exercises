package exercise1.structural;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component c) { super(c); }
    @Override
    public String operation() {
        return "Decorated(" + component.operation() + ")";
    }
}