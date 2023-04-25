package bai1;

public class CheckTriangle {
    public void checkTriangle(int a,int b,int c) throws TriangleException {
        if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0){
            throw new TriangleException("Tam giac khong hop le");
        }else {
            System.out.println("Tam giac hop le");
        }
    }
}
