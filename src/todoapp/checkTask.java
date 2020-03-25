package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class checkTask {
  public checkTask(String taskToCheck) {
    Path taskListPath = Paths.get("todoapp/taskList.txt");
    try {
    List<String> tasks = Files.readAllLines(taskListPath);
      for (int i = 0; i <tasks.size() ; i++) {
        if (tasks.get(i).substring(0, tasks.get(i).length()-2).equals(taskToCheck)) {
           tasks.set(i, tasks.get(i).replace('0', '1'));
        }
      }

      Files.write(taskListPath, tasks);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
