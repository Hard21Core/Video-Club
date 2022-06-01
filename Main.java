package storage;

import java.util.Scanner;

public class Storage
{
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		// create a new member and a new DVD from storage
		Members nbMember = new Members();
		Storage DVD = new Storage();
		
		int menuItem;
		boolean quit = false;
		
		do
		{
			System.out.println("--------------------------------------------");
		    System.out.println("|         Welcome to our Video-Club!          |");
		    System.out.println("|------------------------------------------|");
		    System.out.println("|   Please Select From The Menu Options:   |");
		    System.out.println("|------------------------------------------|");
		
		
			System.out.println("Choose a menu item ");
			menuItem = in.nextInt();


			 switch (menuItem) 
			 {
				
               case 1:

					nbMember.checkMemberData();					

                     break;

               case 2:

                     DVD.check_storage();

                     break;

               case 3:

                     DVD.check_selling();
                    
                     break;

               case 4:

                    Notification not = new Notification();
					
					searchnot = input.nextInt();

						switch(searchnot)
						{

							case 1:
								not.checkNewEditions();
							break;
                    
							case 2:
								not.checkBorrowedDVDs();
							break;
						}	
					
					break;					

               case 5:

                     Orders order = new Orders();
					 order.checkDVDList();

                     break;
					 
               case 6:

						Events event = new Events();
						event.searchEvents();
                  
					break;
				   
               case 7:

						Epistrofes epDVD = new Epistrofes();
						epDVD.check_aitia();

                   break;

               case 0:

                     quit = true;

                     break;

               default:

                     System.out.println("Invalid choice. Choose an integer between 0 and 7");

            }
	
		}
		while (!quit);
	
	}
	
}