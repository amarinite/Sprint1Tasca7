package n1exercici2;

public class Worker {
    private String name;
    private String surname;
    private int hourlyWage;

    public Worker(String name, String surname, int hourlyWage) {
        this.name = name;
        this.surname = surname;
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage() {
        return this.hourlyWage;
    }

    public int calculateSalary(int hours) {
        return hours * hourlyWage;
    }
}
