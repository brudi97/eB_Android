package com.example.vermittlung;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Onboarding3 extends AppCompatActivity {

    private Button next3;
    private Button back2;
    private Button skip3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_2);

        next3 = findViewById(R.id.next3);
        back2 = findViewById(R.id.back2);
        skip3 = findViewById(R.id.skip_3);

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Onboarding3.this, Onboarding4.class);
                startActivity(intent);
            }
        });

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Onboarding3.this, Onboarding2.class);
                startActivity(intent2);
            }
        });

        skip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents3 = new Intent(Onboarding3.this, main_menu.class);
                startActivity(intents3);
            }
        });
    }
}
