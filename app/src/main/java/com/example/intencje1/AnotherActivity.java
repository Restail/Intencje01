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

public class AnotherActivity extends AppCompatActivity {

    private Button buttondrugi;
    private TextView textViewdrugi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        textViewdrugi = (TextView) findViewById(R.id.textViewdrugi);
        buttondrugi=(Button) findViewById(R.id.buttondrugi);
        buttondrugi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAnotherActivity = new Intent(getApplicationContext(), another2.class);
                startActivity(startAnotherActivity);
            }

        });
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
        String text = textViewdrugi.getText().toString() + state + " "
                + getNowTime2() + "\n";
        textViewdrugi.setText(text);
    }
    private String getNowTime2(){
        DateFormat df = new SimpleDateFormat("H:m:s:S");
        Date now = Calendar.getInstance().getTime();
        return df.format(now);
    }
}