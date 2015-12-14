
public interface OrderUtil {
	public void makeOrder(Cook c,Table t);
	public void addDishToOrder(Dish d);
	public void removeDishFromOrder(Dish d);
	public void closeOrder();
	public double calculateTotalPrice();
}
