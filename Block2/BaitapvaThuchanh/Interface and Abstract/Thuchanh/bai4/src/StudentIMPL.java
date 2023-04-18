public class StudentIMPL extends  People implements Student{
    public StudentIMPL(String name,int age,boolean gender){
        super(name, age, gender);
    }
    @Override
    public String eat(){
        return "eat fruit";
    }
    @Override
    public String sleep(){
        return "sleep at 10h";
    }
    @Override
    public String study(){
        return "study at 8h";
    }
    @Override
    public void registerCourse(String course){

    }
    @Override
    public void attendClass(){

    }
}
