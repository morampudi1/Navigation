package com.example.welcome.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {
        EditText et_fname,et_lname,et_uname,et_pass,et_mnumber;
    Button bt_rigsiter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_fname=findViewById(R.id.et_fname);
        et_lname=findViewById(R.id.et_lname);
        et_uname=findViewById(R.id.et_uname);
        et_pass=findViewById(R.id.et_pass);
        et_mnumber=findViewById(R.id.et_mnumber);
        bt_rigsiter=findViewById(R.id.bt_rigister);
        bt_rigsiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(RegisterActivity.this,LoginActivity.class);

                if (et_fname.getText().toString().isEmpty()) {
                    et_fname.requestFocus();
                    et_fname.setError("Enter first name");
                } else if (et_pass.getText().toString().isEmpty()) {
                    et_pass.requestFocus();
                    et_pass.setError("Enter Password");

                }
                startActivity(intent);

            }
        });

    }
}
