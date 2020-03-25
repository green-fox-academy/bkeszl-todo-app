package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Todo {
  public static void main(String[] args) {
    if (args.length == 0) {
      new Introduce();
      return;
    }

    List<String> tasks;
    OpenTasks openTasks = new OpenTasks();
    tasks = openTasks.openTasks();

    if (args[0].equals("-l")) {
      new ListTasks(tasks);
    }


  }
}
