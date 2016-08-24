package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		switch (color) {
		case "red":
			return new Red();		
		case "green" :
			return new Green();
		case "blue" :
			return new Blue();
		}
		
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
