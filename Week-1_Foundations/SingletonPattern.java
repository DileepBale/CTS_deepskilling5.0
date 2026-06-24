// A simple implementation of the Singleton Design Pattern
public class SingletonPattern {
    private static SingletonPattern instance;

    // Private constructor prevents instantiation from other classes
    private SingletonPattern() {}

    // Global access point to get the only instance of this class
    public static SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton Design Pattern!");
    }

    public static void main(String[] args) {
        SingletonPattern object = SingletonPattern.getInstance();
        object.showMessage();
    }
}