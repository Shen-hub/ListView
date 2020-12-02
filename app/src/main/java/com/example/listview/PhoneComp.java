package com.example.listview;

import java.util.Comparator;

public class PhoneComp implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.phoneNumber.compareTo(u2.phoneNumber);
    }
}
