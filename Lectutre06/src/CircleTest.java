import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Scanner scan = new Scanner(System.in);
        while (true){
          try {
              System.out.print("Enter radius :");
              double radius = scan.nextDouble();
              obj.setRadius(radius);
          }
          catch (Exception e){
              System.out.println("Error " + e.getMessage());
              System.out.println("Retry!!!");
              if(e instanceof InputMismatchException){
                  scan.next();
              }
              continue;
          }
          break;
        }

        System.out.println("Radius :" + obj.getRadius());
        System.out.println("Area :" + obj.getArea());
        System.out.println("Circumference :" + obj.getCircumference());
    }
}
