package com.classrooms.activity;

import android.graphics.Typeface;
import com.classrooms.R;

import android.app.ActionBar;
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
        Typeface[] typeFace = new Typeface[7];

        typeFace[0] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_bold.otf");
        typeFace[1] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_book.otf");
        typeFace[2] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_bold_oblique.otf");
        typeFace[3] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_book_oblique.otf");
        typeFace[4] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_dash.otf");
        typeFace[5] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf");
        typeFace[6] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light_oblique.otf");


		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		ActionBar actionBar = getActionBar();
		actionBar.hide();
		
		Button register = (Button) findViewById(R.id.login_button_register);
		Button login = (Button) findViewById(R.id.login_button_login);
		final EditText username = (EditText)findViewById(R.id.login_editText_username);
		final EditText password = (EditText)findViewById(R.id.login_editText_password);

        login.setTypeface(typeFace[1]);
        register.setTypeface(typeFace[1]);
        username.setTypeface(typeFace[6]);
        password.setTypeface(typeFace[6]);
        

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
