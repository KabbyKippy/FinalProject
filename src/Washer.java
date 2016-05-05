
public class Washer implements Machine<T> {
	
	@Override
	public LaundryOrder operate(LaundryOrder load) {
		// TODO Auto-generated method stub
		System.out.println("This washing machine is currently cleaning order: " + load.);
		return null;
	}

}
