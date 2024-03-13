package Week1;

public class Week1Task1 {
      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: " + celsius + "C");
    }
}

