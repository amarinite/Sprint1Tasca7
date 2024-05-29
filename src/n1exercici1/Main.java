package n1exercici1;

public class Main {
    public static void main(String[] args) {
        Worker normalWorker1 = new Worker("Jana", "Marin", 70);
        RemoteWorker remoteWorker1 = new RemoteWorker("Naruto", "Shippuden", 70);
        OfficeWorker officeWorker1 = new OfficeWorker("Xena", "Warrior Princess", 70);

        System.out.println(normalWorker1.calculateSalary(40));
        System.out.println(remoteWorker1.calculateSalary(40));
        System.out.println(officeWorker1.calculateSalary(40));

    }
}