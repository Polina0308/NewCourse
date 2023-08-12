package aop.Aspect;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("преступление и наказание")
    private String name;
    @Value("Ф.М.Достоевский")
    private String autor;
    @Value("1866")
    int yearOfPublication;


    public static void main(String[] args) {
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
