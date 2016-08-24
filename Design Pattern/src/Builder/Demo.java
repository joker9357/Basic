package Builder;
/*
 * ����ģʽ����һ�ֶ��󹹽�ģʽ�������Խ����Ӷ���Ľ�����̳��������������𣩣�ʹ���������̵Ĳ�ͬʵ�ַ���
 * ���Թ������ͬ���֣����ԣ��Ķ������������ʹ��������ģʽ��1.���������Ӷ�����㷨Ӧ�ö����ڸö������ɲ�
 * ���Լ����ǵ�װ�䷽ʽʱ��2.��������̱�����������Ķ����в�ͬ�ı�ʾʱ��
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
