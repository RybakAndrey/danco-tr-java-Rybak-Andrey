import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Genre {
	private String name;
	private Set<Composition> compositions = new HashSet<Composition>();
	
	public Genre(String name){
		this.setName(name);
	}
	
	public Set<Composition> getCompositions(){
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
