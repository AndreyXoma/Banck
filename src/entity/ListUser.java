package entity;

import java.util.ArrayList;
import java.util.List;

public class ListUser {
    private List<User> userList;
    private int sizeList = 0;

    public ListUser() {
        userList = new ArrayList<>();
    }

    public int getSize() {
        return sizeList;
    }

    public void insertUser(User user) {
        if(user != null) {
            userList.add(user);
        } else {
            System.out.println("Error!!!");
        }
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
