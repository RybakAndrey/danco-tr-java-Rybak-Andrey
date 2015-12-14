import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu implements MenuUtil{

	private Dish[] dishes = new Dish[0];
	
	public void showMenu() {
		for(int i = 0; i<dishes.length;i++){
			System.out.println(dishes[i].getName() + "	price: $" + dishes[i].getPrice());
		}
	}

	public void addDish(Dish d) {
		Dish[] temp = new Dish[dishes.length+1];
		for(int i=0; i<dishes.length; i++){
			temp[i]=dishes[i];	 
		}
		temp[temp.length-1]= d;
		this.dishes = temp;	
	}

	public void removeDish(Dish d) {
		List<Dish> temp = new ArrayList<Dish>(Arrays.asList(dishes));
		temp.remove(d);
		Dish[] tempArr = new Dish[dishes.length-1];
		temp.toArray(tempArr);
		dishes = tempArr;
	}
	
}
