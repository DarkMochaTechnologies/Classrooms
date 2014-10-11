package com.classrooms.activity;

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
		setContentView (R.layout.post);
		Bundle extras = getIntent().getExtras();
		if (extras == null){
			return;
		}
		int value1 = extras.getInt("profilepic");
		String value2 = extras.getString("name");
		String value3 = extras.getString("location");
		String value4 = extras.getString("description");
		if (value2 !=null && value3 != null){
			TextView name = (TextView) findViewById(R.id.post_textView_name);
			TextView location = (TextView) findViewById(R.id.post_textView_location);
			TextView post = (TextView) findViewById(R.id.post_textView_post);
			ImageView profilePic = (ImageView) findViewById(R.id.post_imageView_profilePic);
			name.setText(value2);
			location.setText(value3);
			post.setText(value4);
			profilePic.setImageResource(value1);
		}
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
