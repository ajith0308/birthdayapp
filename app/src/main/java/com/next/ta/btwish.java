package com.next.ta;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class btwish extends AppCompatActivity {
TextView t1;
String Name="Name";
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btwish);
        t1=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String n1=intent.getStringExtra(Name);
        t1.setText(n1+"!");


    }
}