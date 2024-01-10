package metier;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ImpEmployee dao = new ImpEmployee();
//        Employee E = new Employee("Mohammed", "manager", "10-12-2012",1000);
//        Employee E1 = new Employee("Ghizlane", "Secretaire", "10-12-2012", 2000);
//        Employee E2 = new Employee("Achraf", "Ingenieur", "10-12-2019", 1200);
//        Employee E3 = new Employee("Samira", "manager", "10-12-2022", 20000);
//        dao.AjouterEmployee(E);
//        dao.AjouterEmployee(E1);
//        dao.AjouterEmployee(E2);
//        dao.AjouterEmployee(E3);

        List<Employee> emp = dao.ConsulterListeEmployee();
        int i=0;
//        for (Employee e : emp) {
//            i++;
//            System.out.println("Employee numero "+i+": "+e.toString());
//        }
        List<Employee> emp1 = dao.ConsulterListeEmployee("manager");
        for (Employee e : emp1) {
            i++;
            System.out.println("manager num "+i+": "+e.toString());
        }
//        Employee emp = new Employee("Mohammed", "manager","2027-11-25", 1900);
//        dao.AjouterEmployee(emp);
//        List<Employee> emp2 = dao.ConsulterListeEmployeeDate("2020-11-25","2025-11-25");
//        for (Employee e : emp2) {
//            System.out.println(e.toString());
  }

}


