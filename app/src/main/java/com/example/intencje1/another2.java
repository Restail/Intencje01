package com.example.intencje1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class another2 extends AppCompatActivity {

 private TextView textViewOstatni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another2);
        textViewOstatni = (TextView) findViewById(R.id.textViewostatni);
        setCurrentStateInTextView2("onCreate");
    }
    protected void onRestart(){
        super.onRestart();
        setCurrentStateInTextView2("onRestart");
    }

    protected void onStart(){
        super.onStart();
        setCurrentStateInTextView2("onStart");
    }
    protected void onResume(){
        super.onResume();
        setCurrentStateInTextView2("onResume");
    }
    protected void onPause(){
        setCurrentStateInTextView2("onPause");
        super.onPause();
    }
    protected void onStop(){
        setCurrentStateInTextView2("onStop");
        super.onStop();
    }
    protected void onDestroy(){
        setCurrentStateInTextView2("onDestroy");
        super.onDestroy();
    }
    private void setCurrentStateInTextView2(String state){
        String text = textViewOstatni.getText().toString() + state + " "
                + getNowTime2() + "\n";
        textViewOstatni.setText(text);
    }
    private String getNowTime2(){
        DateFormat df = new SimpleDateFormat("H:m:s:S");
        Date now = Calendar.getInstance().getTime();
        return df.format(now);
    }
}