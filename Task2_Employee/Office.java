public class Office{
    private int number;
    private Employee employee;

    public Office(int number){
        this.number = number;
        System.out.println("class Office");
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public void setEmployee(Employee e){
        employee = e;
    }

    public Employee getEmployee()
    {
        return employee;
    }

}