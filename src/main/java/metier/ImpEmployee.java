package metier;

import jakarta.persistence.*;

import java.util.List;

public class ImpEmployee implements IEmployee{

    private EntityManager entityManager;

    public ImpEmployee(){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        this.entityManager = entityManagerFactory.createEntityManager();


    }

    @Override
    public void AjouterEmployee(Employee e) {
        EntityTransaction transaction=entityManager.getTransaction();
        transaction.begin();
        try{
            entityManager.persist(e);
            transaction.commit();}
        catch (Exception E) {
            transaction.rollback();
            E.printStackTrace();
        }

    }

    @Override
    public List<Employee> ConsulterListeEmployee() {
        Query query=entityManager.createQuery("select e from Employee e");
        return query.getResultList();

    }

    @Override
    public List<Employee> ConsulterListeEmployee(String s) {
        Query query=entityManager.createQuery("select e from Employee e where e.service like :x");
        query.setParameter("x", "%"+s+"%");
        return query.getResultList();
    }

    @Override
    public List<Employee> ConsulterListeEmployeeDate(String dd, String df) {
        Query query = entityManager.createQuery("select e from Employee e where e.DateEmbauche between :startDate AND :endDate");
        query.setParameter("startDate", dd);
        query.setParameter("endDate", df);
        return query.getResultList();
    }
}
