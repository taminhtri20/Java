package bai3;

public class CFG {
    public static void main (String[] args)
    {
        String ptr = null;

//        if (ptr.equals("gfg"))
//            System.out.print("Same");
//        else
//            System.out.print("Not Same");
        //dung chuong trinh vi string k tra ve null

//        try{
//            if (ptr.equals("gfg"))
//            System.out.print("Same");
//        else
//            System.out.print("Not Same");
//        }catch (NullPointerException e){
//            System.out.print("NullPointerException Caught");
//        }
        //NullPointerException Caught vi no la truong hop ngoai le
        //NullPointerException xay ra khi null

        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
// vi no so sanh chuoi voi null nen se in ra not same
    }

}
