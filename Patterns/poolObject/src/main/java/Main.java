public class Main {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        Task task = objectPool.getTask();
        task.description = "123";
        System.out.println(task.description);
        System.out.println(objectPool.freeTasks());
        objectPool.ReturnTask(task);
        System.out.println(objectPool.freeTasks());
        Task task2 = objectPool.getTask();
        System.out.println(task2.description);
        System.out.println(objectPool.freeTasks());
    }
}
