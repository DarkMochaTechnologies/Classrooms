package com.classrooms.activity;

import android.app.ActionBar;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.Button;
import android.widget.EditText;
import com.classrooms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class postActivity extends Activity{
	@Override
	protected void onCreate(Bundle bundle) {
		// TODO Auto-generated method stub
		super.onCreate(bundle);
		setContentView (R.layout.post_classroom);
		Bundle extras = getIntent().getExtras();
		if (extras == null){
			return;
		}


        ActionBar actionBar =getActionBar();

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance

        actionBar.setTitle(s);

        Typeface[] typeFace = new Typeface[3];

        typeFace[0] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf");
        typeFace[1] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light_oblique.otf");
        typeFace[2] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_book.otf");
        Button commentButton= (Button) findViewById(R.id.postclassroom_button_comment);
        final EditText comment = (EditText)findViewById(R.id.postclassroom_editText_comment);

        final TextView postin = (TextView) findViewById(R.id.postclassroom_textView_postedin);

		int value1 = extras.getInt("profilePic");
		String value2 = extras.getString("name");
		String value3 = extras.getString("location");
		String value4 = extras.getString("description");

		TextView name = (TextView) findViewById(R.id.postclassroom_textView_name);
		TextView location = (TextView) findViewById(R.id.postclassroom_textView_location);
		TextView post = (TextView) findViewById(R.id.postclassroom_textView_post);
		ImageView profilePic = (ImageView) findViewById(R.id.postclassroom_imageView_profilePic);


        commentButton.setTypeface(typeFace[0]);
        name.setTypeface(typeFace[0]);
        comment.setTypeface(typeFace[0]);
        post.setTypeface(typeFace[0]);
        postin.setTypeface(typeFace[1]);
        location.setTypeface(typeFace[1]);
			
		if (value2 !=null && value3 != null){
			name.setText(value2);
			location.setText(value3);
			post.setText(value4);
			profilePic.setImageResource(value1);
		}
		
		name.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Intent i = new Intent(getApplicationContext(),com.classrooms.activity.profile.class);
	                startActivity(i);
			   }
			});
		location.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Intent i = new Intent(getApplicationContext(),com.classrooms.activity.classroomActivity.class);
	                startActivity(i);
			   }
			});
	}

	public void onClick(View view){
		finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		    case R.id.menu_home:
		    	Intent i = new Intent(this,com.classrooms.activity.home.class);
                startActivity(i);
		    	break;
		    case R.id.menu_profile:
		    	Intent j = new Intent(this,com.classrooms.activity.profile.class);
                startActivity(j);
		      	break;
		    case R.id.menu_makeClassroom:
		    	Intent k = new Intent(this,com.classrooms.activity.makeClassroom.class);
                startActivity(k);
		      	break;
		    case R.id.menu_writePost:
		    	Intent l = new Intent(this,com.classrooms.activity.makePost.class);
                startActivity(l);
		      	break;
		    default:
		    	break;
	    }

	    return true;
	}

	@Override
	public void finish() {
		Intent data = new Intent();
		data.putExtra("returnKey1", "1");
		data.putExtra("returnkey2", "2");
		setResult(RESULT_OK, data);
		super.finish();
	}
	
	
}
