public class Human {
    String name;
    int yearOfBirth;
    String town;

    String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return " Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году." + " Я работаю на должности " + jobTitle + "." + " Будем знакомы! ";
    }
}


