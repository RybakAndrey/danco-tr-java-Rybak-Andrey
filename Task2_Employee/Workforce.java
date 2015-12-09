public class Workforce{
    protected String name;
    protected String surname;
    protected String gender;

    public Workforce(String name, String surname, String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        System.out.println("class Workforce");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
}