package com.classrooms.activity;

import java.util.ArrayList;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;

import android.view.LayoutInflater;
import com.classrooms.ObjectDrawerItem;
import com.classrooms.R;
import com.classrooms.adapter.CustomTypefaceAdapter;
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
    DrawerLayout dLayout;
    ListView dList;
    CustomTypefaceAdapter adapter2;
    String[] menu;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ArrayList<classroom> items = classroom.populateItems();
		super.onCreate(savedInstanceState);


        //Nav Drawer code starts here

       /* menu = getResources().getStringArray(R.array.draweritems);

        ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[5];

        drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_action_copy, "Home");
        drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Profile");
        drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_action_share, "Create Class");
        drawerItem[3] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Write Post");
        drawerItem[4] = new ObjectDrawerItem(R.drawable.ic_action_share, "Upload File");

        dLayout = (DrawerLayout) findViewById(R.id.home_drawer_layout);
        dList = (ListView) findViewById(R.id.home_drawer);
        adapter2 = new CustomTypefaceAdapter(this, R.layout.draweritems, drawerItem);
        if(adapter2 != null) {
            dList.setAdapter(adapter2);
            dList.setSelector(new ColorDrawable(Color.parseColor("#B490C695")));
            dList.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View v, int position, long id) {
                    dLayout.closeDrawers();

                    switch (position) {
                        case 0:
                            Intent i = new Intent(getApplicationContext(), com.classrooms.activity.home.class);
                            startActivity(i);
                            break;
                        case 1:
                            Intent j = new Intent(getApplicationContext(), com.classrooms.activity.profile.class);
                            startActivity(j);
                            break;
                        case 2:
                            Intent k = new Intent(getApplicationContext(), com.classrooms.activity.makeClassroom.class);
                            startActivity(k);
                            break;
                        case 3:
                            Intent l = new Intent(getApplicationContext(), com.classrooms.activity.makePost.class);
                            startActivity(l);
                            break;
                        default:
                            break;
                    }
                    if (getActionBar() != null) {
                        SpannableString s = new SpannableString(menu[position]);
                        s.setSpan(new TypefaceSpan(getApplicationContext(), "quicksand_book.otf"), 0, s.length(),
                                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        getActionBar().setTitle(s);
                    }

                }
            });
            //Nav Drawer code ends here
        }
     }*/

        ActionBar actionBar = getActionBar();

        SpannableString s = new SpannableString("Home");
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
