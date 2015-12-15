
public class Artist {
	private String name;
	private String surname;
	private String stageName;
	private String country;
	
	
	public Artist(String name, String surname,String stageName,String country){
		this.name = name;
		this.surname = surname;
		this.stageName = stageName;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getStageName() {
		return stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
