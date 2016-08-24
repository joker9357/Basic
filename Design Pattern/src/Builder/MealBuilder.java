package Builder;

public class MealBuilder {
	public Meal VegburgerMeal(){
		Meal meal=new Meal();
		meal.AddItem(new VegBurger());
		meal.AddItem(new Coke());
		return meal;
		
	}
	
	public Meal ChickburgerMeal(){
		Meal meal=new Meal();
		meal.AddItem(new ChickBurger());
		meal.AddItem(new Pepsi());
		return meal;
		
	}

}
