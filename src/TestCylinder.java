public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0, "green", 10.0);
        //In thong tin
        System.out.println(cylinder.toString());
        //Thay doi chieu cao
        cylinder.setHeight(12.0);
        //In lai thong tin cylinder sau khi thay doi
        System.out.println(cylinder.toString());
    }
}
