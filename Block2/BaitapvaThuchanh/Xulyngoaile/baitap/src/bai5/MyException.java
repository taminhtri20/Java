package bai5;

public class MyException extends Exception {
    public MyException(String str){
        super(str);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("GeeksGeeks");
        }catch (MyException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
        //Nem ngoai le cho doi tuong nguoi dung tu dinh nghia
    }
}
