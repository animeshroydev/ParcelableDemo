package com.animeshroy.notekeeper.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text_name, text_age, text_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_name = findViewById(R.id.name);
        text_age = findViewById(R.id.age);
        text_phone = findViewById(R.id.phone);


        Intent intent = getIntent();
        Details student = intent.getParcelableExtra("Information");

        String name = student.getName();
        String age = student.getAge();
        String phone = student.getPhone();

        text_name.setText("Your Name: "+name);
        text_age.setText("Your Age: "+age);
        text_phone.setText("Your Phone No: "+phone);

    }
}
