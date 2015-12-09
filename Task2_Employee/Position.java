import java.util.List;
import java.util.ArrayList;
public class Position{
    private String name;
    private double salary;
    private List<Employee> employees = new ArrayList<Employee>();

    public Position(String name, double salary){
        this.name = name;
        this.salary = salary;
        System.out.println("class Position");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salart){
        this.salary =  salary;
    }

    public void addEmployees(Employee e){
        employees.add(e);
    }
    public void removeEmployees(Employee e){
        employees.remove(e);
    }

    public List<Employee> getEmployees()
    {
        return employees;
    }
}