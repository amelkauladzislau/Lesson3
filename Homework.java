import java.util.Scanner;

public  class Homework {

    public static void firstTask() {
        System.out.println("FIRST TASK");

        String str = "";
        Scanner scanner = new Scanner(System.in);
        while (str.length() >= 0) {

            System.out.println("Please enter something");
            str = scanner.nextLine();
            System.out.println(str);
            if (str.equals("Exit")) {
                break;
            }
        }
    }

    public static void secondTask() {
        System.out.println("SECOND TASK");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        while (x<0) {
            System.out.println("Please enter number > 0 ");
            x = scanner.nextInt();
        }
            int sum = 0;
            for (int i = 0; i <= x; i++) {
                sum += i;
            }

        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);

    }
    public static void thirdTask() {
        System.out.println("\nTHIRD TASK");
        System.out.print("Please enter your score: ");
        int score = new Scanner(System.in).nextInt();

        while (score < 0 || score > 100) {
            System.out.println("Please enter number from 0 to 100 ");
            score = new Scanner(System.in).nextInt();
        }

        if (score >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
    }

    public static void taskFour() {
        System.out.println("TASK FOUR");
        System.out.println("Enter channel number from 1 to 3");
        String TW[] = new String[]{"Turn off","1","2","3"};
        int i = new Scanner(System.in).nextInt();
        while (true) {
            if (i == 0) {
                System.out.println(TW[i]);
                break;
            } else {
                System.out.println("Move to channel №" + TW[i]);
                i = new Scanner(System.in).nextInt();
            }
        }
    }

}


