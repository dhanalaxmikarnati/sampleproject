package com.ss.sampleproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private Intent intent;
    private String mobile_nubmer;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        intent = getIntent();
        mobile_nubmer = intent.getStringExtra("mobile_nubmer");
        password = intent.getStringExtra("password");
        Toast.makeText(SecondActivity.this, mobile_nubmer, Toast.LENGTH_SHORT).show();
        Toast.makeText(SecondActivity.this, password, Toast.LENGTH_SHORT).show();
    }
}
