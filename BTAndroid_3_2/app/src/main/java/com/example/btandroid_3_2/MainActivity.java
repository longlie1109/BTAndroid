package com.example.btandroid_3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button btnSubmit;
    private CheckBox ckbColor, ckbBold;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        btnSubmit = findViewById(R.id.btnSubmit);
        ckbColor = findViewById(R.id.ckbColor);
        ckbBold = findViewById(R.id.ckbBold);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                editText.setText("You've clicked " + count + " times");
                if (ckbColor.isChecked()) {
                    editText.setTextColor(Color.BLUE);
                } else {
                    editText.setTextColor(Color.RED);
                }
                if (ckbBold.isChecked()) {
                    editText.setTypeface(null, Typeface.BOLD);
                } else {
                    editText.setTypeface(null, Typeface.ITALIC);

                }
            }
        });

    }
}