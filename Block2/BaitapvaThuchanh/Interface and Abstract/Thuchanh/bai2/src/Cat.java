public class Cat extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Cat: meo meo";
    }
    @Override
    public String howToEat(){
        return "Mouth";
    }
}
