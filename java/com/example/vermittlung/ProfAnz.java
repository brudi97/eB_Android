package com.example.vermittlung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfAnz extends AppCompatActivity {

    private Button bearb;
    private ImageButton back3;

    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilanzeige);

        bearb = findViewById(R.id.button05);
        back3 = findViewById(R.id.imageButton);

        bearb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbearb = new Intent(ProfAnz.this, ProfBearb.class);
                startActivity(intentbearb);
            }
        });

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentback3 = new Intent(ProfAnz.this, SettingsActivity.class);
                startActivity(intentback3);
            }
        });
    }
}
