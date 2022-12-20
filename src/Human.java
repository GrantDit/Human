public class Human {
    String name;
    int yearOfBirth;
    String town;

    String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        if (this.name == null || this.name.isBlank()) {
            this.name = "Информация не указана";
        }
        this.yearOfBirth = yearOfBirth;
        if (this.yearOfBirth <= 0) {
            throw new IllegalArgumentException("Информация указана не верно");
        }
        this.town = town;
        if (this.town == null|| this.town.isBlank()) {
            this.town = " Информация не указана";
        }
        this.jobTitle = jobTitle;
        if (this.jobTitle == null || this.jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        }
    }

    public String toString() {
        return " Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году." + " Я работаю на должности " + jobTitle + "." + " Будем знакомы! ";
    }
}




