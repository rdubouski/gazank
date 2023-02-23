package com.example.gazank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_t, btn_q;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_q = (Button) findViewById(R.id.btn_quest);
        btn_q.setOnClickListener(this);
        btn_t = (Button) findViewById(R.id.btn_test);
        btn_t.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_quest:
                Intent intentq = new Intent(this, questionnaire.class);
                startActivity(intentq);
                break;
            case R.id.btn_test:
                Intent intentt = new Intent(this, test.class);
                startActivity(intentt);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}