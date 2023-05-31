public class People {
    public String name;
    public int age;
    public boolean gender;
    public double height;
    public double weight;

    public People(){}
    public People(String name,int age,boolean gender,double height,double weight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }
    @Override
    public String toString(){
        return "Name: "
                +getName()
                +", age: "
                +getAge()
                +", gender: "
                +isGender()
                +", height: "
                +getHeight()
                +" and weight: "
                +getWeight();
    }

}
