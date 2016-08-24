package Prototype;
/*
 * 一个已经存在的实例来返回新的实例,而不是新建实例。被复制的实例就是我们所称的“原型”，这个原型是可定制的。原型
 * 模式多用于创建复杂的或者耗时的实例，因为这种情况下，复制一个已经存在的实例使程序运行更高效；或者创建值相等，
 * 只是命名不一样的同类数据。
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
