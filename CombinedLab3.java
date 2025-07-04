   // --------------------- Vaccine Program -----------------------
abstract class Vaccine {
    int age;
    String nationality;
    boolean dose1 = false;
    boolean dose2 = false;

    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("First dose taken successfully.");
            System.out.println("Please pay Rs. 250.");
            dose1 = true;
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    void secondDose() {
        if (dose1) {
            System.out.println("Second dose taken successfully.");
            dose2 = true;
        } else {
            System.out.println("You must take the first dose before the second dose.");
        }
    }

    abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {
    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        if (dose1 && dose2) {
            System.out.println("Booster dose taken successfully.");
        } else {
            System.out.println("Complete first and second dose before taking booster dose.");
        }
    }
}

// --------------------- HillStations Program -----------------------
class HillStations {
    void location() {
        System.out.println("Generic hill station location.");
    }

    void famousFor() {
        System.out.println("Generic hill station is famous for its beauty.");
    }
}

class Manali extends HillStations {
    @Override
    void location() {
        System.out.println("Manali is in Himachal Pradesh.");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for snow sports and scenic beauty.");
    }
}

class Mussoorie extends HillStations {
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand.");
    }

    @Override
    void famousFor() {
        System.out.println("Mussoorie is famous for its colonial charm and nature.");
    }
}

class Gulmarg extends HillStations {
    @Override
    void location() {
        System.out.println("Gulmarg is in Jammu & Kashmir.");
    }

    @Override
    void famousFor() {
        System.out.println("Gulmarg is famous for skiing and snowfall.");
    }
}

// --------------------- Main Class -----------------------
public class CombinedLab3 {
    public static void main(String[] args) {
        // ----------- Vaccine Part -----------
        System.out.println("=== Vaccination Process ===");
        VaccinationSuccessful user1 = new VaccinationSuccessful(20, "Indian");

        user1.firstDose();
        user1.secondDose();
        user1.boosterDose();

        // ----------- HillStations Part -----------
        System.out.println("\n=== Hill Station Details (Parent Reference) ===");
        HillStations h1 = new Manali();
        HillStations h2 = new Mussoorie();
        HillStations h3 = new Gulmarg();

        h1.location(); h1.famousFor();
        h2.location(); h2.famousFor();
        h3.location(); h3.famousFor();

        System.out.println("\n=== Hill Station Details (Subclass Reference) ===");
        Manali m = new Manali();
        m.location(); m.famousFor();

        Mussoorie mu = new Mussoorie();
        mu.location(); mu.famousFor();

        Gulmarg g = new Gulmarg();
        g.location(); g.famousFor();
    }
}

