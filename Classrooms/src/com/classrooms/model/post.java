package com.classrooms.model;

import java.util.ArrayList;
import com.classrooms.R;


public class post {
	String name;
	String description;
	String date;
	String location;
	int profilePic;

	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public int getProfilePic() {
		return profilePic;
	}



	public void setProfilePic(int profilePic) {
		this.profilePic = profilePic;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}

	public static ArrayList<post> populateItems() {
		ArrayList<post> items = new ArrayList<post>();
		
		for (int x = 0; x < 1; x++) { 		
			post item = new post();			
			switch (x) {
				case 0: {
					item.name = "Michal";
					item.description = "My first post!!";
					item.date = "12/12/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.me_gusta;
				}
				break;
			}			
			items.add(item);
		}

		return items;
	}
}
