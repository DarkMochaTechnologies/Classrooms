package com.classrooms.activity;

import android.app.ActionBar;
import android.text.Spannable;
import android.text.SpannableString;
import com.classrooms.R;

import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class profile extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.profile);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub

        ActionBar actionBar =getActionBar();

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance

        actionBar.setTitle(s);

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
}
