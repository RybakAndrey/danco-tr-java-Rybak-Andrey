import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
	private String name;
	private List<Composition> compositions = new ArrayList<Composition>();
	
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
			System.out.println(co.getGenre().getName());
		}
	}
	
	public List<Composition> getCompositions(){
		return compositions;
	}
	public void addCompositions(Composition c){
		compositions.add(c);
	}
	public void removeCompositions(Composition c){
		compositions.remove(c);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
