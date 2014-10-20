package com.classrooms.activity;

import android.app.ActionBar;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.*;

import android.support.v4.widget.DrawerLayout;


import com.classrooms.ObjectDrawerItem;
import com.classrooms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView.OnItemClickListener;

import android.widget.AdapterView;

import android.widget.AdapterView.OnItemSelectedListener;
import com.classrooms.adapter.CustomTypefaceAdapter;

public class makeClassroom extends Activity implements OnItemSelectedListener {
	String[] menu;
    DrawerLayout dLayout;
    ListView dList;
    CustomTypefaceAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makeclassroom);

        SpannableString s = new SpannableString("Make Classroom");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        if(getActionBar()!= null) {
            getActionBar().setTitle(s);
        }

        ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[5];

        drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_action_copy, "Home");
        drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Profile");
        drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_action_share, "Create Class");
        drawerItem[3] = new ObjectDrawerItem(R.drawable.ic_action_refresh, "Write Post");
        drawerItem[4] = new ObjectDrawerItem(R.drawable.ic_action_share, "Upload File");

        dLayout = (DrawerLayout) findViewById(R.id.makeclassroom_drawer_layout);
        dList = (ListView) findViewById(R.id.makeclassroom_drawer);
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

            }
        });
        //Nav Drawer code ends here
        
		
		Spinner spinner = (Spinner) findViewById(R.id.makeClassroom_spinner_category);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
		        R.array.catagories_array, android.R.layout.simple_spinner_item);


        Typeface[] typeFace = new Typeface[2];

        typeFace[0] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_light.otf");
        typeFace[1] = Typeface.createFromAsset(getAssets(), "fonts/quicksand_book.otf");

        Button create = (Button) findViewById(R.id.makeClassroom_button_createClassroom);
        final EditText name = (EditText)findViewById(R.id.makeClassroom_editText_name);
        final EditText post = (EditText)findViewById(R.id.makeClassroom_editText_description);
        final TextView nameLabel = (TextView) findViewById(R.id.makeClassroom_textView_name);
        final TextView courseLabel = (TextView) findViewById(R.id.makeClassroom_textView_course);

        if(nameLabel != null && courseLabel != null){
            nameLabel.setTypeface(typeFace[1]);
            courseLabel.setTypeface(typeFace[1]);
        }
        create.setTypeface(typeFace[1]);

        name.setTypeface(typeFace[0]);
        post.setTypeface(typeFace[0]);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

}
