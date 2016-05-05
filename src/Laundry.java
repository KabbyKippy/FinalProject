
public abstract class Laundry {
	
	int numOfShirts;
	int numOfPants;
	int numOfSocks;
	
	boolean color;
	boolean washed;
	boolean dry;
	
	public abstract int getNumOfPants();
	public abstract int getNumOfSocks();
	public abstract int getNumOfShirts();
	public abstract boolean getStatus();
	
	public abstract void setWashed();
	public abstract void setDried();
	
	
	public int getTotal(){
		return numOfShirts + numOfPants + numOfSocks;
	}
	
	public boolean isColor(){
		return color;
	}
	
}
