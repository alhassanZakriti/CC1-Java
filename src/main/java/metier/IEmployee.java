package metier;

import java.util.List;

public interface IEmployee {
    public void AjouterEmployee(Employee e);

    public List<Employee> ConsulterListeEmployee();

    public List<Employee> ConsulterListeEmployee(String s);

    public List<Employee> ConsulterListeEmployeeDate(String dd, String df);

}
