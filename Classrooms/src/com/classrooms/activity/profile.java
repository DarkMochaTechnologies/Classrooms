package com.classrooms.activity;

import android.app.ActionBar;
import android.support.v4.widget.DrawerLayout;
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
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class profile extends Activity{
	String[] menu1;
    DrawerLayout dLayout1;
    ListView dList1;
    ArrayAdapter<String> adapter1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.profile);
		
		//Nav Drawer code starts here
		menu1 = getResources().getStringArray(R.array.draweritems);
        dLayout1 = (DrawerLayout) findViewById(R.id.profile_drawer_layout);
        dList1 = (ListView) findViewById(R.id.profile_drawer);
        adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu1);
        dList1.setAdapter(adapter1);
        dList1.setSelector(android.R.color.holo_blue_dark);
        dList1.setOnItemClickListener(new OnItemClickListener(){
	        @Override
	        public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
		        dLayout1.closeDrawers();
		        
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
      //Nav Drawer code ends here
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
