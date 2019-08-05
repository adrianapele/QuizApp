package com.example.adriana.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Page6_Activity extends AppCompatActivity {

    private static int score = 0;
    private EditText editText;
    private Button nextButton;

    public static int getScore() {
        return score;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page6);

        editText = (EditText) findViewById(R.id.input_text);
        nextButton = (Button) findViewById(R.id.nextButton);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText.getText().equals("35"))
                    score = 1;

                startActivity(new Intent(getApplicationContext(), Page7_Activity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
    }
}
