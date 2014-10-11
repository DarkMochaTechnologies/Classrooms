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
		
		for (int x = 0; x < 10; x++) { 		
			post item = new post();			
			switch (x) {
				case 0: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 1 post!!";
					item.date = "12/12/12";
					item.location = "CS 123";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 1: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 2 post!!";
					item.date = "11/05/12";
					item.location = "Business 101";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 2: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 3 post!!";
					item.date = "12/12/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 3: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 4 post!!";
					item.date = "11/05/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 4: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 5th post!!";
					item.date = "11/05/12";
					item.location = "Drawing";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 5: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 6 post!!";
					item.date = "12/12/12";
					item.location = "Calculus";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 6: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 7 post!!";
					item.date = "11/05/12";
					item.location = "Nursing 101";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 7: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 8th post!!";
					item.date = "12/12/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 8: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 9th post!!";
					item.date = "11/05/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 9: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 10th post!!";
					item.date = "11/05/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
			}			
			items.add(item);
		}

		return items;
	}
}
