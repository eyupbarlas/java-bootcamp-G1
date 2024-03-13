package Week1;

public class Week1Task2 {
  public static void main(String[] args) {

        System.out.print("Enter first number: ");
        Scanner first =  new Scanner(System.in);
       int firstNumber = first.nextInt();

        System.out.print("Enter second number: ");
        Scanner second =new Scanner(System.in);
       int secondNumber = second.nextInt();

        System.out.print("Enter third number: ");
        Scanner third = new Scanner(System.in);
        int thirdNumber = third.nextInt();

        System.out.print("Enter fourth number: ");
        Scanner fourth = new Scanner(System.in);
        int fourthNumber = fourth.nextInt();

        System.out.print("Enter fifth number: ");
        Scanner fifth = new Scanner(System.in);
        int fifthNumber = fifth.nextInt();


        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;

        double average = (double) sum / 5;

        System.out.println("Average: " + average);
    }
}

}
