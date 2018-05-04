package com.example.welcome.navigation;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login2Activity extends Activity {
    EditText et_username,sh_password;
  Button button;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        et_username=findViewById(R.id.editText1);
        button= findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(login2Activity.this,MainActivity.class);
                sharedPreferences = getSharedPreferences("log",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String login=et_username.getText().toString();
                editor.putString("username",login);
                editor.apply();
               //
                startActivity(intent);

            }
        });
        }

}
