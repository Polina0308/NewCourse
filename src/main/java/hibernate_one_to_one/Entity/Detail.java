package hibernate_one_to_one.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class Detail {
    @Id
    @Column(name = "details_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int details_id;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "email")
    private String email;
    @OneToOne(mappedBy = "empDetail",
    cascade =  CascadeType.REFRESH)
    private Employee employee;

    public Detail() {
    }

    public Detail(String city, String phone_number, String email) {
        this.city = city;
        this.phone_number = phone_number;
        this.email = email;
    }

    public int getDetails_id() {
        return details_id;
    }

    public void setDetails_id(int details_id) {
        this.details_id = details_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String  toString() {
        return "Detail{" +
                "details_id=" + details_id +
                ", city='" + city + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", email='" + email + '\'' +
                ", employee=" + employee +
                '}';
    }
}
