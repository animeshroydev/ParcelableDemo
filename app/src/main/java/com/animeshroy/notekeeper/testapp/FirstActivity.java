package com.animeshroy.notekeeper.testapp;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity  {

    EditText name;
    EditText age;
    EditText phone;
    Button button;
    Details details;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        name = findViewById(R.id.edit_name);
        age = findViewById(R.id.edit_age);
        phone = findViewById(R.id.edit_phone);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name_str = name.getText().toString();
                String age_str = age.getText().toString();
                String phone_str = phone.getText().toString();

                if ((name_str.matches("")) ||(age_str.matches(""))|| (phone_str.matches(""))) {
                    Toast.makeText(FirstActivity.this, "You must fill all the field (Name, age, Phone)",
                            Toast.LENGTH_SHORT).show();
                    return;
                }

                details  = new Details(name_str, age_str, phone_str);

                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("Information", details);
                startActivity(intent);
            }
        });


    }
}
