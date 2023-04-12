public class Employee extends People{
    public String enterprise;
    public Employee(){
        this.enterprise="Codegym";
    }
    public Employee(String name,boolean gender,int age,String enterprise){
        super(name, gender, age);
        this.enterprise=enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    public String work(){
        return getName()+" dang lam viec";
    }
    @Override
    public String toString(){
        return "A Employee work at enterprise:"
                +getEnterprise()
                +", which is subclass of "
                +super.toString();
    }
}
