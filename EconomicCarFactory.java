package AbstractFactory;

public class EconomicCarFactory implements AbstractFactory{
	
	
	@Override
	public Car getInstance(int price) {
		// TODO Auto-generated method 

		if(price<=300000)
			return new EconomicCar1();
		else if(price>300000)
			return new EconomicCar2();
		return null;
	}
	
}
