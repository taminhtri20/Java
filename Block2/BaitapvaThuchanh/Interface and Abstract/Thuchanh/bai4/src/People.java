public abstract class People {
    private String name;
    private int age;
    private boolean gender;
    public People(){}
    public People(String name,int age,boolean gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public abstract String eat();
    public abstract String sleep();
    public abstract String study();
}
