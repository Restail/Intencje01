package com.example.intencje1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button btnOpenNewActivity;
    private TextView tvLifetime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLifetime = (TextView) findViewById(R.id.tvLifetime);
        btnOpenNewActivity=(Button) findViewById(R.id.btnOpenNewActivity);
        btnOpenNewActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAnotherActivity = new Intent(getApplicationContext(), AnotherActivity.class);
                startActivity(startAnotherActivity);
            }
        });
        setCurrentStateInTextView("onCreate");
    }
    protected void onRestart(){
        super.onRestart();
        setCurrentStateInTextView("onRestart");
    }

    protected void onStart(){
        super.onStart();
        setCurrentStateInTextView("onStart");
    }
    protected void onResume(){
        super.onResume();
        setCurrentStateInTextView("onResume");
    }
    protected void onPause(){
        setCurrentStateInTextView("onPause");
        super.onPause();
    }
    protected void onStop(){
        setCurrentStateInTextView("onStop");
        super.onStop();
    }
    protected void onDestroy(){
        setCurrentStateInTextView("onDestroy");
        super.onDestroy();
    }
    private void setCurrentStateInTextView(String state){
        String text = tvLifetime.getText().toString() + state + " "
                + getNowTime() + "\n";
        tvLifetime.setText(text);
    }
    private String getNowTime(){
        DateFormat df = new SimpleDateFormat("H:m:s:S");
        Date now = Calendar.getInstance().getTime();
        return df.format(now);
    }
}