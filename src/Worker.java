
public class Worker {
	// Set constants for the cost of each article of clothing
	final double SHIRT_COST = 5.00;
	final double PANT_COST = 4.50;
	final double SOCK_COST = 1.25;
	final double COLOR_COST = 3.00;
	
	// Keep a laundryOrder object for each worker class
	LaundryOrder order;
	
	// Keep the cost and cashAmount given for when dealing with a customer
	double cost;
	double cashAmount;
	
	// Set the order given by a customer
	public void setOrder(LaundryOrder order)
	{		this.order = order;
		
	}
	// Take the order by dealing with the cash transaction 
	public void takeOrder(LaundryOrder order, double cashAmount){

		
		this.order = order;
		this.cashAmount = cashAmount;
	}
	// Calculate the cost depending on which type of clothes are being washed
	public double calculateCost(){
		if(order.isColor())
		{
			return order.getNumOfPants() * PANT_COST + 
					order.getNumOfShirts() * SHIRT_COST +
					order.getNumOfSocks() * SOCK_COST +
					COLOR_COST;
		}
		else
		{
			return order.getNumOfPants() * PANT_COST + 
					order.getNumOfShirts() * SHIRT_COST +
					order.getNumOfSocks() * SOCK_COST;
		}
		
	}

	public boolean getOrderStatus(){// will end the program if you are short so that you can remake order
		if(cashAmount - calculateCost() >= 0)
		{
			System.out.println("Your order has been accepted! your change is: $" + ( cashAmount - calculateCost())  );
			return true;
		}
		else
		{
			System.out.println("We cannot accept your order, you do not have enough funds you are short: $" +  (cashAmount - calculateCost()));
			return false;
		}
	}
}
