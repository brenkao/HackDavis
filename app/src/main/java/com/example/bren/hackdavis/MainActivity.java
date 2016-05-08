package com.example.bren.hackdavis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submitButton = (Button) findViewById(R.id.submit);
        final EditText user = (EditText) findViewById(R.id.uName);
        final EditText pass = (EditText) findViewById(R.id.passphrase);
        final TextView tv = (TextView)findViewById(R.id.invalid);

        String username = getIntent().getStringExtra("Username");
        String password = getIntent().getStringExtra("Password");

        submitButton.setOnClickListener(
            new Button.OnClickListener() {
                public void onClick(View v) {
                    if (user.getText().toString().length() > 0 && pass.getText().toString().length() > 0)
                        startActivity(new Intent(MainActivity.this, sidebar.class));
                    else
                        tv.setVisibility(View.VISIBLE);
                }
            }
        );
    }
    @Override
    public void onResume()
    {  // After a pause OR at startup
        super.onResume();
        //Refresh your stuff here
        TextView tv = (TextView) findViewById(R.id.invalid);
        tv.setVisibility(View.INVISIBLE);
    }
}
