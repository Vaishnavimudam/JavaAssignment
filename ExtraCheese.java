package decorator;

public class ExtraCheese extends Topping{
	BasePizza basePizza;
	public ExtraCheese(BasePizza pizza)
	{
		this.basePizza=pizza;
	}
	@Override
	int cost() {
		
		return basePizza.cost()+15;
	}

}
