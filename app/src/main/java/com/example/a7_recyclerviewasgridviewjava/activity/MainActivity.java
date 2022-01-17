package com.example.a7_recyclerviewasgridviewjava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a7_recyclerviewasgridviewjava.R;
import com.example.a7_recyclerviewasgridviewjava.model.Member;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<Member> members = prepareMember();
        refreshAdapter(members);
    }

    void initViews(){
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context, members);
        recyclerView.setAdapter(adapter);
    }

    private List<Member> prepareMember() {
        List<Member> members  = new ArrayList<>();
       int[] drawables = {R.drawable.img, R.drawable.img_1, R.drawable.img_2, R.drawable.img_3};

        for (int i = 0; i < 100; i++){
            members.add(new Member("Odilbek", "+998 97 775 17 79"));
        }

        return members;
    }
}

