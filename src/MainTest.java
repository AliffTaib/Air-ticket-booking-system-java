import java.io.*;

import java.util.*;

public class MainTest {
	
	
	
	
	


	public static void main(String[] args) throws Exception {
		
		int choice = -1;
		Scanner s = new Scanner(System.in);
		int choice2,choice3=-1,choice4=-1,out=-1;
		
		
		
		
		do {
			//==START HERE==//
			
			choice2=mainMenu(choice);
			switch(choice2) {
			
			case 1://USER ACCESS
				while(choice3!=0){
//===================================================================================USER ACCESS==================
					choice3=userAccess(choice2);
				}
//===================================================================================USER ACCESS==================
			break;//USER ACCESS
			
			case 2://ADMIN ACCESS
				while(choice3!=0){
//==================================================================================ADMIN ACCESS==================
					choice3=adminAccess(choice2);
					switch(choice3) {
					case 1://==============================MANAGE FLIGHT====
						while(choice4!=0) {
							choice4=manageFlight(choice3);
							//CREATE FLIGHT
							//UPDATE FLIGHT
							//DELETE FLIGHT
						}
					break;
					case 2://================================MANAGE USER====
						while(choice4!=0) {
							choice4=manageUser(choice3);
							//CREATE USER
							//UPDATE USER
							//DELETE USER
						}
					break;
					case 3://================================MANAGE BOOKINGS====
						while(choice4!=0) {
							choice4=manageBooking(choice3);
							//CREATE BOOKING
							//UPDATE BOOKING
							//DELETE BOOKING
						}
					break;
					case 4://================================MANAGE ADMIN====
						while(choice4!=0) {
							choice4=manageAdmin(choice3);
							//CREATE ADMIN
							//UPDATE ADMIN
							//DELETE ADMIN
						}
					break;
					case 0://================================MANAGE ADMIN====
						choice4=0;
						System.exit(0);
					break;
					}
				}
//==================================================================================ADMIN ACCESS==================
			break;//ADMIN ACCESS
			case 0://================================MANAGE ADMIN===================================================
				choice3=0;
				System.exit(0);
			break;
			}
			
		}
		while(choice!=0);
	}

/*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
   AUTHENTICATION LOGIN
//============================================================================================================================================*/	
public static boolean Authentication(boolean auth) throws FileNotFoundException, IOException, ClassNotFoundException {
	
	Scanner s = new Scanner(System.in);
	File userFile = new File("User.txt");
	File userFileWp = new File("UserWp.txt");
	ArrayList<User> us = new ArrayList<User>();
	ArrayList<User> usp = new ArrayList<User>();
	
	
	ObjectOutputStream uoos = null;
	ObjectInputStream uois = null;
	ListIterator li = null; //print as list orderly.
	
	
	String userId="",name, email;
	int password;
	
	if(userFileWp.isFile()) {
		uois = new ObjectInputStream(new FileInputStream(userFileWp));       //read into the file & load it into our collection 
		usp = (ArrayList<User>)uois.readObject();
		uois.close();
		int password1 =-1;	
		boolean found = false;
		auth = false;
		int p1=0;
		String n1="";
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("Enter Membership Number: ");
		int membershipNumber = s.nextInt();
		System.out.println("Enter login password: ");
		password1 = s.nextInt();
		System.out.println("----------------------------------------------------------------------------------");
		li = usp.listIterator();
		while(auth != true) {
			while(li.hasNext()) {
				User e = (User) li.next();
				if(e.getUserId() == userId) {
					p1 = e.getPassword();
					n1 = e.getName();
				}
			}//while hasNext
				if(p1!= password1) {
				System.out.println("Invalid password, please re-enter password");
				password1 = s.nextInt();
				}else if(password1 == 0){
					System.out.println("Program terminated");
					System.exit(0);
				}else {
					System.out.println("Login Successful.");
					auth = true;
				}
		}//while unless password is right then can go out  
		System.out.println(auth);
	}
	return auth;
}
	
	
/*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
                                                                                                                        MANAGERS 
//============================================================================================================================================*/	
	public static int manageBooking(int choice) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("     MANAGE BOOKING ");
		System.out.println("========================================");
		
		System.out.println("1. Create Booking ");
		System.out.println("2. Display Booking ");
		System.out.println("3. Update Booking");
		System.out.println("4. Delete Booking");
		
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			createTicket();
		break;
		case 2:
			displayTicket();
		break;
		case 3:
			updateTicket();
		break;
		case 4:
			//deleteTicket();
		break;
		
		
		}
		
		return choice;
		
	}
//=============================================================================================================================================	
	public static int manageAdmin(int choice) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("     MANAGE ADMIN ");
		System.out.println("========================================");
		
		System.out.println("1. Create Admin ");
		System.out.println("2. Update Admin ");
		System.out.println("3. Delete Admin ");
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			createAdmin();
		break;
		case 2:
			updateAdmin();
		break;
		case 3:
			System.out.println("Not Available");
		break;
		
		
		}
		
		return choice;
	}
//=============================================================================================================================================	
	public static int manageFlight(int choice) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("     MANAGE FLIGHT ");
		System.out.println("========================================");
		
		System.out.println("1. Create Flight ");
		System.out.println("2. Display Flight");
		System.out.println("3. Update Flight ");
		System.out.println("4. Delete Flight");
		
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			createFlight();
		break;
		case 2:
			displayFlight();
		break;
		case 3:
			updateFlight();
		break;
		case 4:
			deleteFlight();
		break;
		
		}
		
		return choice;
	}
//=============================================================================================================================================	
	public static int manageUser(int choice) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("     MANAGE USER ");
		System.out.println("========================================");
		
		System.out.println("1. Create User");
		System.out.println("2. Display User");
		System.out.println("3. Update User");
		System.out.println("4. Delete User");
		System.out.println("4. Search User");
		
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		
		switch(choice) {
		case 1:
			createUser();
		break;
		case 2:
			displayUser();
		break;
		case 3:
			updateUser();
		break;
		case 4:
			deleteUser();
		break;
		case 5:
			searchUser();
		break;
		
		
		}
		
		return choice;
	}
//=============================================================================================================================================	
	
	

/*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
                                                                                                                      MENU PROMPTS
//USER MENU=================================================================================================================================*/                                                                                                                      
	public static int userLogin(int choice) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("        Welcome to AA.com                     ");
		System.out.println("============================================");
		
		
		System.out.println("1.Display flight ");
		System.out.println("2.Manage Booking ");
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();

		
		return choice;
	}                                                                                                                     
                                                                                                                      
//CREATE USER=================================================================================================================================*/
	public static int userAccess(int choice) throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner s = new Scanner(System.in);
		boolean auth=false;
		int choiceLogin=0;
		
		System.out.println("\n\n========================================");
		System.out.println("      USER ACCESS ");
		System.out.println("========================================");
		
		System.out.println("1. Create User ");
		System.out.println("2. User login ");
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		
		switch(choice) {
		
			case 1:
				System.out.println("1. Create User ");
				createUser();
			break;
			case 2:
				System.out.println("2. User login ");
				Authentication(auth);
				if(auth==true) {
					choiceLogin=userLogin(choice);
					switch(choiceLogin){
					case 1:
						displayFlight();
						int bookChoice=flightPrompt(choice);
						
						
					break;
					case 2:
						//manageBooking();
					break;
					}
				}
				
			break;
			
			case 0:
				choice=0;
			break;
		}
		return choice;
	}
//=============================================================================================================================================	
	public static int adminAccess(int choice) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("     ADMIN ACCESS ");
		System.out.println("========================================");
		
		
		System.out.println("1.Manage Flight ");
		System.out.println("2.Manage User ");
		System.out.println("3.Manage Booking ");
		System.out.println("4.Manage Admin ");
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();

		
		return choice;
	}
//=============================================================================================================================================	
	public static int mainMenu(int choice) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("\n\n========================================");
		System.out.println("      AIRLINE TICKET BOOKING SYSTEM ");
		System.out.println("========================================");
		
		System.out.println("1.User Access ");
		System.out.println("2.Admin Access ");
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		

		return choice;			
	}
//=============================================================================================================================================	
	
	
	
	
/*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	                                                                                                                  MANAGE USER
//CREATE USER=================================================================================================================================*/	
	public static void createUser() throws FileNotFoundException, IOException {
		Scanner s = new Scanner(System.in);
		File userFile = new File("User.txt");
		File userFileWp = new File("UserWp.txt");
		ArrayList<User> us = new ArrayList<User>();
		ArrayList<User> usp = new ArrayList<User>();
		
		
		ObjectOutputStream uoos = null;
		ObjectInputStream uois = null;
		ListIterator li = null; //print as list orderly.
		
		
		String userId,name, email;
		int password;
		
		System.out.println("Enter how many user you wish to add: ");
		int m = s.nextInt();
		for(int i=0;i<m;i++) {
		
			System.out.print("\n\nEnter UserID No: ");
			userId = s.next();
			
			System.out.print("Enter Name: ");
			name = s.next();
			
			System.out.print("Enter Email: ");
			email = s.next();
			
			System.out.print("Enter password: ");
			password = s.nextInt();
			
			us.add(new User(userId,name,email)); //without password
			usp.add(new User(userId,name,email,password));
		}
		
		uoos = new ObjectOutputStream(new FileOutputStream(userFile)); //then only will write collection into file
		uoos.writeObject(us);
		uoos.close(); //put object into arraylist then persist it in a txt file
		
		uoos = new ObjectOutputStream(new FileOutputStream(userFileWp));
		uoos.writeObject(usp);
		uoos.close(); 
		
	}
//=============================================================================================================================================	

//DISPLAY USER=================================================================================================================================
	public static void displayUser() throws FileNotFoundException, IOException, ClassNotFoundException {
			
			String userId="",name, email;
			int password;
			
			Scanner s = new Scanner(System.in);
			File userFile = new File("User.txt");
			ArrayList<User> us = new ArrayList<User>();
			
			
			ObjectOutputStream uoos = null;
			ObjectInputStream uois = null;
			ListIterator li = null; //print as list orderly.
			
			if(userFile.isFile()) {
				uois = new ObjectInputStream(new FileInputStream(userFile));       
				us = (ArrayList<User>)uois.readObject();
				uois.close();
				
																													
				
			System.out.println("====================================================");
			System.out.println(" UserID          Name          Email     "                  );
			System.out.println("----------------------------------------------------");
			li = us.listIterator();
			while(li.hasNext())
					System.out.println(li.next());
			
			System.out.println("----------------------------------------------------");
			}else {
				System.out.println("File does not exist...!");
			}
			
			
			
		}
//============================================================================================================================================
	
//UPDATE USER=================================================================================================================================		
	public static void updateUser() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String userId,name, email;
		int password;
		
		Scanner s = new Scanner(System.in);
		File userFile = new File("User.txt");
		ArrayList<User> us = new ArrayList<User>();
		
		
		ObjectOutputStream uoos = null;
		ObjectInputStream uois = null;
		ListIterator li = null; //print as list orderly.
		
		if(userFile.isFile()) { //if userFile exist? then... run the input stream
			
			uois = new ObjectInputStream(new FileInputStream(userFile));
			us = (ArrayList<User>)uois.readObject();
			uois.close();
			
			System.out.println("-------------------------------------------------------");
			li = us.listIterator();
			while(li.hasNext())
				System.out.println(li.next());
			System.out.println("-------------------------------------------------------");
		}else {
			System.out.println("File do not exist..!");
		}
		
		///////
		if(userFile.isFile()) {
			uois = new ObjectInputStream(new FileInputStream(userFile));       //read into the file & load it into our collection 
			us = (ArrayList<User>)uois.readObject();
			uois.close();
				
			boolean found = false;
			
			///SEARCH WHICH USER ID TO UPDATE
			System.out.print("\nEnter userID to update: ");
			userId = s.next();
			System.out.println("---------------------------------------------------------");
			li = us.listIterator();
			while(li.hasNext()) {
					User e = (User) li.next();
					// string3.equals(string4)
					if(e.getUserId().equals(userId)) {
						//IF USERID that User key in match one of the userid in the list.. it will prompt to update that userid attributes
						
						System.out.print("Enter UserID No: ");
						userId = s.next();
						
						System.out.print("Enter Name: ");
						name = s.next();
						
						System.out.print("Enter Email: ");
						email = s.next();
						
						System.out.print("Enter password: ");
						password = s.nextInt();
						
						li.set(new User(userId,name,email,password));

						found = true;
					}	
			}
			if(found) {
				uoos = new ObjectOutputStream(new FileOutputStream(userFile));
				uoos.writeObject(us);
				uoos.close();
				System.out.println("---------------------------------------------------------");
				System.out.println("Record Updated Successfully...!");
			}else {
				System.out.println("Record Not Found...!");
				}
			System.out.println("---------------------------------------------------------");
			}else {
				System.out.println("File does not exist...!");
			}
			
	}
//============================================================================================================================================
	
//SEARCH USER=================================================================================================================================
	public static void searchUser() throws FileNotFoundException, IOException, ClassNotFoundException{
		String userId="",name, email;
		int password;
		
		Scanner s = new Scanner(System.in);
		File userFile = new File("User.txt");
		ArrayList<User> us = new ArrayList<User>();
		
		
		ObjectOutputStream uoos = null;
		ObjectInputStream uois = null;
		ListIterator li = null; //print as list orderly.
		
		uois = new ObjectInputStream(new FileInputStream(userFile));       //read into the file & load it into our collection 
		us = (ArrayList<User>)uois.readObject();
		uois.close();
			
		boolean found = false;
		System.out.print("\nEnter userID to search: ");
		userId = s.next();
		System.out.println("---------------------------------------------------------");
		li = us.listIterator();
		while(li.hasNext()) {
				User e = (User) li.next();
				if(e.getUserId().equals(userId)) {
					System.out.println(e);
					System.out.println("---------------------------------------------------------");
					found = true;
				}	
		}
		
		
	}
//============================================================================================================================================
	
//DELETE USER=================================================================================================================================
	public static void deleteUser() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String userId="",name, email;
		int password;
		
		Scanner s = new Scanner(System.in);
		File userFile = new File("User.txt");
		ArrayList<User> us = new ArrayList<User>();
		
		
		ObjectOutputStream uoos = null;
		ObjectInputStream uois = null;
		ListIterator li = null; //print as list orderly.
		
		displayUser();
		
		
		if(userFile.isFile()) {
			uois = new ObjectInputStream(new FileInputStream(userFile));       //read into the file & load it into our collection 
			us = (ArrayList<User>)uois.readObject();
			uois.close();
				
			boolean found = false;
			System.out.print("\nEnter userID to delete: ");
			userId = s.next();
			System.out.println("---------------------------------------------------------");
			li = us.listIterator();
			while(li.hasNext()) {
					User e = (User) li.next();
					if(e.getUserId().equals(userId)) {
						li.remove();
						found = true;
					}	
			}
			if(found) {
				uoos = new ObjectOutputStream(new FileOutputStream(userFile));
				uoos.writeObject(us);
				uoos.close();
				System.out.println("Record Deleted Successfully...!");
			}else {
				System.out.println("Record Not Found...!");
				}
			System.out.println("---------------------------------------------------------");
			}else {
				System.out.println("File does not exist...!");
			}
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

//Flight Prompt=================================================================================================================================
	public static int flightPrompt(int choice) {
		//bookflight
		//updateflight
		//createticket
		//displayticket
		
		Scanner s = new Scanner(System.in);
		int choiceLogin=0;
		
		System.out.println("\n\n====================================");
		System.out.println("      BOOK / UPDATE FLIGHT ");
		System.out.println("========================================");
		
		System.out.println("1. Book New Flight ");
		System.out.println("2. Update Flight ");
		
		
		
		System.out.println("0.EXIT");
		System.out.println("\nEnter your choice: ");
		choice = s.nextInt();
		
		
		
		
		return choice;
	}
//Book Flight=================================================================================================================================
	public static void bookFlight() throws FileNotFoundException, IOException, ClassNotFoundException {
		/* private String flightNumber;
		    private String airline;
		    private String source;
		    private String destination;
		    private int departureTime;
		    private int arrivalTime;
		    private double price;
		    private int availableSeats;*/
		
		String flightNum,airline,source,destination;
		int departureTime,arrivalTime,availableSeats;
		double price;
		
		
		File flightFile = new File("flight.txt");
		ArrayList<Flight> fl = new ArrayList<Flight>();
		
		//OOS/OIS/List Iterator
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		Scanner L = new Scanner(System.in);
		
		ois = new ObjectInputStream(new FileInputStream(flightFile));       //read into the file & load it into our collection 
		fl = (ArrayList<Flight>)ois.readObject();
		ois.close();
			
		boolean found = false;
		System.out.print("\nEnter Flight Number to book flight: ");
		flightNum = L.next();
		System.out.print("\nHow many passenger? ");
		int seat=L.nextInt();
		System.out.println("---------------------------------------------------------");
		li = fl.listIterator();
		while(li.hasNext()) {
				Flight e = (Flight) li.next();
				if(e.getFlightNumber().equals(flightNum)) {
					System.out.println(e.getAvailableSeats());
					int seatsLeft=e.getAvailableSeats()-seat;
					e.setAvailableSeats(seatsLeft);  //update seatsleft for particular flight
					
					
					
					
					found = true;
				}	
		}
		
		
	}
	
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
                                                                                                                MANAGE FLIGHT
//CREATE FLIGHT=================================================================================================================================*/
	public static void createFlight() throws FileNotFoundException, IOException {

	
		String flightNum,airline,source,destination;
		int departureTime,arrivalTime,availableSeats;
		double price;
		
		
		File flightFile = new File("flight.txt");
		ArrayList<Flight> fl = new ArrayList<Flight>();
		
		//OOS/OIS/List Iterator
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		Scanner L = new Scanner(System.in);
		Scanner i1 = new Scanner(System.in);
		Scanner ii = new Scanner(System.in);
	
		System.out.println("Enter how many flight you wish to add: ");
		int m = i1.nextInt();
		for(int i=0;i<m;i++) {
			
		
		System.out.print("Enter Flightnum No: ");
		flightNum = i1.next();
		
		System.out.print("Enter Airlines: ");
		airline = L.nextLine();
		
		System.out.print("Enter source: ");
		source = ii.next();
		
		System.out.print("Enter destination: ");
		destination = i1.next();
		
		System.out.print("Enter departureTime: ");
		departureTime = i1.nextInt();
		
		System.out.print("Enter arrivaltime: ");
		arrivalTime = ii.nextInt();
		
		System.out.print("Enter price: ");
		price = i1.nextDouble();
		
		System.out.print("Enter availableSeats: ");
		availableSeats = i1.nextInt();
		
	
		fl.add(new Flight(flightNum,airline,source,destination,departureTime,arrivalTime,price,availableSeats));
		
		}
		oos = new ObjectOutputStream(new FileOutputStream(flightFile)); //then only will write collection into file
		oos.writeObject(fl);
		oos.close(); //put object into arraylist then persist it in a txt file
	}
//============================================================================================================================================
	public static void displayFlight() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String flightNum,airline,source,destination;
		int departureTime,arrivalTime,availableSeats;
		double price;
		
		Scanner s = new Scanner(System.in);
		File flightFile = new File("flight.txt");
		ArrayList<Flight> fl = new ArrayList<Flight>();
		
		//OOS/OIS/List Iterator
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		if(flightFile.isFile()) {
			ois = new ObjectInputStream(new FileInputStream(flightFile));       
			fl = (ArrayList<Flight>)ois.readObject();
			ois.close();
			
																												
		//    	return "  " + flightNumber  + "     " +airline +"     "+ source +"     "+destination +"     "+departureTime+"     "+ arrivalTime +"     "+price+"     "+ availableSeats;
		System.out.println("============================================================================================================================================================");
		System.out.println(" flightNumber            airline            source         destination         departureTime         arrivalTime         price         availableSeats");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
		li = fl.listIterator();
		while(li.hasNext())
				System.out.println(li.next());
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}else {
			System.out.println("File does not exist...!");
		}
		
		
		
	}
//=============================================================================================================================================
	public static void updateFlight() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		String flightNum,airline,source,destination;
		int departureTime,arrivalTime,availableSeats;
		double price;
		
		Scanner s = new Scanner(System.in);
		File flightFile = new File("flight.txt");
		ArrayList<Flight> fl = new ArrayList<Flight>();
		
		//OOS/OIS/List Iterator
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		
		
		if(flightFile.isFile()) { //if userFile exist? then... run the input stream
			
			ois = new ObjectInputStream(new FileInputStream(flightFile));
			fl = (ArrayList<Flight>)ois.readObject();
			ois.close();
			
			System.out.println("-------------------------------------------------------");
			li = fl.listIterator();
			while(li.hasNext())
				System.out.println(li.next());
			System.out.println("-------------------------------------------------------");
		}else {
			System.out.println("File do not exist..!");
		}
		
	}
//============================================================================================================================================	
	public static void deleteFlight() throws FileNotFoundException, IOException, ClassNotFoundException {
		
	/*	String flightNum,airline,source,destination;
		int departureTime,arrivalTime,availableSeats;
		double price;
		
		Scanner s = new Scanner(System.in);
		File flightFile = new File("flight.txt");
		ArrayList<Flight> fl = new ArrayList<Flight>();
		
		//OOS/OIS/List Iterator
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		displayFlight();
		
		
		if(userFile.isFile()) {
			uois = new ObjectInputStream(new FileInputStream(userFile));       //read into the file & load it into our collection 
			us = (ArrayList<User>)uois.readObject();
			uois.close();
				
			boolean found = false;
			System.out.print("\nEnter userID to delete: ");
			userId = s.next();
			System.out.println("---------------------------------------------------------");
			li = us.listIterator();
			while(li.hasNext()) {
					User e = (User) li.next();
					if(e.getUserId().equals(userId)) {
						li.remove();
						found = true;
					}	
			}
			if(found) {
				uoos = new ObjectOutputStream(new FileOutputStream(userFile));
				uoos.writeObject(us);
				uoos.close();
				System.out.println("Record Deleted Successfully...!");
			}else {
				System.out.println("Record Not Found...!");
				}
			System.out.println("---------------------------------------------------------");
			}else {
				System.out.println("File does not exist...!");
			}	*/
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	
/*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
                                                                                                                MANAGE BOOKINGS
//AUTO TICKET FOR USER=================================================================================================================================*/
	public static void dynamicTicket(String passenger,flight) throws FileNotFoundException, IOException { 
		
		Scanner s = new Scanner(System.in);
		File ticketFile = new File("ticket.txt");
		ArrayList<Ticket> tix = new ArrayList<Ticket>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		
		int ticketNumber;
	 	String passenger1;
	 	String flight;
	 	String seatNumber;
		String status;
		
		
		
		ticketNumber = 0;
		
		passenger1 = passenger;
		

		flight = 
		
		seatNumber = "F29";
		
		status = "Booked";
		
		tix.add(new Ticket(ticketNumber,passenger,flight,seatNumber,status));
		}
		oos = new ObjectOutputStream(new FileOutputStream(ticketFile)); //then only will write collection into file
		oos.writeObject(tix);
		oos.close(); //put object into arraylist then persist it in a txt file
	
		
	}                                                                                                                
                                                                                                                
                                                                                                                
                                                                                                                
//CREATE TICKET =================================================================================================================================*/
	public static void createTicket() throws FileNotFoundException, IOException {
		
		Scanner s = new Scanner(System.in);
		File ticketFile = new File("ticket.txt");
		ArrayList<Ticket> tix = new ArrayList<Ticket>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		
		int ticketNumber;
	 	String passenger;
	 	String flight;
	 	String seatNumber;
		String status;
		
		System.out.println("Enter how many user you wish to add: ");
		int m = s.nextInt();
		for(int i=0;i<m;i++) {
	
	
		System.out.print("Enter Ticket Number: ");
		ticketNumber = s.nextInt();
		
		System.out.print("Enter Passenger: ");
		passenger = s.next();
		
		System.out.print("Enter Flight: ");
		flight = s.next();
		
		System.out.print("Enter Seat Number: ");
		seatNumber = s.next();
		
		System.out.print("Enter Status: ");
		status = s.next();
		
		tix.add(new Ticket(ticketNumber,passenger,flight,seatNumber,status));
		}
		oos = new ObjectOutputStream(new FileOutputStream(ticketFile)); //then only will write collection into file
		oos.writeObject(tix);
		oos.close(); //put object into arraylist then persist it in a txt file
		
	}
	//DISPLAY TICKET =================================================================================================================================*/
	public static void displayTicket() throws FileNotFoundException, IOException, ClassNotFoundException {
			
		Scanner s = new Scanner(System.in);
		File ticketFile = new File("ticket.txt");
		ArrayList<Ticket> tix = new ArrayList<Ticket>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		
		int ticketNumber;
	 	String passenger;
	 	String flight;
	 	String seatNumber;
		String status;
	
			
			if(ticketFile.isFile()) {
				ois = new ObjectInputStream(new FileInputStream(ticketFile));       
				tix = (ArrayList<Ticket>)ois.readObject();
				ois.close();
				
																													
			//    	return "  " + ticketNumber  + "     " +passenger +"     "+ flight +"     "+seatNumber +"     "+status+" 
			System.out.println("============================================================================================================================================================");
			System.out.println(" ticketNumber            passenger            flight         seatNumber         status         ");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
			li = tix.listIterator();
			while(li.hasNext())
					System.out.println(li.next());
			
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}else {
				System.out.println("File does not exist...!");
			}
			
			
			
		}
//UPDATE TICKET===============================================================================================================================
	public static void updateTicket() throws FileNotFoundException, IOException, ClassNotFoundException {

		
		Scanner s = new Scanner(System.in);
		File ticketFile = new File("ticket.txt");
		ArrayList<Ticket> tix = new ArrayList<Ticket>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		
		int ticketNumber;
	 	String passenger;
	 	String flight;
	 	String seatNumber;
		String status;
	
		
		
		if(ticketFile.isFile()) { //if userFile exist? then... run the input stream
			
			ois = new ObjectInputStream(new FileInputStream(ticketFile));
			tix = (ArrayList<Ticket>)ois.readObject();
			ois.close();
			
			System.out.println("-------------------------------------------------------");
			li = tix.listIterator();
			while(li.hasNext())
				System.out.println(li.next());
			System.out.println("-------------------------------------------------------");
		}else {
			System.out.println("File do not exist..!");
		}
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	

	
	
	
	
	
/*/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////.	
                                                                                                                MANAGE ADMIN
//CREATE ADMIN=================================================================================================================================*/
	public static void createAdmin() throws FileNotFoundException, IOException {
		
		Scanner s = new Scanner(System.in);
		File adminFile = new File("admin.txt");
		ArrayList<Admin> ad = new ArrayList<Admin>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderly.
		
		
		String username;
		int password1,adminID;
		
			System.out.print("Enter adminID No: ");
			adminID = s.nextInt();
			
			System.out.print("Enter userame: ");
			username = s.next();
			
			System.out.print("Enter password: ");
			password1 = s.nextInt();
			
			ad.add(new Admin(adminID,username,password1));
			
			oos = new ObjectOutputStream(new FileOutputStream(adminFile)); //then only will write collection into file
			oos.writeObject(ad);
			oos.close(); //put object into arraylist then persist it in a txt file
	}
//============================================================================================================================================
	public static void updateAdmin() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Scanner s = new Scanner(System.in);
		File adminFile = new File("admin.txt");
		ArrayList<Admin> ad = new ArrayList<Admin>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		ListIterator li = null; //print as list orderl
		
		if(adminFile.isFile()) { //if userFile exist? then... run the input stream
			
			ois = new ObjectInputStream(new FileInputStream(adminFile));
			ad = (ArrayList<Admin>)ois.readObject();
			ois.close();
			
			System.out.println("-------------------------------------------------------");
			li = ad.listIterator();
			while(li.hasNext())
				System.out.println(li.next());
			System.out.println("-------------------------------------------------------");
		}else {
			System.out.println("File do not exist..!");
		}
	}
//============================================================================================================================================

}

	


