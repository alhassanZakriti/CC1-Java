package web;

import metier.Employee;
import metier.IEmployee;
import metier.ImpEmployee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
@WebServlet(name="Employe",urlPatterns= {"/controleur/","*.php"})
public class EmployeControleur extends HttpServlet {
    private IEmployee metier;
    public void init() throws ServletException {
        metier= new ImpEmployee();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmployeModel model =new EmployeModel();
        request.setAttribute("modele",model);
        String path=request.getServletPath();
        if (path.equals("/rechercher.php"))
        {   List<Employee> employe=metier.ConsulterListeEmployee();
            model.setEmodel(employe);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else if (path.equals("/home.php") )
        {request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else if (path.equals("/service.php") )
        {request.getRequestDispatcher("service.jsp").forward(request,response);
        }
        else if (path.equals("/date.php") )
        {request.getRequestDispatcher("date.jsp").forward(request,response);
        }
        else if (path.equals("/ajouter.php") && request.getMethod().equals("POST"))
        {
            String nom=request.getParameter("nom");
            String service=request.getParameter("service");
            String dateEmbauche=request.getParameter("dateEmbauche");
            double salaire= Double.parseDouble(request.getParameter("salaire"));
            metier.AjouterEmployee(new Employee(nom,service,dateEmbauche,salaire));
            //request.setAttribute("client", c);
            List<Employee> employe=metier.ConsulterListeEmployee();
            model.setEmodel(employe);
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        else if (path.equals("/listeDate.php")) {
            String dateDebut = request.getParameter("dateDebut");
            String dateFin = request.getParameter("dateFin");
            List<Employee> employe=metier.ConsulterListeEmployeeDate(dateDebut,dateFin);
            model.setEmodel(employe);
            request.getRequestDispatcher("date.jsp").forward(request,response);
        }
        else if (path.equals("/liste-par-service.php")) {
            String service = request.getParameter("service");
            List<Employee> employe=metier.ConsulterListeEmployee(service);
            model.setEmodel(employe);
            request.getRequestDispatcher("service.jsp").forward(request,response);
        }

    }

}