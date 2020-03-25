package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class addTask {
  public addTask(String taskToAdd) {
    Path taskListPath = Paths.get("todoapp/taskList.txt");
    try {
    Files.write(taskListPath, taskToAdd.getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
