package com.classrooms.activity;

import android.app.ActionBar;
<<<<<<< HEAD
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.*;
=======
<<<<<<< HEAD
import android.graphics.Typeface;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.*;

=======
import android.text.Spannable;
import android.text.SpannableString;
>>>>>>> origin/revision-1
>>>>>>> origin/revision-1
import com.classrooms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
=======
<<<<<<< HEAD
import android.widget.AdapterView.OnItemClickListener;
=======
import android.widget.AdapterView;
>>>>>>> origin/revision-1
>>>>>>> origin/revision-1
import android.widget.AdapterView.OnItemSelectedListener;

public class makeClassroom extends Activity implements OnItemSelectedListener {
	String[] menu;
    DrawerLayout dLayout;
    ListView dList;
    ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makeclassroom);

		//Nav Drawer code starts here
		menu = getResources().getStringArray(R.array.draweritems);
        dLayout = (DrawerLayout) findViewById(R.id.makeclassroom_drawer_layout);
        dList = (ListView) findViewById(R.id.makeclassroom_drawer);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,menu);
        dList.setAdapter(adapter);
        dList.setSelector(android.R.color.holo_blue_dark);
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
		

        ActionBar actionBar =getActionBar();

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance

        actionBar.setTitle(s);

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
