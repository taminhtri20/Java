public class Cat extends Animal{
    public double age;
    public Cat(){
        age=1.0;
    }
    public Cat(double weight,double height,double age){
        super(weight, height);
        this.age=age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getAge() {
        return age;
    }
    public String sound(){
        return "Meo meo";
    }
    public String eat(){
        return "fish";
    }
    @Override
    public String toString(){
        return "A Cat with age: "
                +getAge()
                +", which is a subclass of "
                +super.toString();
    }
}
