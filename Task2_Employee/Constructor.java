public class Constructor{

    public void Construct(){
        Employee andreyRybak = new Employee("Andrey","Rybak","Man","+375336240540","10/12/2015");
        Office office121 = new Office(121);
        Position programmer = new Position("Programmer",500);

        office121.setEmployee(andreyRybak);
        andreyRybak.setOffice(office121);
        andreyRybak.setPosition(programmer);
        programmer.addEmployees(andreyRybak);

        System.out.println("Name: " + andreyRybak.getName()+ "\nSurname: " + andreyRybak.getSurname() + "\nGender: " +
                            andreyRybak.getGender() + "\nPhoneNumber: " + andreyRybak.getPhoneNumber() + "\nDate: " +
                            andreyRybak.getEmploymentDate() + "\nPosition: " + andreyRybak.getPosition().getName() + "\nSalary: " +
                            andreyRybak.getPosition().getSalary() + "\nOffice: " + andreyRybak.getOffice().getNumber());
    }


}