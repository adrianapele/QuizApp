package com.example.adriana.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FinalPage_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);

        Button submitButton = (Button) findViewById(R.id.submit);

        final int result = Page1_Activity.getScore() + Page2_Activity.getScore() + Page3_Activity.getScore() + Page4_Activity.getScore() + Page5_Activity.getScore() + Page6_Activity.getScore() + Page7_Activity.getScore();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result > 3)
                    Toast.makeText(getApplicationContext(), "You rock!! Your score is " + result + " :)", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "You answered correct only at " + result + " questions. Sorry :(", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
    }

}
