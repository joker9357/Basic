package AbstractFactoryPattern;
/*
 * 抽象工厂模式提供了一种方式，可以将一组具有同一主题的单独的工厂封装起来。在正常使用中，客户端程序需要创建抽象
 * 工厂的具体实现，然后使用抽象工厂作为接口来创建这一主题的具体对象。客户端程序不需要知道（或关心）它从这些内部
 * 的工厂方法中获得对象的具体类型，因为客户端程序仅使用这些对象的通用接口。抽象工厂模式将一组对象的实现细节与他
 * 们的一般使用分离开来。在以下情况可以考虑使用抽象工厂模式：1.一个系统要独立于它的产品的创建、组合和表示时。
 * 2.一个系统要由多个产品系列中的一个来配置时。3.需要强调一系列相关的产品对象的设计以便进行联合使用时。4.提供
 * 一个产品类库，而只想显示它们的接口而不是实现时。
 * Step 1:Create an interface.Shape.java
 * Step 2:Create concrete classes implementing the same interface.
 *        Rectangle.java/Square.java/Circle.java
 * Step 3:Create an interface.Color.java
 * Step 4:Create concrete classes implementing the same interface.
 *        Red.java/Blue.java/Green.java
 * Step 5:Create an Abstract class to get factories for Color and Shape Objects.AbstractFactory.java
 * Step 6:Create Factory classes extending AbstractFactory to generate object of concrete class based 
 *        on given information.ShapeFactory.java/ColorFactory.java
 * Step 7:Create a Factory generator/producer class to get factories by passing an information 
 *        such as Shape or ColorFactoryProducer.java
 * Step 8:Use the FactoryProducer to get AbstractFactory in order to get factories of concrete 
 *        classes by passing an information such as type.AbstractFactoryPatternDemo.java
 */

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  FactoryProducor factoryProducor=new FactoryProducor();
		  AbstractFactory shapeFactory = factoryProducor.getFactory("shape");
	      Shape shape1 = shapeFactory.getShape("circle");
	      shape1.draw();
	      Shape shape2 = shapeFactory.getShape("rectangle");
	      shape2.draw();
	      Shape shape3 = shapeFactory.getShape("square");
	      shape3.draw();

	      AbstractFactory colorFactory = factoryProducor.getFactory("color");
	      Color color1 = colorFactory.getColor("red");
	      color1.fill();
	      Color color2 = colorFactory.getColor("green");
	      color2.fill();
	      Color color3 = colorFactory.getColor("blue");
	      color3.fill();

	}

}
