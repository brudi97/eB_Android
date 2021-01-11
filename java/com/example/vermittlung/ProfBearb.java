package com.example.vermittlung;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class ProfBearb extends AppCompatActivity {

    private ImageButton back2;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_bearb);

        back2 = findViewById(R.id.imageButton10);

        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentback2 = new Intent(ProfBearb.this, ProfAnz.class);
                startActivity(intentback2);
            }
        });
    }
}
