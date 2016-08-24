package factoryPattern;



public class ShapeFactory {
	public Shape shapeget(String ShapeType){
		switch (ShapeType) {
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
