package javaprograms;


import java.util.*;
class Task {
    String id;
    String description;
    int priority;
    Date deadline;

    public Task(String id, String description, int priority, Date deadline) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return id + ": " + description + " (Priority: " + priority + ")";
    }
}

public class taskmanager {
    HashMap<String, Task> taskMap = new HashMap<>();
    TreeMap<Date, Task> deadlineMap = new TreeMap<>();
    Queue<Task> taskQueue = new LinkedList<>();
    PriorityQueue<Task> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));

    public void addTask(Task task) {
        taskMap.put(task.id, task);
        deadlineMap.put(task.deadline, task);
        taskQueue.offer(task);
        priorityQueue.offer(task);
    }

    public void processTasks() {
        System.out.println("Processing by arrival:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }

        System.out.println("\nProcessing by priority:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        taskmanager manager = new taskmanager();
        manager.addTask(new Task("T1", "Fix bug", 2, new Date(2025, 7, 10)));
        manager.addTask(new Task("T2", "Write report", 1, new Date(2025, 7, 8)));
        manager.addTask(new Task("T3", "Team meeting", 3, new Date(2025, 7, 9)));

        manager.processTasks();

        System.gc(); // Suggest garbage collection
    }
}
