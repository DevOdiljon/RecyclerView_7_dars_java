package com.example.a7_recyclerviewasgridviewjava.model;

import android.widget.ImageView;

import com.example.a7_recyclerviewasgridviewjava.R;

public class Member {
    String name;
    String telNumber;
    public Member(String name, String telNumber){
        this.name = name;
        this.telNumber = telNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelNumber() {
        return telNumber;
    }
}
