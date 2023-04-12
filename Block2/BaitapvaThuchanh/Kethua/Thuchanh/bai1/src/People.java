public class People {
    public String name;
    public boolean gender;
    public int age;
    public People(){
        this.name="Ten mac dinh";
        this.gender = false;
        this.age=0;
    }
    public People(String name,boolean gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public boolean isGender() {
        if (gender=true){
            System.out.println("Nam");
            return true;
        }else {
            System.out.println("Nu");
            return false;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public String eat(){
        return getName()
                +" dang an";
    }
    public String sleep(){
        return getName()
                +" dang ngu";
    }
    @Override
    public String toString(){
        return "A People with name:"
                +getName()
                +", age: "
                +getAge()
                +" and gender: "
                +isGender();
    }
}
