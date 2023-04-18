public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("woof");
    }
    @Override
    public void greets(Dog anotherDog){
        System.out.println("Another dog: woooof");
    }
    public void greets(BigDog anotherBigDog){
        System.out.println("Bigdog: wooooooof");
    }
}
