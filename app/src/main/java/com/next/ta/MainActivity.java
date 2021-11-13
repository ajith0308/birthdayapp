package com.next.ta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void next(View view) {
        String Name="Name";
        e1=findViewById(R.id.editTextTextPersonName);
        String s=e1.getText().toString();

        //Toast.makeText(MainActivity.this, "hi "+s, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,btwish.class);
        intent.putExtra(Name,s);
        startActivity(intent);
    }
}