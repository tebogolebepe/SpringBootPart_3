package Services;

public interface UserServices {
    void addUser(long id, String name, String surname);
    void removeUser(long id);
    void getUser(long id);
}
