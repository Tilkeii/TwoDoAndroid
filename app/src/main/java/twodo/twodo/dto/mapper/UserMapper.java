package twodo.twodo.dto.mapper;

import java.util.ArrayList;

import twodo.twodo.dto.model.EUser;
import twodo.twodo.dto.model.User;

public class UserMapper {

    public User map(EUser eUser) {
        User user = new User();

        user.setId(eUser.getId());
        user.setFirstname(eUser.getFirstname());
        user.setLastname(eUser.getLastname());
        user.setEmail(eUser.getEmail());
        user.setPhone(eUser.getPhone());
        user.setAddress(eUser.getAddress());

        return user;
    }

    public ArrayList<User> map(ArrayList<EUser> eUserList) {
        ArrayList<User> userList = new ArrayList<>();

        for (EUser eUser: eUserList) {
            userList.add(this.map(eUser));
        }

        return userList;
    }
}
