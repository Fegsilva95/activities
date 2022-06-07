package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    EditText namePlainText;
    Button btnTeacher;
    Button btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTeacher = findViewById(R.id.teacherButton);
        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(MainActivity.this, TeacherActivity.class);
                namePlainText = findViewById(R.id.namePlainText);
                intent.putExtra("name", namePlainText.getText().toString());
                startActivity(intent);
            }
        });

        btnStudent = findViewById(R.id.studentButton);
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                intent = new Intent(MainActivity.this, StudentActivity.class);
                namePlainText = findViewById(R.id.namePlainText);
                intent.putExtra("name", namePlainText.getText().toString());
                startActivity(intent);
            }
        });

    }

}