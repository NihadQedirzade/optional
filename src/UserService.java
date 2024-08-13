import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<Integer, User> users = new HashMap<>();
    public void addUser(int userId, User user) {
        users.put(userId, user);
    }

    public User findUserById(int userId) {
        return users.get(userId);
    }

    public String getUserEmailById(int userId) {
        User user = findUserById(userId);
        if (user != null) {
            return user.getEmail();
        } else {
            return null;
        }
    }
    public boolean doesUserExist(int userId) {
        return users.containsKey(userId);
    }


}
