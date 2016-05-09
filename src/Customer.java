
public class Customer {
	LaundryOrder order; //white order
	LaundryOrder Corder; //colored order
	double wallet;
	String name;
	Customer()
	{
		wallet = 0;
		name = "none";
		
		
	}
	Customer(String name)
	{
		this.name = name;//the customer which will be making the orders name
	}
	
	public LaundryOrder createOrder(int numOfShirts, int numOfPants, int numOfSocks, boolean colors, String name)
	{
		if(colors)
		{
			Corder = new LaundryOrder(numOfShirts, numOfPants, numOfSocks, colors, name);// create the order with the customers information
			return Corder;
			
		}
		else{
		order = new LaundryOrder(numOfShirts, numOfPants, numOfSocks, colors, name);// create the order with the customers information
		return order;}
	}
	public void setWallet(double M)
	{
		wallet = M;//sets the amount of moneyu the customer has
		
	}
	
}
