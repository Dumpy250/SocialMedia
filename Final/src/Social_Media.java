
//////////////////////////////////////////// Cameron Basham // Programming 101 // Final // Social_Media ///////////////////////////////////////////////////////////////////////////////

import java.util.Random;
import java.util.Scanner;

public class Social_Media {
	
	public static String [] UserName = new String[20];
	public static String [] PassWord = new String[20];
	public static String [] Posts = new String[100];
	public static Scanner scnr = new Scanner(System.in);
	public static Random RnG = new Random();
	static public int CurUserID = 0; 
	static public int numUsers = 0;
	static public int numPosts = 0;
	static public int numlikes = 0;
	static public int numdislikes = 0;
	static public int [] numDislikes = new int[100];
	static public int [] numLikes = new int[100];
	public static String [] PostOwner = new String [100];
	
	public static void printASCII() {										////////ASCII ART Method/////////////
		System.out.println(" _________  ___  ___  _______           ________  ________  ________  ___  ________  ___               _____ ______   _______   ________  ___  ________          ________  ________  ________   \r\n"
				+ "|\\___   ___\\\\  \\|\\  \\|\\  ___ \\         |\\   ____\\|\\   __  \\|\\   ____\\|\\  \\|\\   __  \\|\\  \\             |\\   _ \\  _   \\|\\  ___ \\ |\\   ___ \\|\\  \\|\\   __  \\        |\\   __  \\|\\   __  \\|\\   __  \\  \r\n"
				+ "\\|___ \\  \\_\\ \\  \\\\\\  \\ \\   __/|        \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\___|\\ \\  \\ \\  \\|\\  \\ \\  \\            \\ \\  \\\\\\__\\ \\  \\ \\   __/|\\ \\  \\_|\\ \\ \\  \\ \\  \\|\\  \\       \\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\|\\  \\ \r\n"
				+ "     \\ \\  \\ \\ \\   __  \\ \\  \\_|/__       \\ \\_____  \\ \\  \\\\\\  \\ \\  \\    \\ \\  \\ \\   __  \\ \\  \\            \\ \\  \\\\|__| \\  \\ \\  \\_|/_\\ \\  \\ \\\\ \\ \\  \\ \\   __  \\       \\ \\   __  \\ \\   ____\\ \\   ____\\\r\n"
				+ "      \\ \\  \\ \\ \\  \\ \\  \\ \\  \\_|\\ \\       \\|____|\\  \\ \\  \\\\\\  \\ \\  \\____\\ \\  \\ \\  \\ \\  \\ \\  \\____        \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\ \\  \\_\\\\ \\ \\  \\ \\  \\ \\  \\       \\ \\  \\ \\  \\ \\  \\___|\\ \\  \\___|\r\n"
				+ "       \\ \\__\\ \\ \\__\\ \\__\\ \\_______\\        ____\\_\\  \\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\__\\ \\_______\\       \\ \\__\\    \\ \\__\\ \\_______\\ \\_______\\ \\__\\ \\__\\ \\__\\       \\ \\__\\ \\__\\ \\__\\    \\ \\__\\   \r\n"
				+ "        \\|__|  \\|__|\\|__|\\|_______|       |\\_________\\|_______|\\|_______|\\|__|\\|__|\\|__|\\|_______|        \\|__|     \\|__|\\|_______|\\|_______|\\|__|\\|__|\\|__|        \\|__|\\|__|\\|__|     \\|__|   \r\n"
				+ "                                                                                             \r\n"
				+ "                                                                                                                                                                                      ");
	}
	
	public static boolean isValid(String name) {							/////////Password Method////////
		String passwrd;
		boolean HasNum = false;
		boolean HasLowcase = false;
		boolean HasUppercase = false;
		boolean HasSpecchar = false;
		boolean Has8 = false;
		boolean Passed = false;
		int j;
		char index;
		
		passwrd = name;						
									
			for (j = 0; j < passwrd.length(); ++j) {					
				
				index = passwrd.charAt(j);
				
					if ((index >= 'a'  ) && (index <= 'z')) {
					HasLowcase = true;										
					}
					if ((index >= 'A') && (index <= 'Z')) {
					HasUppercase = true;
					}
					if ((index >= '0') && (index <= '9')) {
					HasNum = true;					
					}
					if (!Character.isLetterOrDigit(index)){
					HasSpecchar=true;
					}
				}
			if (passwrd.length() >= 8) {
				Has8 = true;										
			}		
				  if (HasSpecchar == false) {
							System.out.println("Your password must contain special charachter numbers 1 - 0 on they keyboard");
							}
						
						if (Has8 == false) {
							System.out.println("Password must be 8 or more characters");
							}
						if (HasLowcase == false) {
							System.out.println("Your Password must contain a Lowercase");
							}
						if (HasUppercase == false) {
							System.out.println("Your Password must Contain a Uppercase");
							}
						if (! HasNum  ) {
							System.out.println("Password must contain a number");
							}
						
								System.out.println("");
						if (HasSpecchar  && Has8  && HasLowcase  && HasUppercase && HasNum ) {
									Passed = true;
									}
									else {
										Passed = false;
										System.out.println("Please try again");
									}
						return Passed;
	}
	
	public static void Math_Quiz() {									/////////// Math Quiz Method //////////////
		int RandNum;
		int RandNum2;
		int RandOp;
		int i;
		int j;
		int Awnser = 0;
		int guess;
		int TotalScore = 0;
		int grade = 0;
		
		System.out.println("This is a 5 question math quiz.");	
		System.out.println("Good Luck");		
		
		for (i = 0; i < 5; ++i) {					
			RandNum = RnG.nextInt(12) + 1;
			RandNum2 = RnG.nextInt(12) + 1;
			RandOp = RnG.nextInt(5) + 1;
			System.out.println("Generating....");		
			
		switch (RandOp) {
		case 1:
			RandOp = 43;
			Awnser = RandNum + RandNum2;
			break;
		case 2:
		    RandOp = 47;
			Awnser = RandNum / RandNum2;
			break;
		case 3:
			RandOp = 45;
			Awnser = RandNum - RandNum2;
			break;
		case 4:
			RandOp = 42;
			Awnser = RandNum * RandNum2;
			break;
		case 5:
			RandOp = 37;
			Awnser = RandNum % RandNum2;
			break;
	     }
		System.out.println(RandNum + " " + (char) RandOp + " " + RandNum2);
		System.out.println("Enter your awnser...");
		
		guess = scnr.nextInt();
			for (j = 0; j < 1; ++j) {
				if (guess == Awnser) {
				System.out.println("Correct");
				++grade;
				++TotalScore; 
			}
				if (guess != Awnser) {
				System.out.println("Wrong");
			}
		}
	}
		System.out.println("Grade: " + grade);
		System.out.println("Total score: " + TotalScore + " Out of 5");
		
	}
	
	public static void Jokes() {										////////// Jokes Method /////////////
		int Counter;
		Counter = RnG.nextInt(6);
		
		switch (Counter) {
		case 0:
			System.out.println("Why don't scientists trust atoms?");
			System.out.println("Because they make up everything.");
			break;
		case 1:
			System.out.println("Did you hear about the claustrophobic astronaut?");
			System.out.println("He just needed a little space.");
			break;
		case 2:
			System.out.println("What do you call a fake noodle?");
			System.out.println("An impasta!");
			break;
		case 3:
			System.out.println("What do you call a magic dog?");
			System.out.println("A labracadabrador.");
			break;
		case 4:
			System.out.println("Why did the frog take the bus to work today?");
			System.out.println("His car got toad away.");
			break;
		case 5:
			System.out.println("What is an astronaut's favorite part on a computer?");
			System.out.println("The space bar.");
			break;
		case 6:	
			System.out.println("Want to hear a construction joke?");
			System.out.println("Oh never mind, I'm still working on that one.");
			break;
		}
	}
	
	public static boolean Login() {										/////////////Login Method/////////////////
		int i;
		String Name;
		String Passwrd;
		boolean Pass = false;
		
			System.out.println("Please Login by entering your UserName: ");
		Name = scnr.next();
			System.out.println("Please enter Your Password");
		Passwrd = scnr.next();
		
		for (i = 0; i < numUsers; ++i) {
			if ((Name.equals(UserName[i])) && (Passwrd.equals(PassWord[i]))) {
				System.out.println("You have been logged in");
				Pass = true;
				CurUserID = i;
				}
			
		}
		return Pass;
}
	
	public static void createUser() {									//////////// Create User Method ////////////

		String input;  
		System.out.println("Insert the UserName");
		UserName[numUsers] = scnr.next();
		System.out.println("Insert Password");
		input = scnr.next();
		
		while (!isValid(input)) {
		System.out.println("Wrong password format: insert Password:  at least 8 characters, at least 1 lowercase and uppercase, and 1 secial symbol");	
		input = scnr.next();		
		}
		PassWord[numUsers] = input; 
		numUsers++;
		System.out.println("You must still Login");
	}
	
	public static void PostSearch() {									//////////// Post Search Method ////////////
	System.out.println("Insert the first word of any to post to search for it.");
	String input;
	int i;
	input = scnr.next();
	for (i = 0; i <= numPosts; ++i) {
		if (Posts[i].contains(input)) {
			System.out.println(Posts[i]);
			System.out.println(PostOwner[i]);
		}
	}
}
	
	public static void LikePosts() {									/////////// LikePosts Method  //////////////
		int i;
		String input;
		for (i = 0; i <= numPosts; ++i) {
			System.out.println(Posts[i]);
			System.out.println(PostOwner[i]);
			System.out.println("Press 1 to like post, 2 to dislike");
			input = scnr.next();
			if (input.equals("1")) {
				numLikes[i] = numlikes++;
			}
			else if (input.equals("2")) {
				numDislikes[i] = numDislikes[i++];
			}
		}
	}
	
	public static void TopPost() {										/////////////// TopPost Method ////////////////
		int i;
		for (i = 0; i <= numPosts; i++) {
 			System.out.println(numLikes[i] + " Num of likes for post" + i);
 			System.out.println(Posts[i] + " Post: " + i);
 			System.out.println(PostOwner[i] + " PostOwner: " + i);
		}
	}
	
	public static void main(String[] args) {							////////////// Main Method //////////////////////
	boolean Quit = false;
	String input = " ";
	int i;

	printASCII();
																	// the program starts by creating the first user 	
	System.out.println("let's start by creating a user");
	
	createUser();
	
	while (Quit == false) {                                          //////////////// App Starts here with a selection of an activity //////////////		
	System.out.println("Welcome to the Social Media App");
	printASCII();
	System.out.println("Choose from the following to do");
	System.out.println("Pess 0 to hear a joke");
	System.out.println("Press 1 to add a new Post.");
	System.out.println("Press 2 to read previous posts.");
	System.out.println("Press 3 to search for posts");
	System.out.println("Press 4 to view all posts and like or not like them.");
	System.out.println("Press 5 to quit");
	System.out.println("Press 6 to go home");
	System.out.println("Press 7 to login");
	System.out.println("Press 8 to create a user");
	System.out.println("Press 9 to take a Math Quiz");
	System.out.println("Press t to view the Top Posts");
	
	input = scnr.next();

	
	switch (input) {																//////////// Picks a activity /////////////
	case "0":
		Jokes();
		break;
	case "1":
		System.out.println("insert your post");										//////////Ask for help on the scanner only picking a string not the entire line, and how line messes it up.//////////////////////////
		input = scnr.next();
		Posts[numPosts] = input;
		PostOwner[numPosts] = UserName[CurUserID];
		numPosts++;		
		break;
	case "2":
		for (i = 0; i < numPosts; ++i) {
			System.out.println(Posts[i]);
			System.out.println(PostOwner[i]);	}		
		break;
	case "3":
		PostSearch();
		break;
	case "4":
		LikePosts();
		break;
	case "5":
		Quit = true;
		break;
	case "6":
		Quit = true; 
		break;
	case "7":
		if (Login()) { 
			System.out.println("log in successful"); }
			//CurUserID++; }
			else {
				System.out.println("log in failed - you can still do some browsing"); }
		break;
	case "8": createUser();
		break;
	case "9":
		Math_Quiz();
		break;
	case "t":
		TopPost();
		break;
	default:
		System.out.println("invalid response try again.");
		break;	}
		}						
	}
}
