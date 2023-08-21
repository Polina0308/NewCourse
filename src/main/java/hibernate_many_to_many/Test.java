package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try(
                SessionFactory factory = new Configuration()
                        .configure()
                        .addAnnotatedClass(Child.class)
                        .addAnnotatedClass(Section.class)
                        .buildSessionFactory();

                )
        {
            Session session = factory.getCurrentSession();

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Polina", 18);
//            Child child2 = new Child("Yana", 18);
//            Child child3 = new Child("Zaur", 18);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//********************************************************
//            Section section1 = new Section("Voleyball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//
//            Child child1 = new Child("Igor", 7);
//
//            child1.addChildToSection(section1);
//            child1.addChildToSection(section2);
//            child1.addChildToSection(section3);

            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            System.out.println(section);
            System.out.println(section.getChildren());




            session.getTransaction().commit();
        }
    }
}
