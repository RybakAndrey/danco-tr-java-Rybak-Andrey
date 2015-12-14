
public class Main {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		Menu menu = new Menu();
		
		//Add dishes on the menu, and show all menu with prices.
		System.out.println("Menu:");
		Dish dish1 = new Dish("Salat cezar",6);
		Dish dish2 = new Dish("Potato  ",10);
		Dish dish3 = new Dish("Kotletka",15);
		
		menu.addDish(dish1);
		menu.addDish(dish2);
		menu.addDish(dish3);
		menu.showMenu();
		System.out.println();
		
		//Adding and removing cooks
		Cook cook1 = new Cook("Andrey");
		Cook cook2 = new Cook("Alexey");
		Cook cook3 = new Cook("Sergei");
		restaurant.addCooks(cook1);
		restaurant.addCooks(cook2);
		restaurant.addCooks(cook3);
		restaurant.removeCooks(cook2);
		restaurant.getListOfCooks();
		System.out.println();
		
		
		//Make and close orders;
		Table table1 = new Table(1);
		Table table2 = new Table(2);
		Order order1 = new Order();
		Order order2 = new Order();
		order1.makeOrder(cook1, table1);
		order1.addDishToOrder(dish1);
		order1.addDishToOrder(dish2);
		order2.makeOrder(cook2, table2);
		order2.addDishToOrder(dish3);
		order2.closeOrder();
		System.out.println("Table 1 status: " + table1.getStatus());
		System.out.println("Cook1 status: " + cook1.getStatus());
		System.out.println("Table 2 status: " + table2.getStatus());
		System.out.println("Cook2 status: " + cook2.getStatus() + "\n");
		
		//Order for a free cook
		//Try set order for a busy cook
		cook1.addOrder(order2); // Error message 'This cook are busy'
		cook2.addOrder(order2); // Success
		System.out.println();
		
		//Total price for a table
		System.out.println("Total price for table 1 $"+ table1.getOrder().calculateTotalPrice() + "\n");
		
		//Show info about cook
		cook1.getCookInfo();
		System.out.println();
		
		//Show info about all cooks
		restaurant.getListOfCooks();
		
	}

}
