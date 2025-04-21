package AbstractFactory;

public class LuxuryCarFactory implements AbstractFactory{
	
	
	@Override
	public Car getInstance(int price) {
		// TODO Auto-generated method 

		if(price<=500000)
			return new LuxuryCar1();
		else if(price>500000)
			return new LuxuryCar2();
		return null;
	}
	
}
