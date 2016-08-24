package factoryPattern;
/*
 * 工厂方法模式是一种实现了“工厂”概念的面向对象设计模式。就像其他创建型模式一样，它也是处理在不指定对象具体类型
 * 的情况下创建对象的问题。工厂方法模式的实质是“定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类。
 * 工厂方法让类的实例化推迟到子类中进行。”下列情况可以考虑使用工厂方法模式：1.创建对象需要大量重复的代码。
 * 2.创建对象需要访问某些信息，而这些信息不应该包含在复合类中。3.创建对象的生命周期必须集中管理，以保证在整个程序
 * 中具有一致的行为。三个局限：1.重构已经存在的类会破坏客户端代码。2.因为工厂方法所实例化的类具有私有的构造方法，
 * 所以这些类就不能扩展了。3.如果确实扩展了工厂方法所实例化的类（例如将构造方法设为保护的，虽然有风险但也是可行的），
 * 子类必须具有所有工厂方法的一套实现。
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
