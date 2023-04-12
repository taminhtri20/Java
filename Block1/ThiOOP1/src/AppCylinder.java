public class AppCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3,5,5,"blue",8);
        cylinder.toString();
        System.out.println("dien tich la: "+cylinder.getArea());
    }
}
