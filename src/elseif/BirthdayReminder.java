
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 15th";
		String dadsBirthday = "?";
		String myBirthday = "July 14th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String Bday = JOptionPane.showInputDialog("who's birthday do you want"); 
		// 3. Print out what the user typed
		System.out.println(Bday);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (Bday.equals("mom")) {
			JOptionPane.showMessageDialog(null, "November 15th");
		}
		
		
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (Bday.equals("dad")) {
			JOptionPane.showMessageDialog(null, "?");
		}
		// 6. if user asked for your name
			// print myBirthday
		else if (Bday.equals("my")) {
			JOptionPane.showMessageDialog(null, "July 14th");
		}
		
		
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else { JOptionPane.showMessageDialog(null, "Sorry i dont know that persons birthday");
			
		}
	} 

	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
