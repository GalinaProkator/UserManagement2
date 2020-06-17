package com.galina.usermanagement2.logic;

import com.galina.usermanagement2.dao.IUsersDao;
import com.galina.usermanagement2.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.jws.soap.SOAPBinding;

@Controller
public class UsersController {

    @Autowired
    private IUsersDao usersDao;

    public Long createUser (UserEntity user){
        // validations
        usersDao.save(user);
        return user.getId();
    }

    public void updateUser (UserEntity user){
        //validations
        usersDao.save(user);
    }

    public UserEntity getUser (Long id){
        UserEntity user = usersDao.findById(id).get();
        return user;
    }


    public void deleteUser(Long id) {
        usersDao.deleteById(id);
    }
}
