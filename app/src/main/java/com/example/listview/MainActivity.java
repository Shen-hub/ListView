package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    UserListAdapter adapter;
    ListView listView;
    Button buttonSortName;
    Button buttonSortPhone;
    Button buttonSortSex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list);
        buttonSortName = findViewById(R.id.buttonSortName);
        buttonSortPhone = findViewById(R.id.buttonSortPhone);
        buttonSortSex = findViewById(R.id.buttonSortSex);
        InputStream stream = getResources().openRawResource(R.raw.users);
        Gson gson = new Gson();
        User[] users_arr = gson.fromJson(new InputStreamReader(stream), User[].class);

        Log.d("mytag", "users: " + users_arr.length);

        ArrayList<User> users = new ArrayList<>();
        Collections.addAll(users, users_arr);
        Collections.sort(users,new UserComp());

        adapter = new UserListAdapter(this, users);
        adapter.notifyDataSetChanged();

        listView.setAdapter(adapter);

    }
}