package exercise1.behavioral;

public class CalculatorContext {
    private Strategy strategy;
    public void setStrategy(Strategy s) { this.strategy = s; }
    public int compute(int a, int b) { return strategy.execute(a,b); }
}