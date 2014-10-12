package com.classrooms.activity;

import com.classrooms.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		
		Button register = (Button) findViewById(R.id.register_button_register);
		final EditText username = (EditText)findViewById(R.id.register_editText_username);
		final EditText email = (EditText)findViewById(R.id.register_editText_email);
		final EditText password = (EditText)findViewById(R.id.register_editText_password);
		
		register.setOnClickListener(new View.OnClickListener() {
			 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),profile.class);
                i.putExtra("username", username.getText().toString());
                i.putExtra("email", email.getText().toString());
                i.putExtra("password", password.getText().toString());
                startActivity(i);
            }
        
        });
	}

}
