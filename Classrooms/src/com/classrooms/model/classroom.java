package com.classrooms.model;

import java.util.ArrayList;

import com.classrooms.R;

public class classroom {
	String name;
	String category;
	String description;
	int profilePicRef;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getProfilePicRef() {
		return profilePicRef;
	}


	public void setProfilePicRef(int profilePicRef) {
		this.profilePicRef = profilePicRef;
	}


	public static ArrayList<classroom> populateItems() {
		ArrayList<classroom> items = new ArrayList<classroom>();
	
		for (int x = 0; x < 10; x++) { 
			
			classroom item = new classroom();
			
			switch (x) {
				case 0: {
					item.name = "CS 175  Android";
					item.category = "Computing";
					item.description = "Mobile Android Development";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 1: {
					item.name = "Algebra";
					item.category = "Computing";
					item.description = "basic collage algebra";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 2: {
					item.name = "Calculus";
					item.category = "Math";
					item.description = "collage differential calculus";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 3: {
					item.name = "Drawing";
					item.category = "Arts";
					item.description = "Basic drawing for dummies";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 4: {
					item.name = "CS 126";
					item.category = "Computing";
					item.description = "Data Structures II";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 5: {
					item.name = "Engineering 101";
					item.category = "Engineering";
					item.description = "we build stuff";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 6: {
					item.name = "Nursing 101";
					item.category = "Health";
					item.description = "for the budding nurse in you ";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 7: {
					item.name = "Business 101";
					item.category = "Business";
					item.description = "entrepreneurs unite";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 8: {
					item.name = "Math 15";
					item.category = "Math";
					item.description = "Trigonometery";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
				case 9: {
					item.name = "Humn 1";
					item.category = "Art";
					item.description = "some art subject you need to take";
					item.profilePicRef = R.drawable.classrooms_logo;
				}
				break;
			}			
			items.add(item);
		}

		return items;
	}
}
