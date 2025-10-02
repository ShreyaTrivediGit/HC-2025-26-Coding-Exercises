package exercise1.creational;


public class Singleton {
private static volatile Singleton instance;
private Singleton() { }
public static Singleton getInstance() {
if (instance == null) {
synchronized(Singleton.class) {
if (instance == null) instance = new Singleton();
}
}
return instance;
}
public void doWork() {
System.out.println("Singleton instance working: " + this.hashCode());
}
}