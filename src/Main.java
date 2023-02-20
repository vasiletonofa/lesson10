import interfaces.Animal;
import interfaces.Herbivore;
import run.Manager;
import run.Programator;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setNume("Ion");
        manager.setAge(29);
        System.out.println(manager.descrieFunctiaSa());
        manager.lucreaza();
        manager.run();

        System.out.println("Manager nume: " + manager.getNume());
        System.out.println("Manager age: "  + manager.getAge());

        System.out.println();

        Programator programator = new Programator();
        programator.setNume("Vasile");
        programator.setAge(35);
        System.out.println(programator.descrieFunctiaSa());
        programator.lucreaza();
        programator.run();

        System.out.println("Programator nume: " + programator.getNume());
        System.out.println("Programator age: "  + programator.getAge());



    }
}