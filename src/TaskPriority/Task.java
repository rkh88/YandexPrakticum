package TaskPriority;

public class Task {

    private TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    // добавьте конструктор класса
    // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return description;
    }
}
