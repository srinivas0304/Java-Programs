package interfaceConcept;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic
{
	public static void main(String[] args) 
	{
		CentralTraffic ct=new AustralianTraffic();
		ct.greenGo();
		
		ContinentalTraffic ct1 = new AustralianTraffic();
		ct1.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("From greenGo() method");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("From trainSymbol() method");
	}
	
}
