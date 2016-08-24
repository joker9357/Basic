package factoryPattern;
/*
 * ��������ģʽ��һ��ʵ���ˡ����������������������ģʽ����������������ģʽһ������Ҳ�Ǵ����ڲ�ָ�������������
 * ������´�����������⡣��������ģʽ��ʵ���ǡ�����һ����������Ľӿڣ�����ʵ������ӿڵ���������ʵ�����ĸ��ࡣ
 * �������������ʵ�����Ƴٵ������н��С�������������Կ���ʹ�ù�������ģʽ��1.����������Ҫ�����ظ��Ĵ��롣
 * 2.����������Ҫ����ĳЩ��Ϣ������Щ��Ϣ��Ӧ�ð����ڸ������С�3.����������������ڱ��뼯�й����Ա�֤����������
 * �о���һ�µ���Ϊ���������ޣ�1.�ع��Ѿ����ڵ�����ƻ��ͻ��˴��롣2.��Ϊ����������ʵ�����������˽�еĹ��췽����
 * ������Щ��Ͳ�����չ�ˡ�3.���ȷʵ��չ�˹���������ʵ�������ࣨ���罫���췽����Ϊ�����ģ���Ȼ�з��յ�Ҳ�ǿ��еģ���
 * �������������й���������һ��ʵ�֡�
 * Step 1:Create an interface.Shape.java
 * Step 2:Create concrete classes implementing the same interface.
 * Rectangle.java/Square.java/Circle.java
 * Step 3:Create a Factory to generate object of concrete class based on given information.
 *        ShapeFactory.java
 * Step 4:Use the Factory to get object of concrete class by passing an information such as type.
 *        FactoryPatternDemo.java
 */
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape1=shapeFactory.shapeget("circle");
		shape1.draw();
		Shape shape2=shapeFactory.shapeget("square");
		shape2.draw();
		Shape shape3=shapeFactory.shapeget("rectangle");
		shape3.draw();

	}

}
