package one_to_many_uni;

import one_to_many_uni.entity.Department;
import one_to_many_uni.entity.Employee;
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
//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Andrey", "Petrov", 1000);
//
//            department.addEmployeeToDep(employee1);
//            department.addEmployeeToDep(employee2);
//            session.persist(department);

            session.beginTransaction();

            Department department = session.get(Department.class, 2);
            System.out.println(department);
            System.out.println(department.getEmployees());


            session.getTransaction().commit();
        }
    }
}
