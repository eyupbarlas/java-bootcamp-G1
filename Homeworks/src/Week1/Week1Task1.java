// Task 3

package Week1;

public class Week1Task1 {
          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        
        double area = Math.PI * radius * radius;

        
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter (Circumference) of the circle: " + perimeter);
}
