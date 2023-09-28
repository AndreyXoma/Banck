package service;

import entity.ListUser;
import entity.User;

public class Authorization {

    private ListUser listUser;

    public Authorization(ListUser listUser) {
        this.listUser = listUser;
    }

    public User auth(String login, String password) {
        for(User user : listUser.getUserList()) {
            if(user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;

    }

}
