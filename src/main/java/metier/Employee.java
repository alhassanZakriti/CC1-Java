package metier;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "Employee")
public class Employee  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column
    private String nom;
    private String service;
    private double salaire;
    private String DateEmbauche;

    public Employee(String nom, String service, String dateEmbauche,double salaire) {
        this.nom = nom;
        this.service = service;
        this.DateEmbauche = dateEmbauche;
        this.salaire=salaire;
    }

    public Employee() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getDateEmbauche() {
        return DateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.DateEmbauche = dateEmbauche;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", service='" + service + '\'' +
                ", DateEmbauche='" + DateEmbauche + '\'' +
                '}';
    }
}