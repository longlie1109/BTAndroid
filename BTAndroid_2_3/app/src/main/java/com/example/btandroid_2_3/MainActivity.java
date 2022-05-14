package com.example.btandroid_2_3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTime = findViewById(R.id.btn1);
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        btnTime.setOnClickListener(view -> {
            Date d = new Date();
            String message = "Thời gian hiện hành là: " + d.toLocaleString();
            alertDialog.setMessage(message);
            alertDialog.show();
        });
    }
}