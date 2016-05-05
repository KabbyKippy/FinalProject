
public class Customer {
	LaundryOrder order;
	double wallet;
	String name;
	
	Customer(String name)
	{
		this.name = name;
	}
	
	public LaundryOrder createOrder(int numOfShirts, int numOfPants, int numOfSocks, boolean colors, String name)
	{
		order = new LaundryOrder(numOfShirts, numOfPants, numOfSocks, colors, name);
		return order;
	}
	
	
}
