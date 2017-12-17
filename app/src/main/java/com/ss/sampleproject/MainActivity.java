package com.ss.sampleproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    public static String mName = "sample";

    /*Button btn_login;
    TextView tv_login;*/
    @BindView(R.id.btn_login)
    Button btn_login;
    @BindView(R.id.tv_login)
    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
       /* btn_login = (Button) findViewById(R.id.btn_login);
        tv_login = (TextView) findViewById(R.id.tv_login);
*/
      /*  tv_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Click", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("mobile_nubmer", "9014332627");
                intent.putExtra("password", "545421");
                startActivity(intent);
            }
        });*/
    }

    @OnClick(R.id.tv_login)
    void navigateSecondScreen(){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("mobile_nubmer", "9014332627");
        intent.putExtra("password", "545421");
        startActivity(intent);
    }

}
