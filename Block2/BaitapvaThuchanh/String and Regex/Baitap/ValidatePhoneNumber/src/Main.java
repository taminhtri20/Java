public class Main {
    private static PhoneNumberExemple pe;
    public static final String[] validNumber = new String[] {"84-0978489648"};
    public static final String[] invalidNumber = new String[] {"a8-22222222","84-22b22222","84-9978489648"};
    public static void main(String[] args) {
        pe = new PhoneNumberExemple();
        for (String number : validNumber){
            boolean isValid = pe.validate(number);
            System.out.println("Number: "+number+" is valid: "+isValid);
        }
        for (String number : invalidNumber){
            boolean isValid = pe.validate(number);
            System.out.println("Number: "+number+" is valid "+isValid);
        }
    }
}