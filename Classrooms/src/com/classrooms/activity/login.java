package com.classrooms.activity;

import com.classrooms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		Button register = (Button) findViewById(R.id.login_button_register);
		Button login = (Button) findViewById(R.id.login_button_login);
		final EditText username = (EditText)findViewById(R.id.login_editText_username);
		final EditText password = (EditText)findViewById(R.id.login_editText_password);
        

        register.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),register.class);
                startActivity(i);
            }
        
        });
        
        login.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),home.class);
                i.putExtra("username", username.getText().toString());
                i.putExtra("password", password.getText().toString());
                startActivity(i);
            }
            
        
        });
	}

}
