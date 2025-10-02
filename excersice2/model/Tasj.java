package exercise2.model;


import java.time.LocalTime;


public class Task {
private final String description;
private final LocalTime start;
private final LocalTime end;
private final String priority;
private boolean completed;


public Task(String description, LocalTime start, LocalTime end, String priority) {
this.description = description;
this.start = start;
this.end = end;
this.priority = priority;
this.completed = false;
}


public String getDescription() { return description; }
public LocalTime getStart() { return start; }
public LocalTime getEnd() { return end; }
public String getPriority() { return priority; }
public boolean isCompleted() { return completed; }
public void markCompleted() { this.completed = true; }


@Override
public String toString() {
return start + " - " + end + ": " + description + " [" + priority + "]" + (completed ? " (Done)" : "");
}
}