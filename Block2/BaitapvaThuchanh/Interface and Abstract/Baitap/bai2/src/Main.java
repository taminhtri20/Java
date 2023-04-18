public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("misa");
        Dog dog1 = new Dog("Tom");
        dog.greets(dog1);
        BigDog bigDog = new BigDog("Pull");
        BigDog bigDog1 = new BigDog("Big");
        bigDog1.greets(bigDog);
        bigDog1.greets(dog);
    }
}