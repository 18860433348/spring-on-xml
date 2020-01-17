package service;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/23 13:55
**/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User test(Integer id){
        User user = userMapper.selectUserById(id);
        return user;
    }


}
