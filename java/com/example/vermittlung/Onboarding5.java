package com.example.vermittlung;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Onboarding5 extends AppCompatActivity {

    private Button next_5;
    private Button back_4;
    private Button skip5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_4);

        next_5 = findViewById(R.id.next5);
        back_4 = findViewById(R.id.back4);
        skip5 = findViewById(R.id.skip_5);

        next_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent (Onboarding5.this, Onboarding6.class);
                startActivity(intent_1);
            }
        });

        back_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent (Onboarding5.this, Onboarding4.class);
                startActivity(intent_2);
            }
        });

        skip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents5 = new Intent(Onboarding5.this, main_menu.class);
                startActivity(intents5);
            }
        });
    }
}
