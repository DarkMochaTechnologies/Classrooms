package com.classrooms.activity;

import java.util.ArrayList;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;

import com.classrooms.R;
import com.classrooms.adapter.homeAdapter;
import com.classrooms.model.classroom;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class home extends ListActivity{
	private static final int REQUEST_CODE = 10;
	String[] menu;
    DrawerLayout dLayout;
    ListView dList3;
    ArrayAdapter<String> adapter2;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ArrayList<classroom> items = classroom.populateItems();
		super.onCreate(savedInstanceState);
		
		menu = getResources().getStringArray(R.array.draweritems);
        dLayout = (DrawerLayout) findViewById(R.id.home_drawer_layout);
        dList3 = (ListView) findViewById(R.id.home_drawer);
        if (dList3 != null){
        adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
        dList3.setAdapter(adapter2);
        dList3.setSelector(android.R.color.holo_blue_dark);
        dList3.setOnItemClickListener(new OnItemClickListener(){
	        @Override
	        public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
		        dLayout.closeDrawers();
		        
		        switch (position) {
			    case 0:
			    	Intent i = new Intent(getApplicationContext(),com.classrooms.activity.home.class);
	                startActivity(i);
			    	break;
			    case 1:
			    	Intent j = new Intent(getApplicationContext(),com.classrooms.activity.profile.class);
	                startActivity(j);
			      	break;
			    case 2:
			    	Intent k = new Intent(getApplicationContext(),com.classrooms.activity.makeClassroom.class);
	                startActivity(k);
			      	break;
			    case 3:
			    	Intent l = new Intent(getApplicationContext(),com.classrooms.activity.makePost.class);
	                startActivity(l);
			      	break;
			    default:
			    	break;
		        }
		        
	        }
        });
        }

        ActionBar actionBar = getActionBar();

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance
        actionBar.setTitle(s);
		homeAdapter adapter = new homeAdapter(this,items);
		this.setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		classroom item = (classroom) getListAdapter().getItem(position);

		Intent i = new Intent(this, classroomActivity.class);
		i.putExtra("background", item.getProfilePicRef());
		i.putExtra("name", item.getName());
		i.putExtra("description", item.getDescription());
		startActivityForResult(i, REQUEST_CODE);
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
