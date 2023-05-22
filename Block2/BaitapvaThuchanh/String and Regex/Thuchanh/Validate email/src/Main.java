public class Main {
    private static EmailExample ee ;
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String[] args) {
        ee = new EmailExample();
        for (String email : validEmail) {
            boolean isValid = ee.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
        for (String email : invalidEmail){
            boolean isValid = ee.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isValid);
        }
    }
}