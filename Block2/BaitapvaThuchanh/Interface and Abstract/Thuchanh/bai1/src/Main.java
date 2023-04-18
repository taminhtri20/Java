public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal chicken = new Chicken();
        Edible edible = new Chicken();
        Edible edible1 = new Apple();
        Edible edible2 = new Orange();
        System.out.println(edible.howToEat());
        System.out.println(edible1.howToEat());
        System.out.println(edible2.howToEat());
    }
}