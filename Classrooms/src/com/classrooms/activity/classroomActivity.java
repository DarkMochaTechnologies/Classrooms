package com.classrooms.activity;

import com.classrooms.R;
import com.classrooms.adapter.classroomTabListener;
import com.classrooms.fragments.*;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

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
    }
}
