import java.io.*;

import java.util.*;

public class MainTest {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int choice = -1;
		String userId,name, email;
		int password;
		
		//TXT FILES. 
				File userFile = new File("User.txt");
				File flightFile = new File("flight.txt");
				File adminFile = new File("admin.txt");
				File ticketFile = new File("ticket.txt");
				
				//SCANNERS
				Scanner s = new Scanner(System.in);
				Scanner s1 = new Scanner(System.in);
				Scanner t = new Scanner(System.in);
				
				
				//COLLECTIONS
				ArrayList<User> us = new ArrayList<User>();
				ArrayList<Flight> fl = new ArrayList<Flight>();
				ArrayList<Admin> ad = new ArrayList<Admin>();
				ArrayList<Ticket> tix = new ArrayList<Ticket>();
				
				//OOS/OIS/List Iterator
				ObjectOutputStream oos = null;
				ObjectInputStream ois = null;
				ListIterator li = null; //print as list orderly.
				
				
				
				do {
					/*System.out.println("\n1.SIGN UP ACCOUNT"); //user
					System.out.println("2.ADD FLIGHT");  //admin
					System.out.println("3.DISPLAY FLIGHT"); //user
					*/
					
					//MAIN MENU
					System.out.println("\n\n========================================");
					System.out.println("      AIRLINE TICKET BOOKING SYSTEM ");
					System.out.println("========================================");
					
					System.out.println("1.User Access ");
					System.out.println("2.Admin Access ");
					
					
					
					System.out.println("0.EXIT");
					System.out.println("\nEnter your choice: ");
					choice = s.nextInt();
					
					switch(choice) {					
						
//CASE 1 OF MAIN MENU 
					    case 1:  //SUBMENU - USER ACCESS
					    	System.out.println("\n\n========================================");
							System.out.println("      USER ACCESS ");
							System.out.println("========================================");
							
							System.out.println("1. Create User ");
							System.out.println("2. User login ");
							
							
							
							System.out.println("0.EXIT");
							System.out.println("\nEnter your choice: ");
							choice = s.nextInt();
							
							switch(choice) {			
							case 1: //SUB - SUBMENU - MAIN MENU/USER ACCESS/CREATE USER
								
									System.out.print("Enter UserID No: ");
									userId = s1.next();
									
									System.out.print("Enter Name: ");
									name = s1.next();
									
									System.out.print("Enter Email: ");
									email = s1.next();
									
									System.out.print("Enter password: ");
									password = s.nextInt();
									
									us.add(new User(userId,name,email,password));
									
									oos = new ObjectOutputStream(new FileOutputStream(userFile)); //then only will write collection into file
									oos.writeObject(us);
									oos.close(); //put object into arraylist then persist it in a txt file
								
							break;
							case 2:  //SUB - SUBMENU - MAIN MENU/USER ACCESS/USER LOGIN
								System.out.println("User login lets go!");
								System.out.println("NOT AVAILABLE YET");
								
							break;
							
							}
					   /* 	
						
							*/
						break;
//CASE 2 OF MAIN MENU 		
					    case 2: //SUBMENU - ADMIN ACCESS
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
							
							switch(choice) {
		//ADMIN ACCESS - CASE 1 MANAGE FLIGHT					
								case 1: //SUB - SUBMENU - MAIN MENU/ADMIN ACCESS/MANAGE FLIGHT
									System.out.println("Manage Flight");
									
									System.out.println("\n\n========================================");
									System.out.println("     MANAGE FLIGHT ");
									System.out.println("========================================");
									
									System.out.println("1. Create Flight ");
									System.out.println("2. Update Flight ");
									System.out.println("3. Delete Flight");
									
									
									
									
									System.out.println("0.EXIT");
									System.out.println("\nEnter your choice: ");
									choice = s.nextInt();
									
									switch(choice) {
									case 1:
										System.out.println("Create Flight");
										
										String flightNum,airline,source,destination;
										int departureTime,arrivalTime,availableSeats;
										double price;
						
										
										System.out.print("Enter Flightnum No: ");
										flightNum = s1.next();
										
										System.out.print("Enter Airlines: ");
										airline = s1.next();
										
										System.out.print("Enter source: ");
										source = s1.next();
										
										System.out.print("Enter destination: ");
										destination = s1.next();
										
										System.out.print("Enter departureTime: ");
										departureTime = s.nextInt();
										
										System.out.print("Enter arrivaltime: ");
										arrivalTime = s.nextInt();
										
										System.out.print("Enter price: ");
										price = s.nextDouble();
										
										System.out.print("Enter availableSeats: ");
										availableSeats = s.nextInt();
										

										
										fl.add(new Flight(flightNum,airline,source,destination,departureTime,arrivalTime,price,availableSeats));
										
										oos = new ObjectOutputStream(new FileOutputStream(flightFile)); //then only will write collection into file
										oos.writeObject(fl);
										oos.close(); //put object into arraylist then persist it in a txt file
										
									break;
									
									case 2:
										System.out.println("Update Flight");
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
										break; //==========================================================================
									
										case 3:
											System.out.println("Delete Flight");
										break;
									
									}
		//MANAGE FLIGHT BREAK
								break; 
								
								case 2: //SUB - SUBMENU - MAIN MENU/ADMIN ACCESS/MANANGE USER
									do {
									
									System.out.println("\n\n========================================");
									System.out.println("     MANAGE USER ");
									System.out.println("========================================");
									
									System.out.println("1. Create User");
									System.out.println("2. Update User");
									System.out.println("3. Delete User");
									
									
									
									
									System.out.println("0.EXIT");
									System.out.println("\nEnter your choice: ");
									choice = s.nextInt();
									
									switch(choice) {
									case 1: //CREATE USER
										
										System.out.println("Enter how many user you wish to add: ");
										int m = s.nextInt();
										for(int i=0;i<m;i++) {
										
										System.out.print("Enter UserID No: ");
										userId = s1.next();
										
										System.out.print("Enter Name: ");
										name = s1.next();
										
										System.out.print("Enter Email: ");
										email = s1.next();
										
										System.out.print("Enter password: ");
										password = s.nextInt();
										
										us.add(new User(userId,name,email,password));
										}
										
										oos = new ObjectOutputStream(new FileOutputStream(userFile)); //then only will write collection into file
										oos.writeObject(us);
										oos.close(); //put object into arraylist then persist it in a txt file
									break; 
									case 2:  //UPDATE USER
										///////
											if(userFile.isFile()) { //if userFile exist? then... run the input stream
											
											ois = new ObjectInputStream(new FileInputStream(userFile));
											us = (ArrayList<User>)ois.readObject();
											ois.close();
											
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
											ois = new ObjectInputStream(new FileInputStream(userFile));       //read into the file & load it into our collection 
											us = (ArrayList<User>)ois.readObject();
											ois.close();
												
											boolean found = false;
											
											///SEARCH WHICH USER ID TO UPDATE
											System.out.print("\nEnter userID to update: ");
											userId = s1.next();
											System.out.println("---------------------------------------------------------");
											li = us.listIterator();
											while(li.hasNext()) {
													User e = (User) li.next();
													// string3.equals(string4)
													if(e.getUserId().equals(userId)) {
														//IF USERID that User key in match one of the userid in the list.. it will prompt to update that userid attributes
														
														System.out.print("Enter UserID No: ");
														userId = s1.next();
														
														System.out.print("Enter Name: ");
														name = s1.next();
														
														System.out.print("Enter Email: ");
														email = s1.next();
														
														System.out.print("Enter password: ");
														password = s.nextInt();
														
														li.set(new User(userId,name,email,password));

														found = true;
													}	
											}
											if(found) {
												oos = new ObjectOutputStream(new FileOutputStream(userFile));
												oos.writeObject(us);
												oos.close();
												System.out.println("---------------------------------------------------------");
												System.out.println("Record Updated Successfully...!");
											}else {
												System.out.println("Record Not Found...!");
												}
											System.out.println("---------------------------------------------------------");
											}else {
												System.out.println("File does not exist...!");
											}
													
											break;
											case 3: //DELETE USER 
											break; 
											}
									}while(choice!=0);
									
									
									
								break;
								case 3: //SUB - SUBMENU - MAIN MENU/ADMIN ACCESS/MANAGE BOOKING
									System.out.println("\n\n========================================");
									System.out.println("     MANAGE BOOKING ");
									System.out.println("========================================");
									
									System.out.println("1. Create Booking ");
									System.out.println("2. Update Booking ");
									System.out.println("3. Delete Booking");
									
									
									
									
									System.out.println("0.EXIT");
									System.out.println("\nEnter your choice: ");
									choice = s.nextInt();
									
									switch(choice) {
									case 1:
											int ticketNumber;
										 	String passenger;
										 	String flight;
										 	String seatNumber;
											String status;
										
										
											System.out.print("Enter ticketNumber: ");
											ticketNumber = s.nextInt();
											
											System.out.print("Enter Passenger: ");
											passenger = t.next();
											
											System.out.print("Enter flight: ");
											flight = t.next();
											
											System.out.print("Enter seatNumber: ");
											seatNumber = s1.next();
											
											System.out.print("Enter status: ");
											status = t.next();
											
											tix.add(new Ticket(ticketNumber,passenger,flight,seatNumber,status));
											
											oos = new ObjectOutputStream(new FileOutputStream(ticketFile)); //then only will write collection into file
											oos.writeObject(tix);
											oos.close(); //put object into arraylist then persist it in a txt file
										
									break;
									
									case 2:
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
										/*
										 * update program 	
										 */
											
											
									break;
									
									case 3:
									break;
									
									}
									
									
									
									
									
								break;
								
								case 4: //SUB - SUBMENU - MAIN MENU/ADMIN ACCESS/MANAGE ADMIN
									System.out.println("Manage ADMIN");
									
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
									
									case 1: //CREATE ADMIN
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
									break;
									
									case 2: //UPDATE ADMIN
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
										
										
									break;
									
									case 3: //DELETE ADMIN
									break;
									
									}
									
									
									
									
								break;
							}
					   
					    	
					    break; 
						
						//==============================================
						case 96:

						break;

						case 98:
							
						break; 
						
						//===============================================
					}
					
					
				}while(choice!=0);
				
				
			}



	}


