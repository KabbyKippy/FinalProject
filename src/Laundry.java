
public abstract class Laundry {
	
	int numOfShirts;
	int numOfPants;
	int numOfSocks;
	int timeC;
	
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
	public String toString()
	{
		return "You have: Shirts" + numOfShirts+ ", Pants" + numOfPants +"Socks "+ numOfSocks;
		
		
	}
	public int getT(){return timeC;}
	public String Time()
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
		
		return "It will take: " + days + "days ," + hour + "hours and " + minute+ " minutes for your clothes to be prepared!" ;
	}
}
