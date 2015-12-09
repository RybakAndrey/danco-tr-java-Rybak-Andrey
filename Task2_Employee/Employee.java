public class Employee extends Workforce {
    private String phoneNumber;
    private String employmentDate;
    private Office office;
    private Position position;

    public Employee(String name, String surname,String gender,String phoneNumber, String employmentDate){
        super(name,surname,gender);
        this.phoneNumber = phoneNumber;
        this.employmentDate = employmentDate;
        System.out.println("class Employee");
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmploymentDate(String employmentDate){
        this.employmentDate = employmentDate;
    }

    public String getEmploymentDate()
    {
        return employmentDate;
    }

    public void setOffice(Office o){
        office = o;
    }

    public Office getOffice()
    {
        return office;
    }

    public void setPosition(Position p){
        position = p;
    }

    public Position getPosition()
    {
        return position;
    }
}
