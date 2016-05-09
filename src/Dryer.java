
public class Dryer implements Machine<LaundryOrder>{
	int Dryer = 12; // number of washer machines which the store has
	static final int dry = 60; // amount of time it takes to wash colored clothing
	
	static final int oneload = 20; // number of articles of clothing which go into one laod
	int hold = 0; // holds the number of clothing artcles for the operate method
	int time = 0;
	public Dryer()
	{System.out.println("the company currently has " + Dryer + " Dryer machines");}
	public void setDryer(int dryerM)
	{
		this.Dryer = dryerM; // set the number of washers
		
	}
	public String toString()
	{
		return "You have: " + Dryer + "Dryer machines"; //tells how many washer machiens teh store has
		
	}
	@Override
	public LaundryOrder operate(LaundryOrder load) {
		load.setDried(); // makes it so that the load is clean now but still wet
		if(load.color)
		{
			if(load.getNumOfSocks()%4 > 0)// if there is a remainder of socks that last pair becomes one load to add
			{
			hold = (load.getNumOfSocks()/4) + 1;
			}
			else{ hold = load.getNumOfSocks()/4;} //if there is no reaminder then you have a rounded number of loads of socks
			hold = hold + load.getNumOfShirts() + load.getNumOfPants(); // adds the shirts and pants to the socks
			
			if(hold%oneload > 0)// figure out how many loads neccessary
			{
			hold = (hold/oneload) + 1;
			}
			else{ hold = hold/oneload;}
			
			if(hold% Dryer >0)
			{
				hold = (hold/Dryer) +1; // number of washer machines required
			}
			else
			{
				hold = hold/Dryer;
			}
			if(hold <= Dryer)
			{
				time = dry;// 10 or less loads it takes dry
			}
			else
			{
				for(int x =0; x<(hold/Dryer); x++)
				{
					time = time + dry; // more than 10 loads each set of loads added					
				}
				if(hold%Dryer > 0)
				{ time = time + dry;}// if there is an odd final load add the time
				
			}
		}
		else
		{
			if(load.getNumOfSocks()%4 > 0)// if there is a remainder of socks that last pair becomes one load to add
			{
			hold = (load.getNumOfSocks()/4) + 1;
			}
			else{ hold = load.getNumOfSocks()/4;} //if there is no reaminder then you have a rounded number of loads of socks
			hold = hold + load.getNumOfShirts() + load.getNumOfPants(); // adds the shirts and pants to the socks
			
			if(hold%oneload > 0)// figure out how many loads neccessary
			{
			hold = (hold/oneload) + 1;
			}
			else{ hold = hold/oneload;}
			
			if(hold% Dryer >0)
			{
				hold = (hold/Dryer) +1; // number of washer machines required
			}
			else
			{
				hold = hold/Dryer;
			}
			if(hold <= Dryer)
			{
				time = dry;// 10 or less loads it takes cwash
			}
			else
			{
				for(int x =0; x<(hold/Dryer); x++)
				{
					time = time + dry; // more than 10 loads each set of loads added					
				}
				if(hold%Dryer > 0)
				{ time = time + dry;}// if there is an odd final load add the time
				
			}
			
		}
		load.addT(time);
		// TODO Auto-generated method stub
		return load;
	}

}
