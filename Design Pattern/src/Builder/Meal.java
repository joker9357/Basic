package Builder;

import java.util.ArrayList;
import java.util.List;



public class Meal {
	private List<Item> items=new ArrayList<>();
	
	public void AddItem(Item item){
		items.add(item);
	}
	
	public float GetCost(){
		float cost=0.0f;
		for(Item item:items){
			cost+=item.price();
		}
		return cost;
	}
	public void show(){
		 for (Item item : items) {
	         System.out.print("Item : " + item.name());
	         System.out.print(", Packing : " + item.pack().pack());
	         System.out.println(", Price : " + item.price());
	      }		
	}

}
