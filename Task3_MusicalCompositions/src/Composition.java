import java.util.ArrayList;
import java.util.List;

public class Composition {
	private String name;
	private int year;
	private int duration;
	private Genre genre;
	private List<Artist> artists = new ArrayList<Artist>();
	
	public Composition(String name, int year,int duration,Genre genre){
		this.name = name;
		this.year = year;
		this.duration = duration;
		this.genre = genre;
	}


	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;		
	}
	public int getYear(){
		return year;
	}
	public void setYear(int year){
		this.year = year;		
	}
	public int getDuration(){
		return duration;
	}
	public void setDuration(int duration){
		this.duration = duration;		
	}
	public Genre getGenre(){
		return genre;
	}
	public void setGenre(Genre genre){
		this.genre = genre;		
	}
	public List<Artist> getArtists(){
		return artists;
	}
	
	public void addArtists(Artist a){
		artists.add(a);
	}
	public void removeArtists(Artist a){
		artists.remove(a);
	}
	
}
