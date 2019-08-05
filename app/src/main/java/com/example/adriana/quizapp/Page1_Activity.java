package com.example.adriana.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Page1_Activity extends AppCompatActivity {

    private static int score = 0;
    private RadioGroup radioGroupQuestion1;
    private Button nextButton;

    public static int getScore() {
        return score;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        radioGroupQuestion1 = (RadioGroup) findViewById(R.id.radioGroup);
        nextButton = (Button) findViewById(R.id.nextButton);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int radioBtnId = radioGroupQuestion1.getCheckedRadioButtonId();

                if (radioBtnId == R.id.radioButton1)
                    score = 1;

                startActivity(new Intent(getApplicationContext(), Page2_Activity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
