import java.time.LocalDate;
import java.util.OptionalInt;

public class Human {
    String name;
    private String city;
    private int dateOfBirth;
    String jobTitle;

    Human(String name, String city, int dateOfBirth, String jobTitle) {
        if (name == null) {
            System.out.println(" Информация не указана");
        } else {
            this.name = name;
        }
        if (city == null) {
            System.out.println(" Информация не указана");
        } else {
            this.city = city;
        }
        if (dateOfBirth >= 0) {
            this.dateOfBirth = LocalDate.now().getYear() - dateOfBirth;
        } else {
            this.dateOfBirth = Math.abs(LocalDate.now().getYear() - dateOfBirth);
        }
        if (jobTitle == null) {
            System.out.println(" Информация не указана");
        } else {
            this.jobTitle = jobTitle;
        }

    }

    public String toString() {
        return "Привет! меня зовут " + name + " я из города - " + getCity() + " я родился в " + getDateOfBirth() + " году. Я работаю на должности"
                + jobTitle + ". Будем знакомы.";
    }

    public String getCity() {
        if (city == null || city.isEmpty() || city.isBlank()) {
            this.city = " Информация не указана";
        } else {
            return this.city = city;
        }
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDateOfBirth() {
        if (dateOfBirth <= 0) {
            this.dateOfBirth = 0;
        } else {
            return this.dateOfBirth = dateOfBirth;
        }
        return dateOfBirth;
    }

    public void setDateOfBirth() {
        this.dateOfBirth = dateOfBirth;
    }

}
