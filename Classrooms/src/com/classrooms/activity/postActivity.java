package com.classrooms.activity;

import android.app.ActionBar;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;

import com.classrooms.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class postActivity extends Activity{
	String[] menu;
    DrawerLayout dLayout;
    ListView dList;
    ArrayAdapter<String> adapter;
    
	@Override
	protected void onCreate(Bundle bundle) {
		// TODO Auto-generated method stub
		super.onCreate(bundle);
		setContentView (R.layout.post_classroom);
		
		menu = getResources().getStringArray(R.array.draweritems);
        dLayout = (DrawerLayout) findViewById(R.id.post_classroom_drawer_layout);
        dList = (ListView) findViewById(R.id.post_classroom_drawer);
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
		
		Bundle extras = getIntent().getExtras();
		if (extras == null){
			return;
		}

        ActionBar actionBar =getActionBar();

        SpannableString s = new SpannableString("Classrooms");
        s.setSpan(new TypefaceSpan(this, "quicksand_book.otf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        // Update the action bar title with the TypefaceSpan instance

        actionBar.setTitle(s);


		int value1 = extras.getInt("profilePic");
		String value2 = extras.getString("name");
		String value3 = extras.getString("location");
		String value4 = extras.getString("description");
		TextView name = (TextView) findViewById(R.id.postclassroom_textView_name);
		TextView location = (TextView) findViewById(R.id.postclassroom_textView_location);
		TextView post = (TextView) findViewById(R.id.postclassroom_textView_post);
		ImageView profilePic = (ImageView) findViewById(R.id.postclassroom_imageView_profilePic);
			
		if (value2 !=null && value3 != null){
			name.setText(value2);
			location.setText(value3);
			post.setText(value4);
			profilePic.setImageResource(value1);
		}
		
		name.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Intent i = new Intent(getApplicationContext(),com.classrooms.activity.profile.class);
	                startActivity(i);
			   }
			});
		location.setOnClickListener(new View.OnClickListener() {
			   @Override
			   public void onClick(View v) {
				   Intent i = new Intent(getApplicationContext(),com.classrooms.activity.classroomActivity.class);
	                startActivity(i);
			   }
			});
	}

	public void onClick(View view){
		finish();
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
