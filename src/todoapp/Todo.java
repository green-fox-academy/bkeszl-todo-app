package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Todo {
  public static void main(String[] args) {
    String[] validArguments = {"-a", "-r", "-c", "-l"};
    boolean canRun = false;
    if (args.length == 0) {
      new Introduce();
      return;
    }

    for (String validArgument : validArguments) {
      if (args[0].equals(validArgument)) {
        canRun = true;
      }
    }

    if (!canRun) {
      System.out.println("Unsupported argument");
      return;
    }

    List<String> tasks;
    OpenTasks openTasks = new OpenTasks();
    tasks = openTasks.openTasks();

    if (args[0].equals("-l")) {
      if (tasks.size() == 0 ){
        System.out.println("No todos today!");
        return;
      }
      new ListTasks(tasks);
      return;
    }

    if (args[0].equals("-a")) {
      String taskToAdd = args[1] + " 0" + System.lineSeparator() ;
      new addTask(taskToAdd);
      return;
    }

    if (args[0].equals("-c")) {
      String taskToCheck = args[1];
      new checkTask(taskToCheck);
      return;
    }

    if (args[0].equals("-r")) {
      String taskToRemove = args[1];
      new removeTask(taskToRemove);
      return;
    }

  }
}
