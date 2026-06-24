import java.util.Stack;

// A simple program demonstrating basic Data Structure operations using a Stack
public class StackExample {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();

        // Push operations (Adding items)
        tasks.push("Design System");
        tasks.push("Write Code");
        tasks.push("Run Tests");

        System.out.println("Current Stack of tasks: " + tasks);

        // Pop operation (Removing the top item)
        String completedTask = tasks.pop();
        System.out.println("Completed and removed: " + completedTask);
        
        // Peek operation (Looking at the top item)
        System.out.println("Next task inline: " + tasks.peek());
    }
}