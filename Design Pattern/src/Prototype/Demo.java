package Prototype;
/*
 * һ���Ѿ����ڵ�ʵ���������µ�ʵ��,�������½�ʵ���������Ƶ�ʵ�������������Ƶġ�ԭ�͡������ԭ���ǿɶ��Ƶġ�ԭ��
 * ģʽ�����ڴ������ӵĻ��ߺ�ʱ��ʵ������Ϊ��������£�����һ���Ѿ����ڵ�ʵ��ʹ�������и���Ч�����ߴ���ֵ��ȣ�
 * ֻ��������һ����ͬ�����ݡ�
 * Step 1:Create an abstract class implementing Clonable interface.Shape.java
 * Step 2:Create concrete classes extending the above class.Rectangle.java
 * Step 3:Create a class to get concrete classes from database and store them in a Hashtable.
 *        ShapeCache.java
 * Step 4:PrototypePatternDemo uses ShapeCache class to get clones of shapes stored in a 
 *        Hashtable.PrototypePatternDemo.java
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());	
		

	}

}
