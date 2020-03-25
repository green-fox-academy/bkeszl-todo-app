package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class removeTask {
  public removeTask(String taskToRemove) {
    Path taskListPath = Paths.get("todoapp/taskList.txt");
    try {
      List<String> tasks = Files.readAllLines(taskListPath);
      for (int i = 0; i <tasks.size() ; i++) {
        if (tasks.get(i).substring(0, tasks.get(i).length()-2).equals(taskToRemove)) {
          tasks.remove(i);
        }
      }

      Files.write(taskListPath, tasks);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
