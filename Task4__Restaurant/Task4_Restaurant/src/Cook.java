
public class Cook implements CookUtil {
	private String name;
	private String status = "Not busy";
	private Order order;
	
	public Cook(String name){
		this.name = name;
	}
	
	public void addOrder(Order order) {
		if(this.status.equals("Busy")){
			System.out.println("This cook are busy");
		}
		else{
			this.order = order;
			status = "Busy";
		}
	
	}
	
	public void removeOrder(Order order){
		this.order = null;
		status = "Not busy";
	}
	
	public void getCookInfo() {
		if(this.status.equals("Not busy")){
			System.out.println(this.getName() + ": " + this.getStatus());
		}else{
			System.out.println(this.getName() + ": " + this.getStatus() + "\nHave order:");
			System.out.println("Table: " + this.getOrder().getTable().getNumber());
			for(int i = 0; i<this.getOrder().getDishes().length; i++){
				System.out.println(this.getOrder().getDishes()[i].getName());
			}
			
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public Order getOrder(){
		return order;
	}
}
