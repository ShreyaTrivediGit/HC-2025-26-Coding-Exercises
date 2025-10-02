package exercise1.structural;

public class Adapter implements Target {
    private final Adaptee adaptee;
    public Adapter(Adaptee adaptee) { this.adaptee = adaptee; }
    @Override
    public String request() {
        // translate call
        return "Adapter -> (" + adaptee.specificRequest() + ")";
    }
}