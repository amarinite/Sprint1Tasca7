package n1exercici1;

public class RemoteWorker extends  Worker{
    private final int INTERNET = 150;

    public RemoteWorker(String name, String surname, int hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public int calculateSalary(int hours) {
        return hours * getHourlyWage() + INTERNET;
    }
}
