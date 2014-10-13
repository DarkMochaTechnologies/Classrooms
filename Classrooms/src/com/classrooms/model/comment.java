package com.classrooms.model;

import java.util.ArrayList;
import com.classrooms.R;


public class comment {
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

	public static ArrayList<comment> populateItems() {
		ArrayList<comment> items = new ArrayList<comment>();
		
		for (int x = 0; x < 20; x++) { 		
			comment item = new comment();			
			switch (x) {
				case 0: {
					item.name = "Michael Vincent Ymbong";
					item.description = "this is a comment";
					item.date = "12/12/14";
					item.location = "CS 123";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 1: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "this is a comment!!";
					item.date = "11/05/14";
					item.location = "Business 101";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 2: {
					item.name = "Michael Vincent Ymbong";
					item.description = "this is a comment!";
					item.date = "7/12/14";
					item.location = "CS 175";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 3: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "this is a comment";
					item.date = "5/05/14";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 4: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "this is a comment!";
					item.date = "1/05/14";
					item.location = "Drawing";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 5: {
					item.name = "Michael Vincent Ymbong";
					item.description = "this is a comment";
					item.date = "11/12/13";
					item.location = "Calculus";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 6: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "this is a comment!";
					item.date = "11/08/13";
					item.location = "Nursing 101";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 7: {
					item.name = "Michael Vincent Ymbong";
					item.description = "this is a comment!";
					item.date = "11/06/13";
					item.location = "CS 175";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 8: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "this is a comment!";
					item.date = "11/05/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 9: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "this is a comment";
					item.date = "11/05/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 10: {
					item.name = "Michael Vincent Ymbong";
					item.description = "this is a comment!!";
					item.date = "12/12/14";
					item.location = "CS 123";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 11: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 8this is a comment!";
					item.date = "11/05/14";
					item.location = "Business 101";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 12: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 9 this is a comment!!";
					item.date = "7/12/14";
					item.location = "CS 175";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 13: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 7 post!!";
					item.date = "5/05/14";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 14: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 6th post!!";
					item.date = "1/05/14";
					item.location = "Drawing";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 15: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 8th post!!";
					item.date = "11/12/13";
					item.location = "Calculus";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 16: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 5 post!!";
					item.date = "11/08/13";
					item.location = "Nursing 101";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 17: {
					item.name = "Michael Vincent Ymbong";
					item.description = "My 7th post!!";
					item.date = "11/06/13";
					item.location = "CS 175";
					item.profilePic = R.drawable.michael;
				}
				break;
				case 18: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 4th post!!";
					item.date = "11/05/12";
					item.location = "CS 175";
					item.profilePic = R.drawable.louiz;
				}
				break;
				case 19: {
					item.name = "Louiz Vincent Echiverri";
					item.description = "My 3th post!!";
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
