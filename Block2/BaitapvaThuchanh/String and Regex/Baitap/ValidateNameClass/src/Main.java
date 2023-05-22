public class Main {
    private static ClassNameExemple ce;
    public static final String[] validName = new String[] {"C0223G","A0323K"};
    public static final String[] invalidName = new String[] {"M0318G","P0323A"};
    public static void main(String[] args) {
        ce = new ClassNameExemple();
        for (String name : validName){
            boolean isValid = ce.validate(name);
            System.out.println("Class name: "+name+" is valid: "+isValid);
        }
        for (String name : invalidName){
            boolean isValid = ce.validate(name);
            System.out.println("Class name: "+name+" is valid: "+isValid);
        }
    }
}