package exercise2.observer;


import exercise2.model.Task;


public class ConsoleConflictNotifier implements ConflictObserver {
@Override
public void onConflict(Task newTask, Task existingTask) {
System.out.println("Error: Task '" + newTask.getDescription() + "' conflicts with existing task '" + existingTask.getDescription() + "'");
}
}