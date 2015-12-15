import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompactDisc {
	private String name;
	private Composition[] compositions = new Composition[0];
	
	public CompactDisc(String name){
		this.setName(name);
	}
	
	public void totalDuration(){
		int totalDuration = 0;
		int totalDurationMin;
		int totalDurationSec;
		
		for(Composition co: this.compositions){
			totalDuration += co.getDuration();
		}
		totalDurationMin = totalDuration/60;
		totalDurationSec = totalDuration - totalDurationMin*60;
		System.out.println("Total duration of CD: "+totalDurationMin+"."+totalDurationSec);
	}
	
	public void generalGenre(){
		System.out.println("Genres present on the disk:");
		for(Composition co: this.compositions){
			System.out.println(co.getName() + " - " + co.getGenre());
		}
	}
	
	public Composition[] getCompositions(){
		return compositions;
	}
	public void addCompositions(Composition c){
		Composition[] temp = new Composition[compositions.length+1];
		for(int i=0; i<compositions.length; i++){
			temp[i]=compositions[i];	 
		}
		temp[temp.length-1]= c;
		this.compositions = temp;	
	}
	public void removeCompositions(Composition c){
		List<Composition> temp = new ArrayList<Composition>(Arrays.asList(compositions));
		temp.remove(c);
		Composition[] tempArr = new Composition[compositions.length-1];
		temp.toArray(tempArr);
		compositions = tempArr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
