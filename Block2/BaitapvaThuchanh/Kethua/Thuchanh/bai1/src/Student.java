public class Student extends People{
    public String className;
    public Student(){
        this.className="D101_C1K14";

    }
    public Student(String name,boolean gender,int age,String className){
        super(name, gender, age);
        this.className=className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String study(){
        return getName()+ " dang hoc";
    }
    @Override
    public String toString(){
        return "A student with class name: "
                +getClassName()
                +", which is a subclass of "
                +super.toString();
    }
}

