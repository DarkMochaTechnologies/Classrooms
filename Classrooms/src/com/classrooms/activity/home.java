package com.classrooms.activity;

import java.util.ArrayList;

import com.classrooms.R;
import com.classrooms.adapter.homeAdapter;
import com.classrooms.model.classroom;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class home extends ListActivity{
	private static final int REQUEST_CODE = 10;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		ArrayList<classroom> items = classroom.populateItems();
		
		super.onCreate(savedInstanceState);
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
}
