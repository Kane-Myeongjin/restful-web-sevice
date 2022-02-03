package com.example.restfulwebservice.user.service;

import com.example.restfulwebservice.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "Kenneth", new Date(), "pass1", "900000-1010102"));
        users.add(new User(2, "Alice", new Date(),"pass2", "800000-1010102"));
        users.add(new User(3, "Elena", new Date(),"pass3", "700000-1010102"));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }

        users.add(user);
        return user;
    }

    public Optional<User> findOne(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findAny();
    }

    public User deleteById(int id) {
        Optional<User> find = findOne(id);
        if(find.isEmpty()) {
            return null;
        } else {
            users.remove(find.get());
            return find.get();
        }
    }
}
