package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactoryProducer abstractFactoryproducerobj=new AbstractFactoryProducer();
		AbstractFactory abstractFactoryObj=abstractFactoryproducerobj.getFactoryInstance("Economic");
		Car carObj=abstractFactoryObj.getInstance(300000);
		System.out.println(carObj.getTopSpeed());
	}

}
