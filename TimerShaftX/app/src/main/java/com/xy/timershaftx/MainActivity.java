package com.xy.timershaftx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initData();
    }


    private void initView() {
        rcList = findViewById(R.id.rc_list);

    }

    private void initData() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");


        rcList.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        TimeAdapter adapter = new TimeAdapter(MainActivity.this,list);
        rcList.setAdapter(adapter);
    }

}
