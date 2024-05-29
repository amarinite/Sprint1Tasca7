package n1exercici2;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker normalWorker1 = new Worker("Jana", "Marin", 70);
        RemoteWorker remoteWorker1 = new RemoteWorker("Naruto", "Shippuden", 70);
        OfficeWorker officeWorker1 = new OfficeWorker("Xena", "Warrior Princess", 70);

        System.out.println(normalWorker1.calculateSalary(40));
        System.out.println(remoteWorker1.calculateSalary(40));
        System.out.println(officeWorker1.calculateSalary(40));

        System.out.println("Calculating gas...");
        System.out.println(officeWorker1.calculateGas(40));

    }
}