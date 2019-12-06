package pl.edu.wszib.repository;


import org.springframework.stereotype.Component;
import pl.edu.wszib.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsersRepository {
    private List<User> userList = new ArrayList<>();

    public UsersRepository(){
        User user1 = new User();
        user1.setLogin("abc");
        user1.setPass("abc");

        User user2 = new User();
        user2.setLogin("def");
        user2.setPass("def");

        User user3 = new User();
        user3.setLogin("ghi");
        user3.setPass("ghi");

        User user4 = new User();
        user4.setLogin("jkl");
        user4.setPass("jkl");

        this.userList.add(user1);
        this.userList.add(user2);
        this.userList.add(user3);
        this.userList.add(user4);
    }


    public List<User> getUserList(){
        return userList;
    }

}
