
    // Base class
class Prabhas {
    void audienceCraze() {
        System.out.println("Prabhas has massive pan-India audience craze.");
    }

    void boxOfficeCollections() {
        System.out.println("Prabhas's movies collect huge box office numbers.");
    }
}

// Subclass
class PawanKalyan extends Prabhas {
    void politicalCraze() {
        System.out.println("Pawan Kalyan has strong political fan following through Jana Sena.");
    }

    void dialogueImpact() {
        System.out.println("Pawan Kalyan's dialogues create a mass impact in theatres.");
    }
}

// Main class to run the program
public class TollywoodInheritance {
    public static void main(String[] args) {
        // Creating object of subclass
        PawanKalyan pawan = new PawanKalyan();

        // Inherited traits from Prabhas
        pawan.audienceCraze();
        pawan.boxOfficeCollections();

        // Unique traits of Pawan Kalyan
        pawan.politicalCraze();
        pawan.dialogueImpact();
    }
}

