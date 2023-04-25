package bai2;

public class GFG {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(getLength(s));
        }catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException caught");
        }
    }
    public static int getLength(String s){
        if (s==null){
            throw new IllegalArgumentException("The agrument can not be null");
        }
        return s.length();
    }
    //Getlength de lay so ky tu trong chuoi
    // in ra so ky tu cua chuoi tru null
    // khi ky tu la null
}
