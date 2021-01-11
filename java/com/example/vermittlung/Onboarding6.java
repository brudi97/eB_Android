package com.example.vermittlung;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Onboarding6 extends AppCompatActivity {

    private Button back5;
    private Button start;
    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_end);

        back5 = findViewById(R.id.back5);
        start = findViewById(R.id.go_1);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentstart = new Intent(Onboarding6.this, SettingsActivity.class);
                startActivity(intentstart);
            }
        });

        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentback = new Intent(Onboarding6.this, Onboarding5.class);
                startActivity(intentback);
            }
        });


    }
}
