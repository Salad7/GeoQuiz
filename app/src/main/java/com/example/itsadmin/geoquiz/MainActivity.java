package com.example.itsadmin.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Wiring up buttons
    private Button mTrueButton;
    private Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Connecting Button objects to the proper view
        mFalseButton = (Button) findViewById(R.id.false_id);
        mTrueButton = (Button) findViewById(R.id.true_id);

        //Set up Listeners for the buttons

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Stuff
                Toast.makeText(getApplicationContext(),R.string.incorrect_toast,Toast.LENGTH_SHORT);
            }
        });

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Stuff
                Toast.makeText(getApplicationContext(),R.string.correct_toast,Toast.LENGTH_SHORT);
            }
        });
    }
}
