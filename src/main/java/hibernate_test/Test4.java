package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.management.Query;
import java.util.List;
import java.util.Queue;

public class Test4 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            employee.setSalary(1500);
//            session.getTransaction().commit();
//            Запрос на обновление данных

            session.createQuery("update  Employee  set salary = 1000 where id = 2").executeUpdate();
            session.getTransaction().commit();
            System.out.println("Done");
        }


    }
}
