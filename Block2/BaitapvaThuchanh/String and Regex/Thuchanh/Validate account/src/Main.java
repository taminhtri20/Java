public class Main {
    private  static  AccountExemple ae;
    public static final String[] validAccount =new String[] { "_avc12","_asd34","_asd56"};
    public static final String[] invalidAcount = new String[] {"Asdasd" , "aa*1312" , "da"};
    public static void main(String[] args) {
        ae = new AccountExemple();
        for (String acount : validAccount){
            boolean isvalid = ae.validate(acount);
            System.out.println("Account is: " + acount +" is valid: "+ isvalid);
        }
        for (String acount : invalidAcount){
            boolean isvalid = ae.validate(acount);
            System.out.println("Account is: " + acount +" is valid: "+ isvalid);
        }
    }
}