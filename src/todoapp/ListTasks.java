package todoapp;

import java.util.List;

public class ListTasks {
  public  ListTasks(List<String> tasks) {
    for (int i = 0; i <tasks.size() ; i++) {
      System.out.println((i + 1) + " - " + tasks.get(i).substring(0, tasks.get(i).length()-2) );
    }
  }
}
