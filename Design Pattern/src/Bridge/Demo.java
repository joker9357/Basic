package Bridge;
/*
 * 桥接模式是软件设计模式中最复杂的模式之一，它把事物对象和其具体行为、具体特征分离开来，使它们可以各自独立的变化。
 * 事物对象仅是一个抽象的概念。如“圆形”、“三角形”归于抽象的“形状”之下，而“画圆”、“画三角”归于实现行为的“画图”类之
 * 下，然后由“形状”调用“画图”。
 * Step 1：Create bridge implementer interface.DrawAPI.java
 * Step 2：Create concrete bridge implementer classes implementing the DrawAPI interface.
 *         RedCircle.java/GreenCircle.java
 * Step 3：Create an abstract class Shape using the DrawAPI interface.Shape.java
 * Step 4：Create concrete class implementing the Shape interface.Circle.java
 * Step 5：Use the Shape and DrawAPI classes to draw different colored circles.
 *         BridgePatternDemo.java
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(100,100, 10, new RedCircle());
	    Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	    redCircle.draw();
	    greenCircle.draw();

	}

}
