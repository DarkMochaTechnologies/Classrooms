package com.classrooms.activity;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.*;

import com.classrooms.R;
import com.classrooms.adapter.CustomTypefaceAdapter;
import com.classrooms.adapter.classroomTabListener;
import com.classrooms.fragments.*;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.graphics.Color;

import com.classrooms.ObjectDrawerItem;

public class classroomActivity extends Activity{
	ActionBar.Tab tab1, tab2, tab3;
	Fragment classroomHomeFragment = new classroomHomeFragment();
	Fragment classroomPostsFragment = new classroomPostsFragment();
	Fragment classroomFilesFragment = new classroomFilesFragment();
	String[] menu;
    String mTitle;

    private DrawerLayout dLayout;
    ListView dList;
    CustomTypefaceAdapter adapter;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classroom);
        ActionBar actionBar = getActionBar();

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        if(actionBar != null) {
            actionBar.setTitle(s);
        }
        //Nav Drawer code starts here

        menu = getResources().getStringArray(R.array.draweritems);

        ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[5];

        drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_action_copy, "Home");
        drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Profile");
        drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_action_share, "Create Class");
        drawerItem[3] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Write Post");
        drawerItem[4] = new ObjectDrawerItem(R.drawable.ic_action_share, "Upload File");

        dLayout = (DrawerLayout) findViewById(R.id.classroom_drawer_layout);
        dList = (ListView) findViewById(R.id.classroom_drawer);
        adapter = new CustomTypefaceAdapter(this, R.layout.draweritems, drawerItem);
        dList.setAdapter(adapter);
        dList.setSelector(new ColorDrawable(Color.parseColor("#B490C695")));
        dList.setOnItemClickListener(new OnItemClickListener(){
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
                if(getActionBar() != null) {
                    SpannableString s = new SpannableString(menu[position]);
                    s.setSpan(new TypefaceSpan(getApplicationContext(), "quicksand_book.otf"), 0, s.length(),
                            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    getActionBar().setTitle(s);
                }

	        }
        });
     // enable ActionBar app icon to behave as action to toggle nav drawer
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        // ActionBarDrawerToggle ties together the the proper interactions
        // between the sliding drawer and the action bar app icon
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                dLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer image to replace 'Up' caret */
                R.string.profile,  /* "open drawer" description for accessibility */
                R.string.profile  /* "close drawer" description for accessibility */
                ) {
            public void onDrawerClosed(View view) {
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        dLayout.setDrawerListener(mDrawerToggle);
        //Nav Drawer code ends here





        // Update the action bar title with the TypefaceSpan instance
        if(actionBar != null) {
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

            tab1 = actionBar.newTab().setText("Home");
            tab2 = actionBar.newTab().setText("Posts");
            tab3 = actionBar.newTab().setText("Files");

            tab1.setTabListener(new classroomTabListener(classroomHomeFragment));
            tab2.setTabListener(new classroomTabListener(classroomPostsFragment));
            tab3.setTabListener(new classroomTabListener(classroomFilesFragment));

            TextView view = new TextView(this);
            view.setText("Home");
            view.setPadding(4, 20, 4, 0);
            view.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf"));

            TextView view2 = new TextView(this);
            view2.setText("Posts");
            view2.setPadding(4, 20, 4, 0);
            view2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf"));

            TextView view3 = new TextView(this);
            view3.setText("Files");
            view3.setPadding(4, 20, 4, 0);
            view3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf"));

            tab1.setCustomView(view);
            tab2.setCustomView(view2);
            tab3.setCustomView(view3);

            actionBar.addTab(tab1);
            actionBar.addTab(tab2);
            actionBar.addTab(tab3);
        }
        Bundle extras = getIntent().getExtras();
		if (extras == null){
			Toast.makeText(getApplicationContext(), "error in home to activity", Toast.LENGTH_LONG).show();
		}
		classroomHomeFragment fragment = new classroomHomeFragment(); //  object of next fragment
		fragment.setArguments(extras);

    }
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
	     super.onPostCreate(savedInstanceState);
	     // Sync the toggle state after onRestoreInstanceState has occurred.
	     mDrawerToggle.syncState();
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	    super.onConfigurationChanged(newConfig);
	    mDrawerToggle.onConfigurationChanged(newConfig);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	     // Pass the event to ActionBarDrawerToggle, if it returns
	     // true, then it has handled the app icon touch event
	     if (mDrawerToggle.onOptionsItemSelected(item)) {
	         return true;
	     }
	     // Handle your other action bar items...
	
	     return super.onOptionsItemSelected(item);
	}
}
