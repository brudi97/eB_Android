package com.example.vermittlung;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivity extends AppCompatActivity {

    private Button person;
    private Button benach;
    private Button profanz;
    private ImageButton set;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.settings_activity, new SettingsFragment())
                    .commit();
        }
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        person = findViewById(R.id.btn_set02);
        benach = findViewById(R.id.btn_set04);
        set = findViewById(R.id.image02);
        profanz = findViewById(R.id.button_set01);

    person.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent1 = new Intent (SettingsActivity.this, PersonAngaben.class);
            startActivity(intent1);
        }
    });

    benach.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent2= new Intent(SettingsActivity.this, Benachrichtigung.class);
            startActivity(intent2);
        }
    });

    profanz.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent3 = new Intent (SettingsActivity.this, ProfAnz.class);
            startActivity(intent3);
        }
    });

    set.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent4 = new Intent(SettingsActivity.this, Einstellungen.class);
            startActivity(intent4);
        }
    });


    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
        }
    }
}