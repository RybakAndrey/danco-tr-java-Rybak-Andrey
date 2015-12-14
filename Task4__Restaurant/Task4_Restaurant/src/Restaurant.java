import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant implements RestaurantUtil{
	private String name;
	private Cook[] cooks = new Cook[0];
	//private Table[] tables;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Cook[] getCooks(){
		return cooks;
	}
	
	public void addCooks(Cook c){
		Cook[] temp = new Cook[cooks.length+1];
		for(int i=0; i<cooks.length; i++){
			temp[i]=cooks[i];	 
		}
		temp[temp.length-1]= c;
		this.cooks = temp;
	}
	
	public void removeCooks(Cook c){
		List<Cook> temp = new ArrayList<Cook>(Arrays.asList(cooks));
		temp.remove(c);
		Cook[] tempArr = new Cook[cooks.length-1];
		temp.toArray(tempArr);
		cooks = tempArr;
	}
	
	public void getListOfCooks(){
		for(int i = 0; i<this.getCooks().length;i++){
			System.out.println(this.getCooks()[i].getName());
			this.getCooks()[i].getCookInfo();
			System.out.println();
		}
	}
}
