public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(animal.makeSound());
        Edible edible = new Cat();
        System.out.println(edible.howToEat());
    }
}