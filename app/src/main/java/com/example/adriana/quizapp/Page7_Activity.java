package com.example.adriana.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Page7_Activity extends AppCompatActivity {

    public static int score = 0;
    CheckBox firstCorrectCheckbox, secondCorrectCheckbox;
    private Button nextButton;

    public static int getScore() {
        return score;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);

        firstCorrectCheckbox = (CheckBox) findViewById(R.id.checkbox1);
        secondCorrectCheckbox = (CheckBox) findViewById(R.id.checkbox3);

        nextButton = (Button) findViewById(R.id.nextButton);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (firstCorrectCheckbox.isChecked() && secondCorrectCheckbox.isChecked())
                    score = 1;

                startActivity(new Intent(getApplicationContext(), FinalPage_Activity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
