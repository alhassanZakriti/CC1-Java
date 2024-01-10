package web;

import metier.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeModel {
    private Employee E =new Employee();
    private List<Employee> Emodel=new ArrayList<Employee>();
    private String Service;
    private String Date;

    public EmployeModel() {
        super();
    }

    public Employee getE() {
        return E;
    }

    public void setE(Employee e) {
        E = e;
    }

    public List<Employee> getEmodel() {
        return Emodel;
    }

    public void setEmodel(List<Employee> emodel) {
        Emodel = emodel;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}