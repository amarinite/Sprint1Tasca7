package n1exercici2;

public class RemoteWorker extends Worker {
    private final int INTERNET = 150;

    public RemoteWorker(String name, String surname, int hourlyWage) {
        super(name, surname, hourlyWage);
    }

    public int calculateInternet(int kms) {
        return INTERNET * kms;
    }

    @Override
    public int calculateSalary(int hours) {
        return hours * getHourlyWage() + INTERNET;
    }
}
