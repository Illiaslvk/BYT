import java.util.Stack;

public class ObjectPool {
    Stack<Task> pool = new Stack<>();

    public Task getTask() {
        if (pool.size() == 0) {
            return new Task();
        } else return pool.pop();
    }

    public int freeTasks() {
        return pool.size();
    }

    public void ReturnTask(Task task) {
        pool.add(task);
    }
}