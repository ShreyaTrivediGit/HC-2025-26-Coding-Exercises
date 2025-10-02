package exercise2;


import exercise2.factory.TaskFactory;
import exercise2.manager.ScheduleManager;
import exercise2.observer.ConsoleConflictNotifier;


import java.util.Scanner;


public class AstronautSchedulerApp {
public static void main(String[] args) {
ScheduleManager manager = ScheduleManager.getInstance();
manager.addObserver(new ConsoleConflictNotifier());


Scanner sc = new Scanner(System.in);
System.out.println("Astronaut Daily Schedule Organizer");


while (true) {
System.out.println("\nMenu: add, remove, view, exit");
String cmd = sc.nextLine().trim().toLowerCase();


switch (cmd) {
case "add":
System.out.print("Description: ");
String desc = sc.nextLine();
System.out.print("Start (HH:MM): ");
String start = sc.nextLine();
System.out.print("End (HH:MM): ");
String end = sc.nextLine();
System.out.print("Priority (High/Medium/Low): ");
String priority = sc.nextLine();
manager.addTask(TaskFactory.createTask(desc, start, end, priority));
break;
case "remove":
System.out.print("Description of task to remove: ");
String r = sc.nextLine();
if (manager.removeTask(r))
System.out.println("Task removed successfully.");
else
System.out.println("Error: Task not found.");
break;
case "view":
manager.viewTasks();
break;
case "exit":
System.out.println("Exiting...");
return;
default:
System.out.println("Invalid command.");
}
}
}
}