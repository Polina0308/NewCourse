package hibernate_one_to_one.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()){
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
//            Выводит детали сотрудника
//            Employee employee = new Employee("Oleg", "Sidorov", "IT", 700);
//            Detail detail = new Detail("Kiev", "2893019238", "oleg@mail.ru");
//            employee.setEmpDetail(detail);
//            session.persist(employee);
//            Создали нового работника

            Employee employee = session.get(Employee.class, 2);
            session.remove(employee);
            session.getTransaction().commit();
            System.out.println("Done");
        }
    }
}
