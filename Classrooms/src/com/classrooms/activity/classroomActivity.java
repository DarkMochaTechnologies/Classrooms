package com.classrooms.activity;

import com.classrooms.R;
import com.classrooms.adapter.classroomTabListener;
import com.classrooms.fragments.*;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class classroomActivity extends Activity{
	ActionBar.Tab tab1, tab2, tab3;
	Fragment classroomHomeFragment = new classroomHomeFragment();
	Fragment classroomPostsFragment = new classroomPostsFragment();
	Fragment classroomFilesFragment = new classroomFilesFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classroom);
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        tab1 = actionBar.newTab().setText("Home");
        tab2 = actionBar.newTab().setText("Posts");
        tab3 = actionBar.newTab().setText("Files");
        
        tab1.setTabListener(new classroomTabListener(classroomHomeFragment));
        tab2.setTabListener(new classroomTabListener(classroomPostsFragment));
        tab3.setTabListener(new classroomTabListener(classroomFilesFragment));
        
        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
        
        Bundle extras = getIntent().getExtras();
		if (extras == null){
			Toast.makeText(getApplicationContext(), "error in home to activity", Toast.LENGTH_LONG).show();
		}
		classroomHomeFragment fragment = new classroomHomeFragment(); //  object of next fragment
		fragment.setArguments(extras);
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
}
