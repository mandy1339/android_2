package com.example.armando.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    String adora = "ADORA";
    String success = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Log.e("CREATION","Welcome Activity Being Created Here " + adora);

        // GET INTENT FROM ACCESS_CONTROL
        Intent intent2 = getIntent();
        success = intent2.getStringExtra("SUCCESS");

        if(success == null) {
            return;
        }
        if(success != null && success.equals("SUCCESS")) {
            Log.e("SUCCESS", "SUCCESS INTENT");
        }
        else {
            Log.e("FAILURE", "FAILURE");
        }
        Log.e("INTENT_RECEIVAL", success);
    }



    public void display(String str) {
        TextView outMessage = (TextView) findViewById(R.id.txt2);
        outMessage.setText(str);
    }

    // on click action for button
    public void onClickBtnUnlock(View view) {
        display("view.getId() is: " + view.getId());
        Intent myIntent = new Intent(this, AccessControlActivity.class);
        startActivity(myIntent);
    }
}
