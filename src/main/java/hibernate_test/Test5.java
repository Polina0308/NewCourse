package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

        Employee employee = session.get(Employee.class, 6);
//        session.remove(employee);
//            Удаление из бд записи

            session.createQuery("delete  Employee where salary = 1000  ").executeUpdate();
            session.getTransaction().commit();

            System.out.println("Done");
        }


    }
}
