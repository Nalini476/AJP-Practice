import java.util.Scanner;

// Abstract class
abstract class Vaccine {
    int age;
    String nationality;
    boolean isDose1Given;
    boolean isDose2Given;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
        this.isDose1Given = false;
        this.isDose2Given = false;
    }

    void giveDose1() {
        isDose1Given = true;
        System.out.println("Dose 1 given.");
    }

    void giveDose2() {
        isDose2Given = true;
        System.out.println("Dose 2 given.");
    }

    abstract void boosterDose(); // Abstract method
}

// Subclass
class BoosterVaccine extends Vaccine {
    BoosterVaccine(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    void boosterDose() {
        System.out.println("Booster dose given.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Clear the buffer

        System.out.print("Enter nationality: ");
        String nationality = sc.nextLine();

        BoosterVaccine person = new BoosterVaccine(age, nationality);
        person.giveDose1();
        person.giveDose2();
        person.boosterDose();

        System.out.println("\n--- Vaccine Record ---");
        System.out.println("Age: " + person.age);
        System.out.println("Nationality: " + person.nationality);
        System.out.println("Dose 1 status: " + (person.isDose1Given ? "Completed" : "Pending"));
        System.out.println("Dose 2 status: " + (person.isDose2Given ? "Completed" : "Pending"));

        sc.close();
    }
}


