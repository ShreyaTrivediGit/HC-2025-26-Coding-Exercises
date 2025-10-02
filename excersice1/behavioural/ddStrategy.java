package exercise1.behavioral;


public class AddStrategy implements Strategy {
@Override public int execute(int a, int b) { return a + b; }
}