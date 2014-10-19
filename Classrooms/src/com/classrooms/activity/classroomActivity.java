package com.classrooms.activity;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.widget.*;
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
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import 	android.view.View;
import android.view.LayoutInflater;

public class classroomActivity extends Activity{
	ActionBar.Tab tab1, tab2, tab3;
	Fragment classroomHomeFragment = new classroomHomeFragment();
	Fragment classroomPostsFragment = new classroomPostsFragment();
	Fragment classroomFilesFragment = new classroomFilesFragment();
    String[] menu;
    DrawerLayout dLayout;
    ListView dList;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.classroom);
        Color color;
        menu = getResources().getStringArray(R.array.draweritems);
        dLayout = (DrawerLayout) findViewById(R.id.classroom_drawer_layout);
        dList = (ListView) findViewById(R.id.classroom_drawer);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
        dList.setAdapter(adapter);
        dList.setSelector(android.R.color.holo_blue_dark);
        dList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
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



        ActionBar actionBar = getActionBar();

        //actionBar.setBackgroundDrawable(new ColorDrawable(Color.rgb(255,255,255))); "quicksand_book.otf"

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance

        actionBar.setTitle(s);



        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        
        tab1 = actionBar.newTab().setText("Home");
        tab2 = actionBar.newTab().setText("Posts");
        tab3 = actionBar.newTab().setText("Files");
        
        tab1.setTabListener(new classroomTabListener(classroomHomeFragment));
        tab2.setTabListener(new classroomTabListener(classroomPostsFragment));
        tab3.setTabListener(new classroomTabListener(classroomFilesFragment));

        TextView view = new TextView(this);
        view.setText("Home");
        view.setPadding(4,20,4,0);
        view.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf"));

        TextView view2 = new TextView(this);
        view2.setText("Posts");
        view2.setPadding(4,20,4,0);
        view2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf"));

        TextView view3 = new TextView(this);
        view3.setText("Files");
        view3.setPadding(4,20,4,0);
        view3.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf"));

        tab1.setCustomView(view);
        tab2.setCustomView(view2);
        tab3.setCustomView(view3);

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
