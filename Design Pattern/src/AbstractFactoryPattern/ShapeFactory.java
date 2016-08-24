package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		switch (shape) {
		case "rectangle":
			return new Rectangle();		
		case "square" :
			return new Square();
		case "circle" :
			return new circle();
		}
		return null;
	
	}

}
