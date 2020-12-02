package com.example.listview;

import java.util.Comparator;

public class SexComp implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.sex.compareTo(u2.sex);
    }
}
