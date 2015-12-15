
public class Composition {
	private String name;
	private int year;
	private int duration;
	private String genre;
	private Artist artist;
	
	public Composition(Artist artist,String name, int year,int duration,String genre){
		this.artist = artist;
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
	public String getGenre(){
		return genre;
	}
	public void setGenre(String genre){
		this.genre = genre;		
	}
	
}
