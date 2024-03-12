package Week1;

// Task 2 

public class Week1Task1 {
          Scanner first = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int firstNumber = first.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Enter Second Number: ");
        int secondNumber = second.nextInt();


        Scanner third = new Scanner(System.in);
        System.out.println("Enter Third Number: ");
        int thirdNumber = third.nextInt();


        Scanner forth = new Scanner(System.in);
        System.out.println("Enter forth Number: ");
        int forthNumber = forth.nextInt();


        Scanner fifth = new Scanner(System.in);
        System.out.println("Enter Fifth Number: ");
        int fifthNumber = fifth.nextInt();


        System.out.println("Avarage is: " + (firstNumber + secondNumber + thirdNumber + forthNumber  + fifthNumber) / 5 );
    }
}

