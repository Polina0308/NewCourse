package hibernate_one_to_one.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Yana", "Davydenko", "IT", 900);
//            Detail detail = new Detail("Armavir", "919191982", "yana@mail.ru");
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 2);
            detail.getEmployee().setEmpDetail(null); // разрыв связей между таблицами
            session.remove(detail);


//            session.persist(detail);
            session.getTransaction().commit();
            System.out.println("Done");
        }
    }
}
