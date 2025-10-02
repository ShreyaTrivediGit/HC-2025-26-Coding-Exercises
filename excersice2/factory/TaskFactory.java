package exercise2.factory;


import exercise2.model.Task;
import java.time.LocalTime;


public class TaskFactory {
public static Task createTask(String description, String start, String end, String priority) {
LocalTime startTime = LocalTime.parse(start);
LocalTime endTime = LocalTime.parse(end);
return new Task(description, startTime, endTime, priority);
}
}