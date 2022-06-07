package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {
    TextView textMessage;
    Button btnRegistration;
    EditText registrationPlainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        textMessage = findViewById(R.id.studentTextView);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("name");
            textMessage.setText("Hi student "+name+"!");
        }

        registrationPlainText = findViewById(R.id.registrationPlainText);
        btnRegistration = findViewById(R.id.registrationButton);
        btnRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                String registration = registrationPlainText.getText().toString();
                result.putExtra("registration", registration);
                setResult(RESULT_OK, result);
                finish();
            }
        });

    }
}