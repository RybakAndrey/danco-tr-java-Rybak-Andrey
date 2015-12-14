import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order implements OrderUtil {
	private Table table;
	private Dish[] dishes = new Dish[0];
	private Cook cook;
	
	
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public Dish[] getDishes() {
		return dishes;
	}
	
	public Cook getCook() {
		return cook;
	}
	public void setCook(Cook cook) {
		this.cook = cook;
	}
	
	public void makeOrder(Cook c, Table t) {
		
		this.cook = c;
		c.addOrder(this);
		this.table = t;
		t.setOrder(this);
	}

	public void addDishToOrder(Dish d) {
		Dish[] temp = new Dish[dishes.length+1];
		for(int i=0; i<dishes.length; i++){
			temp[i]=dishes[i];	 
		}
		temp[temp.length-1]= d;
		this.dishes = temp;	
	}

	public void removeDishFromOrder(Dish d) {
		List<Dish> temp = new ArrayList<Dish>(Arrays.asList(dishes));
		temp.remove(d);
		Dish[] tempArr = new Dish[dishes.length-1];
		temp.toArray(tempArr);
		dishes = tempArr;
	}

	public void closeOrder() {
		this.table.setStatus("Not busy");
		this.cook.setStatus("Not busy");
	}

	public double calculateTotalPrice() {
		int totalPrice = 0;
		for(int i=0;i<dishes.length;i++){
			totalPrice+=dishes[i].getPrice();
		}
		return totalPrice;
	}
	
	
	
}
