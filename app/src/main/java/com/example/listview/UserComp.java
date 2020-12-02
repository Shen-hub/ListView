package com.example.listview;

import java.util.Comparator;

public class UserComp implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.name.compareTo(u2.name);
    }
}
