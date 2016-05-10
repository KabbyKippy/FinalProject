
public class LaundryOrder extends Laundry{
	// Constructor for the LaundryOrder class
	public LaundryOrder(int numOfShirts, int numOfPants, int numOfSocks, boolean color, String CustomerName){
		this.numOfPants = numOfPants;
		this.numOfShirts = numOfShirts;
		this.numOfSocks = numOfSocks;
		this.color = color;
		this.washed = false;
		this.dry = false;
		this.timeC = 0;
	}
	// Get the number of pants
	@Override
	public int getNumOfPants() {
		// TODO Auto-generated method stub
		return numOfPants;
	}
	// Get the number of socks
	@Override
	public int getNumOfSocks() {
		// TODO Auto-generated method stub
		return numOfSocks;
	}
	// Get the number of shirts
	@Override
	public int getNumOfShirts() {
		// TODO Auto-generated method stub
		return numOfShirts;
	}
	// return whether the clothes are cleaned or not
	@Override
	public boolean getStatus() {
		
		return washed & dry;
	}
	// Check if the clothes are washed, but not dried
	@Override
	public void setWashed() {
		washed = true;
		
	}
	// Check if the clothes are dried or wet
	@Override
	public void setDried() {
		dry = true;
		
	}
	// Add time to the order
	public void addT(int t)
	{
		this.timeC = this.timeC + t;
	}
	
	
	

}
