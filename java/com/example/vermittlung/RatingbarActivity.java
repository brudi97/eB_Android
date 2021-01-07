package com.example.vermittlung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingbarActivity extends AppCompatActivity {
    RatingBar rb1;
    TextView tv1;
    float userrating;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar);

       rb1 = (RatingBar) findViewById(R.id.ratingbar);
       rb1.setNumStars(5);
       rb1.setStepSize((float)0.5);
       rb1.setRating(5);

       // rb1.setisIndicator(true) : nimmt man für Bewertungen rein, die nur zur Schau dienen

        rb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                userrating = rb1.getRating();

                if(userrating == 0) {
                    rb1.setRating(1);
                }
                if(userrating == 1) {
                    tv1.setText("sehr schlecht (1 Stern)");
                }
                if(userrating == 2) {
                    tv1.setText("schlecht (2 Sterne)");
                }
                if(userrating == 3) {
                    tv1.setText("ok (3 Sterne)");
                }
                if(userrating == 4) {
                    tv1.setText("gut (4 Stern)");
                }
                if(userrating == 5) {
                    tv1.setText("sehr gut (5 Sterne)");
                }




            }
        });

        tv1 = (TextView) findViewById(R.id.textView17);
    }
}