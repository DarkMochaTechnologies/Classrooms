package com.classrooms.activity;

import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;

import com.classrooms.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class register extends Activity{
	private static int RESULT_LOAD_IMAGE = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		ActionBar actionBar = getActionBar();
		actionBar.hide();

        Typeface[] typeFace = new Typeface[7];

        typeFace[0] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_bold.otf");
        typeFace[1] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_book.otf");
        typeFace[2] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_bold_oblique.otf");
        typeFace[3] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_book_oblique.otf");
        typeFace[4] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_dash.otf");
        typeFace[5] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf");
        typeFace[6] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light_oblique.otf");
		
        Button buttonLoadImage = (Button) findViewById(R.id.register_button_selectpic);
		Button register = (Button) findViewById(R.id.register_button_register);
		final EditText username = (EditText)findViewById(R.id.register_editText_username);
		final EditText email = (EditText)findViewById(R.id.register_editText_email);
		final EditText password = (EditText)findViewById(R.id.register_editText_password);

		buttonLoadImage.setTypeface(typeFace[5]);
        register.setTypeface(typeFace[5]);
        username.setTypeface(typeFace[6]);
        password.setTypeface(typeFace[6]);
        email.setTypeface(typeFace[6]);
		
        buttonLoadImage.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View arg0) {
                 
                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                 
                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
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
	@Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
         
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
 
            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();
 
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();
             
            ImageView imageView = (ImageView) findViewById(R.id.register_imageView_profilepic);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));
         
        }   
    }
}
