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
        success = intent2.getStringExtra("SUCCESS");        // set success string
        displayLockStatus();
    }


    public void displayLockStatus() {
        if(success == null) {
            return;
        }
        if(success != null && success.equals("SUCCESS")) {
            Log.e("SUCCESS", "SUCCESS INTENT");
            TextView txtView1 = (TextView) findViewById(R.id.txtView1);
            txtView1.setText("The App is Unlocked");
        }
        else {
            Log.e("FAILURE", "FAILURE");
        }
        Log.e("INTENT_RECEIVE", success);

    }



    // on click action for button
    public void onClickBtnUnlock(View view) {
        Intent myIntent = new Intent(this, AccessControlActivity.class);
        startActivity(myIntent);
    }
}
