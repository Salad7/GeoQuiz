package com.example.itsadmin.geoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by itsadmin on 9/24/2016.
 */
public class CheatActivity extends AppCompatActivity {

    public static final String EXTRA_ANSWER_IS_TRUE = "com.example.itsadmin.geoquiz.answer_is_true";
    public static final String EXTRA_ANSWER_IS_SHOWN = "com.example.itsadmin.geoquiz";
    private TextView warningTV;
    private Button cheatBtn;

    @Override
    protected void onCreate(Bundle onSaveState)
    {
        super.onCreate(onSaveState);
        setContentView(R.layout.activity_cheat);

        setAnswerShownResult(false);

        warningTV = (TextView) findViewById(R.id.warningtxt);
        cheatBtn = (Button) findViewById(R.id.cheat_btn);
        cheatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnswerShownResult(true);
                if(getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE,false))
                {
                    warningTV.setText(R.string.true_btn);
                }
                else
                {
                    warningTV.setText(R.string.false_btn);
                }

            }
        });
    }

    private void setAnswerShownResult(boolean isAnswerShown){
        Intent dataToSendBack = new Intent();
        dataToSendBack.putExtra(EXTRA_ANSWER_IS_SHOWN, isAnswerShown);
        setResult(RESULT_OK,dataToSendBack);
    }
}
