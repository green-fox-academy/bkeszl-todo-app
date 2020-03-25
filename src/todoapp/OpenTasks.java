package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OpenTasks {
  public List<String> openTasks() {
    try {
      Path taskListPath = Paths.get("todoapp/taskList.txt");
      return Files.readAllLines(taskListPath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
