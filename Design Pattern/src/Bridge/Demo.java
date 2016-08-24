package Bridge;
/*
 * �Ž�ģʽ��������ģʽ����ӵ�ģʽ֮һ���������������������Ϊ�������������뿪����ʹ���ǿ��Ը��Զ����ı仯��
 * ����������һ������ĸ���硰Բ�Ρ����������Ρ����ڳ���ġ���״��֮�£�������Բ�����������ǡ�����ʵ����Ϊ�ġ���ͼ����֮
 * �£�Ȼ���ɡ���״�����á���ͼ����
 * Step 1��Create bridge implementer interface.DrawAPI.java
 * Step 2��Create concrete bridge implementer classes implementing the DrawAPI interface.
 *         RedCircle.java/GreenCircle.java
 * Step 3��Create an abstract class Shape using the DrawAPI interface.Shape.java
 * Step 4��Create concrete class implementing the Shape interface.Circle.java
 * Step 5��Use the Shape and DrawAPI classes to draw different colored circles.
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
