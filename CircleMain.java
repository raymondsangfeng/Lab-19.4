import java.util.*;

public class CircleMain {
    public static void main(String[] args) {
        Date date = new Date();
        String dir = System.getProperty("user.dir");
        System.out.println("\nuser.dir: " + dir);
        System.out.printf("%tc\n\n", date);
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = in.nextDouble();

        Circle cr = new Circle();
        cr.setRadius(radius);

        System.out.println("The circle's area is " + cr.getArea());
        System.out.println("The circle's diameter is " + cr.getDiameter());
        System.out.println("The circle's circumference is " + cr.getCircumference());

        System.exit(0);
    }
}
