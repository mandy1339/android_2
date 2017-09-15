package com.example.armando.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AccessControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);
        Log.d("ACCESS_CREATION", "ACCESS_CONTROL_ACTIVITY BEING CREATED HERE YO");
    }

    // DECLARE CODE
    String code = "";


    // ONCLICK METHODS

    // BTN-NUMBER ONCLICK METHOD
    public void onClickBtnNumber(View view) {
        Button btnNumber = (Button) findViewById(view.getId());
        code += btnNumber.getText();
        Log.e("CODE_STATUS", "code is: " + code);
    }

    // BTN-SUBMIT ONCLICK METHOD
    public void onClickSubmit(View view) {
        Log.e("CODE_STATUS", "code is: " + code);

        // If code == 1234 send 1 for success
        if(code.equals("1234")) {
            // GO TO WELCOME SCREEN WITH SUCCESS
            String code2 = code;
            code = "";
            Log.e("SUCCESS", "SUCCESS: " + code);
            Intent successIntent = new Intent(this, WelcomeActivity.class);
            successIntent.putExtra("SUCCESS", "SUCCESS");
            startActivity(successIntent);
        }

        // Else send 0 for failure
        else {
            // GO TO WELCOME SCREEN WITH SUCCESS
            Log.e("CODE_STATUS", "code is: " + code);
            String code2 = code;
            code = "";
            Log.e("FAILURE", "FAILURE: " + code);
            Intent successIntent = new Intent(this, WelcomeActivity.class);
            successIntent.putExtra("SUCCESS", "FAILURE");
            startActivity(successIntent);
        }



        //TODO GO TO MAIN PAGE WITH CODE AND
    }

}
