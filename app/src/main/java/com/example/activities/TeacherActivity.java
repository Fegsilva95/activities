package com.example.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TeacherActivity extends AppCompatActivity {
    TextView textMessage;
    EditText siapePlainText;
    Button btnSiape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        Toast.makeText(getApplicationContext(), "Teacher onCreate()", Toast.LENGTH_SHORT).show();
        textMessage = findViewById(R.id.teacherTextView);
        Bundle bundleExtras = getIntent().getExtras();
        if(bundleExtras!=null){
            String name = bundleExtras.getString("name");
            textMessage.setText("Hi teacher "+name+"!");
        }

        siapePlainText = findViewById(R.id.siapePlainText);
        btnSiape = findViewById(R.id.registrationButton);
        btnSiape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent result = new Intent();
                String siape = siapePlainText.getText().toString();
                result.putExtra("siape", siape);
                setResult(RESULT_OK, result);
                finish();
            }
        });
    }
}