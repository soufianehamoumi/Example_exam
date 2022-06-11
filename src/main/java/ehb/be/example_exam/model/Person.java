package ehb.be.example_exam.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Person {

    @Id
    private String veilingpersoonnummer;

    @NotBlank
    private String naam;

    @UniqueElements
    @Email
    private String email;

    public Person() {
    }

    public Person(String veilingpersoonnummer, String naam, String email) {
        this.veilingpersoonnummer = veilingpersoonnummer;
        this.naam = naam;
        this.email = email;
    }

    public String getVeilingpersoonnummer() {
        return veilingpersoonnummer;
    }

    public void setVeilingpersoonnummer(String veilingpersoonnummer) {
        this.veilingpersoonnummer = veilingpersoonnummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
