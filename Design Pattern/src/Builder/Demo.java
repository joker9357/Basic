package Builder;
/*
 * 建造模式，是一种对象构建模式。它可以将复杂对象的建造过程抽象出来（抽象类别），使这个抽象过程的不同实现方法
 * 可以构造出不同表现（属性）的对象。在以下情况使用生成器模式：1.当创建复杂对象的算法应该独立于该对象的组成部
 * 分以及它们的装配方式时。2.当构造过程必须允许被构造的对象有不同的表示时。
 * Step 1:Create an interface Item representing food item and packing.Item.java/Packing.java
 * Step 2:Create concrete classes implementing the Packing interface.Wrapper.java/Bottle.java
 * Step 3:Create abstract classes implementing the item interface providing default functionalities.
 *        Burger.java/ColdDrink.java
 * Step 4:Create concrete classes extending Burger and ColdDrink classes.
 *        VegBurger.java/ChickenBurger.java/Coke.java/Pepsi.java
 * Step 5:Create a Meal class having Item objects defined above.Meal.java
 * Step 6:Create a MealBuilder class, the actual builder class responsible to create Meal objects.
 *        MealBuilder.java
 * Step 7:BuiderPatternDemo uses MealBuider to demonstrate builder pattern.BuilderPatternDemo.java
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.VegburgerMeal();
	      System.out.println("Veg Meal");
	      vegMeal.show();
	      System.out.println("Total Cost: " + vegMeal.GetCost());

	      Meal ChickMeal = mealBuilder.ChickburgerMeal();
	      System.out.println("\n\nChick Meal");
	      ChickMeal.show();
	      System.out.println("Total Cost: " + ChickMeal.GetCost());

	}

}
