package com.example.vermittlung;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



public class Onboarding4 extends AppCompatActivity {

    private Button next4;
    private Button back3;
    private Button skip4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_3);

        next4 = findViewById(R.id.next4);
        back3 = findViewById(R.id.back3);
        skip4 = findViewById(R.id.skip_4);

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentone = new Intent(Onboarding4.this, Onboarding5.class);
                startActivity(intentone);
            }
        });

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsecond = new Intent(Onboarding4.this, Onboarding3.class);
                startActivity(intentsecond);
            }
        });

        skip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents4 = new Intent(Onboarding4.this, main_menu.class);
                startActivity(intents4);
            }
        });

    }
}
