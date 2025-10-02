package exercise2.observer;


import exercise2.model.Task;


public interface ConflictObserver {
void onConflict(Task newTask, Task existingTask);
}