package n1exercici2;

public class OfficeWorker extends Worker {
    static int gas = 30;

    public OfficeWorker(String name, String surname, int hourlyWage) {
        super(name, surname, hourlyWage);
    }

    @Override
    public int calculateSalary(int hours) {
        return hours * getHourlyWage() + OfficeWorker.gas;
    }

    @Deprecated
    public int calculateGas(int kms) {
        return gas * kms;
    }
}
