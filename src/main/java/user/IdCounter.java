package user;

public class IdCounter {
    private static int id;

    public static int getId() {
        return id++;
    }
}
