package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
       session.beginTransaction();
//            List <Employee> employees = session.createQuery("from Employee")
//                            .getResultList();
//            Выводит всех работников из БД

            List <Employee> employees = session.createQuery("from Employee  where name = 'Yana' AND salary = 60000")
                            .getResultList();
//            Выводит всех работников с именем Yana из БД
            for (Employee e: employees){
                System.out.println(e);
            }
            System.out.println("Done");
        }


    }
}
