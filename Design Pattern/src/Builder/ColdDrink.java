package Builder;

public abstract class ColdDrink implements Item {

	@Override
	public Packing pack() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();
		

}
