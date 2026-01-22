import java.util.ArrayList;
import java.util.Scanner;

public class MiniTodoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n==== MINI TODO APP ====");
            System.out.println("1) Add Task");
            System.out.println("2) View Tasks");
            System.out.println("3) Mark Task Done");
            System.out.println("4) Delete Task");
            System.out.println("5) Exit");
            System.out.print("Choose: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("❌ Invalid input. Enter a number (1-5).");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine().trim();

                    if (title.isEmpty()) {
                        System.out.println("❌ Task title cannot be empty.");
                        break;
                    }

                    tasks.add(new Task(title));
                    System.out.println("✅ Task added.");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("⚠️ No tasks yet.");
                        break;
                    }

                    System.out.println("\n--- Tasks ---");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ") " + tasks.get(i));
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("⚠️ No tasks to mark.");
                        break;
                    }

                    System.out.print("Enter task number to mark done: ");
                    try {
                        int idx = Integer.parseInt(sc.nextLine()) - 1;

                        if (idx < 0 || idx >= tasks.size()) {
                            System.out.println("❌ Invalid task number.");
                            break;
                        }

                        tasks.get(idx).done = true;
                        System.out.println("✅ Marked as done.");
                    } catch (Exception e) {
                        System.out.println("❌ Invalid input. Enter a valid task number.");
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("⚠️ No tasks to delete.");
                        break;
                    }

                    System.out.print("Enter task number to delete: ");
                    try {
                        int idx = Integer.parseInt(sc.nextLine()) - 1;

                        if (idx < 0 || idx >= tasks.size()) {
                            System.out.println("❌ Invalid task number.");
                            break;
                        }

                        tasks.remove(idx);
                        System.out.println("✅ Task deleted.");
                    } catch (Exception e) {
                        System.out.println("❌ Invalid input. Enter a valid task number.");
                    }
                    break;

                case 5:
                    System.out.println("✅ Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Choose between 1 to 5 only.");
            }
        }
    }
}


class Task {
    String title;
    boolean done;

    Task(String title) {
        this.title = title;
        this.done = false;
    }

    @Override
    public String toString() {
        return (done ? "[X] " : "[ ] ") + title;
    }
}

