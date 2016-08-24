package AbstractFactoryPattern;
/*
 * ���󹤳�ģʽ�ṩ��һ�ַ�ʽ�����Խ�һ�����ͬһ����ĵ����Ĺ�����װ������������ʹ���У��ͻ��˳�����Ҫ��������
 * �����ľ���ʵ�֣�Ȼ��ʹ�ó��󹤳���Ϊ�ӿ���������һ����ľ�����󡣿ͻ��˳�����Ҫ֪��������ģ�������Щ�ڲ�
 * �Ĺ��������л�ö���ľ������ͣ���Ϊ�ͻ��˳����ʹ����Щ�����ͨ�ýӿڡ����󹤳�ģʽ��һ������ʵ��ϸ������
 * �ǵ�һ��ʹ�÷��뿪����������������Կ���ʹ�ó��󹤳�ģʽ��1.һ��ϵͳҪ���������Ĳ�Ʒ�Ĵ�������Ϻͱ�ʾʱ��
 * 2.һ��ϵͳҪ�ɶ����Ʒϵ���е�һ��������ʱ��3.��Ҫǿ��һϵ����صĲ�Ʒ���������Ա��������ʹ��ʱ��4.�ṩ
 * һ����Ʒ��⣬��ֻ����ʾ���ǵĽӿڶ�����ʵ��ʱ��
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
