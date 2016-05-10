import java.util.Scanner;

import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args)
	{
		//set up the objects
		Worker work = new Worker();
		Scanner sc = new Scanner(System.in);
		Machine<LaundryOrder> wash = new Washer();
		Machine<LaundryOrder> dry = new Dryer();
		//end of object setup
		
		System.out.println("Hello what is your name? (if you came to the wrong store type 'exit' to leave)");
		while(sc.hasNext())
		{
				
			String name = sc.next();
			Customer p1 = new Customer(name);//(JOptionPane.showInputDialog("what is your name?"));
			if(name.equals("exit")){break;}
				
			
			System.out.println("type 1 for colored clothes type 0 for white clothing! (To end enter -1)");
			int color = sc.nextInt();
			if(color == -1){break;}
			//if(color != 1 && color !=0){System.out.println("Invalid value you entered " + color +" please try again");break;}
			
			if(color == 1){
				// Get amount of color shirts 
				System.out.println("How many colored shirts do you have today? (To end type '-1' at anytime)");
				int shirt = sc.nextInt();
				if(shirt == -1){break;}
				
				// Get amount of color pants
				System.out.println("How many colored pants do you have today? (To end type '-1' at anytime)");
				int pant = sc.nextInt();
				if(pant == -1){break;}
				
				// Get amount of color socks
				System.out.println("How many colored socks do you have today? (To end type '-1' at anytime)");
				int sock = sc.nextInt();
				if(sock == -1){break;}
				
				// With no clothes given, we cannot do business, exist the loop
				if(sock == 0 && pant == 0 && shirt == 0)
				{
					System.out.println("Have a good day, come back when you have dirty clothes, please!");
					break;
				}
				
				// Create, set, and calculate the cost of the order
				p1.createOrder(shirt, pant, sock, true, p1.name);
				work.setOrder(p1.Corder);
				//System.out.println(work.order.toString());
				System.out.println("The order amount is: " + work.calculateCost()+ "$");
				
				// Check if the person can pay for the order
				System.out.println("How much money do you have to pay? (To end type '-1' at anytime)");
				double cash = sc.nextDouble(); // holds the amount the customer has to pay
				if(cash == -1){break;}
				
				// The worker class takes the order now.
				work.takeOrder(p1.Corder, cash); // sets the order up with the amount of money the customer has to pay
				if(work.getOrderStatus())
					{
					
					wash.operate(work.order);
					
					dry.operate(work.order);
					
					work.order.Time();
					
					
					}
				else{System.exit(1);}
			}
			if(color == 0){
				// Take number of white shirts
				System.out.println("How many non-colored shirts do you have today? (To end type '-1' at anytime)");
				int shirt = sc.nextInt();
				if(shirt == -1){break;}
				
				// Take number of white pants
				System.out.println("How many non-colored pants do you have today? (To end type '-1' at anytime)");
				 int pant = sc.nextInt();
				 if(pant == -1){break;}
				 
				// Take number of white socks
				System.out.println("How many non-colored socks do you have today? (To end type '-1' at anytime)");
				int sock = sc.nextInt();
				if(sock == -1){break;}
				
				// If no articles of clothes are given, end the order
				if(sock == 0 && pant == 0 && shirt == 0)
				{
					System.out.println("Have a good day, come back when you have dirty clothes, please!");
					break;
				}
				
				// Create, set, and calculate the cost of the order
				p1.createOrder(shirt, pant, sock, false, p1.name);
				work.setOrder(p1.order);
				//System.out.println(work.order.toString());
				System.out.println("The order amount is: " + work.calculateCost()+ "$");
				
				// Check if they can pay for the order
				System.out.println("How much money do you have to pay? (To end type '-1)");
				double cash = sc.nextDouble(); // holds the amount the customer has to pay
				if(cash == -1){break;}
				
				// The worker class takes the order 
				work.takeOrder(p1.order, cash); // sets the order up with the amount of money the customer has to pay
				if(work.getOrderStatus())
				{	
					wash.operate(work.order);
					
					dry.operate(work.order);
					
					work.order.Time();		
				}
			
			}
			
		// Check if there's another order to be made, if not, end the loop
		System.out.println("Do you have another order of clothes to make? Y/N" );
		String end = sc.next();
		if(end == "n" || end == "N"){break;}
		}
		
		
		
	// Close the scanner	
	sc.close();
	}
}
