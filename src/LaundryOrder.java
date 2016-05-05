
public class LaundryOrder extends Laundry{
	
	public LaundryOrder(int numOfShirts, int numOfPants, int numOfSocks, boolean color, String CustomerName){
		this.numOfPants = numOfPants;
		this.numOfShirts = numOfShirts;
		this.numOfSocks = numOfSocks;
		this.color = color;
		this.washed = false;
		this.dry = false;
	}

	@Override
	public int getNumOfPants() {
		// TODO Auto-generated method stub
		return numOfPants;
	}

	@Override
	public int getNumOfSocks() {
		// TODO Auto-generated method stub
		return numOfSocks;
	}

	@Override
	public int getNumOfShirts() {
		// TODO Auto-generated method stub
		return numOfShirts;
	}

	@Override
	public boolean getStatus() {
		
		return washed & dry;
	}

	@Override
	public void setWashed() {
		washed = true;
		
	}

	@Override
	public void setDried() {
		dry = true;
		
	}
	
	
	
	

}
