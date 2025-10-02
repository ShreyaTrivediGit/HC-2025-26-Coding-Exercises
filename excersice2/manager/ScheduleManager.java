package exercise2.manager;


import exercise2.model.Task;
import exercise2.observer.ConflictObserver;


import java.util.*;


public class ScheduleManager {
private static volatile ScheduleManager instance;
private final List<Task> tasks;
private final List<ConflictObserver> observers;


private ScheduleManager() {
tasks = new ArrayList<>();
observers = new ArrayList<>();
}


public static ScheduleManager getInstance() {
if (instance == null) {
synchronized (ScheduleManager.class) {
if (instance == null) instance = new ScheduleManager();
}
}
return instance;
}


public void addObserver(ConflictObserver o) { observers.add(o); }


public boolean addTask(Task newTask) {
for (Task t : tasks) {
if (overlaps(newTask, t)) {
observers.forEach(obs -> obs.onConflict(newTask, t));
return false;
}
}
tasks.add(newTask);
tasks.sort(Comparator.comparing(Task::getStart));
System.out.println("Task added successfully. No conflicts.");
return true;
}


public boolean removeTask(String description) {
return tasks.removeIf(t -> t.getDescription().equalsIgnoreCase(description));
}


public void viewTasks() {
if (tasks.isEmpty()) {
System.out.println("No tasks scheduled for the day.");
} else {
tasks.forEach(System.out::println);
}
}


private boolean overlaps(Task a, Task b) {
return !a.getEnd().isBefore(b.getStart()) && !a.getStart().isAfter(b.getEnd());
}
}