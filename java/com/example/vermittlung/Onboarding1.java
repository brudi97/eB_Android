package com.example.vermittlung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Onboarding1 extends AppCompatActivity {

    private Button next1;
    private Button skip1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_start);

        next1 = findViewById(R.id.next1);
        skip1 = findViewById(R.id.skip1);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboarding1.this, Onboarding2.class);
                startActivity(intent);
            }
        });

        skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents1 = new Intent (Onboarding1.this, main_menu.class);
                startActivity(intents1);
            }
        });
    }


}