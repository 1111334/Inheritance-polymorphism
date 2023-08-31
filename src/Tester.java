public class Tester {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal");
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Bessie");

        System.out.println("Generic Animal sound:");
        genericAnimal.animalSound();

        System.out.println("\nLion sound:");
        lion.animalSound();

        System.out.println("\nCow sound:");
        cow.animalSound();
    }
}

