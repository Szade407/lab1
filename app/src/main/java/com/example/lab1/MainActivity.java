package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button changeTextButton;
    private Button changeColorButton;
    private boolean isTextColorChanged = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        changeColorButton = findViewById(R.id.changeColor);
        changeTextButton = findViewById(R.id.changeText);
        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Text Changed!");
            }
        });

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the text color between red and black
                if (!isTextColorChanged) {
                    textView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                    isTextColorChanged = true;
                } else {
                    textView.setTextColor(getResources().getColor(android.R.color.black));
                    isTextColorChanged = false;
                }
            }
        });
    }
}






