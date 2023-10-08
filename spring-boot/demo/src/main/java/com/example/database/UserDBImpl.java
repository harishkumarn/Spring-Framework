package com.example.database;
import com.pojo.User;

import java.util.HashMap;

public class UserDBImpl implements UserDB {

    static HashMap<Integer, User> db = new HashMap<Integer, User>(){{
        put(1,new User(1,"Harish Kumar",25));
        put(2,new User(1,"Dilip Kumar",31));
        put(3,new User(1,"Ronaldo",37));
        put(4,new User(1,"Messi",35));
    }};


    @Override
    public User getUserById(Integer id) throws UserException{
        if(!db.containsKey(id)) throw new UserException("No User found");
        return db.get(id);
    }

    @Override
    public void createUser(User user) throws UserException{
        if(db.containsKey(user.getId())) throw new UserException("User with ID present already !!");
        db.put(user.getId(),user);
    }
}
