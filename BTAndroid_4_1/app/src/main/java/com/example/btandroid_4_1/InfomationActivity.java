package com.example.btandroid_4_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfomationActivity extends AppCompatActivity {
    private TextView txtName, txtEmail, txtProject;
    private Button btnFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtProject = findViewById(R.id.txtProject);
        btnFinish = findViewById(R.id.btnFinish);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String project = intent.getStringExtra("project");
        //set values
        txtName.setText(name);
        txtEmail.setText(email);
        txtProject.setText(project);
        btnFinish.setOnClickListener(v -> {
            finish();
        });
    }

}
