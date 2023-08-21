package one_to_many.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Department department = new Department("IT", 300,1200);
//            Employee employee1 = new Employee("Polina", "Davydenko", 190);
//            Employee employee2 = new Employee("Yana", "Davydenko", 900);
//
//            department.addEmployeeToDep(employee1);
//            department.addEmployeeToDep(employee2);

//            session.persist(department);

//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());

            Employee employee = session.get(Employee.class, 1);
           session.remove(employee);

            session.getTransaction().commit();
        }
    }
}
