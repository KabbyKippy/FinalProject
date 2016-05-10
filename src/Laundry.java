
public abstract class Laundry {
	// Set variables needed for later methods, keeping amount of clothes and time to clean it
	int numOfShirts;
	int numOfPants;
	int numOfSocks;
	int timeC;
	
	// Check if it's color clothes, washed, or dried
	boolean color;
	boolean washed;
	boolean dry;
	
	// Set the abstract methods 
	public abstract int getNumOfPants();
	public abstract int getNumOfSocks();
	public abstract int getNumOfShirts();
	public abstract boolean getStatus();
	
	public abstract void setWashed();
	public abstract void setDried();
	
	// Return the total number of clothes
	public int getTotal(){
		return numOfShirts + numOfPants + numOfSocks;
	}
	
	// Check if the laundry is color or white
	public boolean isColor(){
		return color;
	}
	
	// ToString method
	public String toString()
	{
		return "You have: Shirts" + numOfShirts+ ", Pants" + numOfPants +"Socks "+ numOfSocks + "the color status of this order is : " + color+ "yup";
		
		
	}
	
	// Get the time required for clean the clothes given
	public int getT(){return timeC;}
	
	// Calculate the time needed to clean an entire laundry load
	public void Time()
	{	int minute = 0;
		int hour = 0 ;
		int days = 0 ;
		if(timeC/60 >= 1)
		{
			hour = timeC/60;
			if(hour/24 >= 1)
			{
				days = hour/24;
				hour = hour%24;
			}
			
		}
		minute = timeC%60;
		
		System.out.println("It will take: " + days + "days ," + hour + "hours and " + minute+ " minutes for your clothes to be prepared!") ;
	}
}
