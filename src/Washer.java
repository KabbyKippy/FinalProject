
public class Washer implements Machine<LaundryOrder> {
	int washerM = 10; // number of washer machines which the store has
	static final int cwash = 30; // amount of time it takes to wash colored clothing
	static final int wwash = 26; // the amount of time it takes to wash non colored (white) clothing
	static final int oneload = 10; // number of articles of clothing which go into one laod
	int hold = 0; // holds the number of clothing articles for the operate method
	int time = 0;
	public Washer()
	{System.out.println("the company currently has " + washerM + " Washer machines");}
	public void setWasher(int washerM)
	{
		this.washerM = washerM; // set the number of washers
		
	}
	public String toString()
	{
		return "You have: " + washerM + "washer machines"; //tells how many washer machiens teh store has
		
	}
	@Override
	public LaundryOrder operate(LaundryOrder load) {
		load.setWashed(); // makes it so that the load is clean now but still wet
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
			
			if(hold% washerM >0)
			{
				hold = (hold/washerM) +1; // number of washer machines required
			}
			else
			{
				hold = hold/washerM;
			}
			if(hold <= washerM)
			{
				time = cwash;// 10 or less loads it takes cwash
			}
			else
			{
				for(int x =0; x<(hold/washerM); x++)
				{
					time = time + cwash; // more than 10 loads each set of loads added					
				}
				if(hold%washerM > 0)
				{ time = time + cwash;}// if there is an odd final load add the time
				
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
			
			if(hold% washerM >0)
			{
				hold = (hold/washerM) +1; // number of washer machines required
			}
			else
			{
				hold = hold/washerM;
			}
			if(hold <= washerM)
			{
				time = wwash;// 10 or less loads it takes cwash
			}
			else
			{
				for(int x =0; x<(hold/washerM); x++)
				{
					time = time + wwash; // more than 10 loads each set of loads added					
				}
				if(hold%washerM > 0)
				{ time = time + wwash;}// if there is an odd final load add the time
				
			}
			
		}
		load.addT(time);
		// TODO Auto-generated method stub
		return load;
	}
	


}
