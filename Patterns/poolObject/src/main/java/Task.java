public class Task {
    public static int idC = 0;
    public int id;
    public String description = "";

    public Task() {
        id = idC++;
    }

    public Task(String description) {
        id = idC++;
        this.description = description;
    }
}