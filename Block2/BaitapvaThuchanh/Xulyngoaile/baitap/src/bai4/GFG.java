package bai4;

public class GFG {
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);

        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
        //no se in ra ky tu cua str tu 0 den 5

        // tong quat condition ? value_if_true : value_if_false
    }

}
