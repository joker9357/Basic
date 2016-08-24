package AbstractFactoryPattern;

public class FactoryProducor {

	public  AbstractFactory getFactory(String choice){
		switch (choice) {
		case "color":
			
			return new ColorFactory();

		case "shape":
			return new ShapeFactory();
		}
		return null;
	}

}
