public class Human {
    String name;
    String city;
    int dateOfBirth;
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
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
        if (jobTitle == null) {
            System.out.println(" Информация не указана");
        } else {
            this.jobTitle = jobTitle;
        }

    }

    public String toString() {
        return "Привет! меня зовут " + name + " я из города - " + city + " я родился в " + dateOfBirth + " году. Я работаю на должности"
                + jobTitle + ". Будем знакомы.";
    }


}
