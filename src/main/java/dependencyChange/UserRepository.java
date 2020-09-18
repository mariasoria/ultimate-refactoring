package dependencyChange;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<User> findAll(){
        List<User> allUsers = new ArrayList();
        allUsers.add(new User());
        return allUsers;
    }
}
