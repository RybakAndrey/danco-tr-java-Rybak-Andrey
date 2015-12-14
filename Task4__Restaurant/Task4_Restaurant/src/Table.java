
public class Table {
	private int number;
	private Order order;
	private String status = "Not busy";
	
	public Table(int number){
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void setOrder(Order order) {
		if(this.status.equals("Busy")){
			System.out.println("This table are busy");
		}
		else{
			this.order = order;
			status = "Busy";
		}
	}
}
