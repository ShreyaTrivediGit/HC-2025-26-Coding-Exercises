package exercise1.structural;

public abstract class Decorator implements Component {
    protected final Component component;
    protected Decorator(Component c) { this.component = c; }
}