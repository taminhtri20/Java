public class Teacher extends People{
    public String level;
    public String exp;
    public String subject;
    public Teacher(){
        super();
    }
    public Teacher(String name,int age,boolean gender,double height,double weight,String level,String exp,String subject){
        super(name, age, gender, height, weight);
        this.level=level;
        this.exp=exp;
        this.subject=subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSubject() {
        return subject;
    }

    public String getLevel() {
        return level;
    }
    @Override
    public String toString(){
        return super.toString()
                +", level: "
                +getLevel()
                +", exp: "
                +getExp()
                +" and subject: "
                +getSubject();
    }
}
