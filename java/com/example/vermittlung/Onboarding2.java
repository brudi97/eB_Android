package com.example.vermittlung;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class Onboarding2 extends AppCompatActivity {
    // Klassenglobale Variablen
        private Button next_2;
        private Button back1;
        private Button skip_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Verknüpfen der Activity mit dem Layout-File
        setContentView(R.layout.activity_onboarding_1);
        // Verknüpft die oben angelegten Variablen mit XML-Layout-Element über die ID
        next_2 = findViewById(R.id.next2);
        // Festlegen eines Click-Events mittels OnClickListener
        next_2.setOnClickListener(new View.OnClickListener() {
            // Methode, die definiert, was bei einem Klick geschieht
            @Override
            public void onClick(View v) {
                Intent gotoSecond = new Intent(Onboarding2.this, Onboarding3.class);
                startActivity(gotoSecond);
            }
        });

        back1 = findViewById(R.id.back1);

        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Onboarding2.this, Onboarding1.class);
                startActivity(intent2);
            }

        });

        skip_2 = findViewById(R.id.skip_2);

        skip_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intents2 = new Intent(Onboarding2.this, main_menu.class);
                startActivity(intents2);
            }
        });
    }

}