import java.util.Scanner;

public class AdditionalAdditionalTask {
    static Scanner scanner = new Scanner(System.in);

    public static void conditionalStatements1() {
        int sc = scanner.nextInt();
        if (sc > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }
    }

    public static void conditionalStatements2() {
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        if ( first > second) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Второе число меньше первого");
        }
    }

    public static void conditionalStatements3() {
        System.out.println("Введите первую сторону треугольника");
        int first = scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника");
        int second = scanner.nextInt();
        System.out.println("Введите третью сторону треугольника");
        int third = scanner.nextInt();
        if ( first == second && second == third) {
            System.out.println("Треугольник равносторонний");
        } else if ((first == second || first== third || second== third)) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник разносторонний");
        }
    }

    public static void conditionalStatements4() {
        int positive = 0,negative = 0;
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        if ( first > 0 ) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        if ( second > 0 ) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Введите третье число");
        int third = scanner.nextInt();
        if ( third > 0 ) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Введите четвертое число");
        int four = scanner.nextInt();
        if ( four > 0 ) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Отрицательных: " + negative + ", Положительных: " + positive);
    }

    public static void conditionalStatements5() {
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите третье число");
        int third = scanner.nextInt();
        if ( first > second && first > third) {
            System.out.println("Наибольшее число: " + first);
        } else if (second > first && second > third) {
            System.out.println("Наибольшее число: " + second);
        } else {
            System.out.println("Наибольшее число: " + third);
        }
    }

    public static void conditionalStatements6() {
        int max,min,result;
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите третье число");
        int third = scanner.nextInt();

        if ( first > second && first > third) {
            System.out.println("Наибольшее число: " + first);
            max = first;
            min = Math.min(second, third);
        } else if (second > first && second > third) {
            System.out.println("Наибольшее число: " + second);
            max = second;
            min = Math.min(first, third);
        } else {
            max = third;
            System.out.println("Наибольшее число: " + third);
            min = Math.min(second, first);
        }
        result = min + max;
        System.out.println(result);

    }

    public static void conditionalStatements7() {
        System.out.println("Введите число");
        int first = scanner.nextInt();
        if (first % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void conditionalStatements8() {
        int price1 = 5, price2 = 4, price3 = 3;
        int payment;
        System.out.println("1. Пиво стоит: " + price1 + " рублей\n" +
                "2. Чипсы стоят: " + price2 + " рублей\n" +
                "3. Сигареты стоят: " + price3 + " рублей");
        System.out.println("Выбирайте 1,2 или 3");
        int var = scanner.nextInt();

        switch (var) {

            case (1):
                System.out.println("Введите количевство рублей");
                payment = scanner.nextInt();
                if (payment == price1) {
                    System.out.println("Спасибо за покупку");
                } else if (payment > price1) {
                    System.out.println("Ваша сдача: " + (payment - price1));
                } else {
                    System.out.println("Денег не хватает");
                }
            case (2):
                System.out.println("Введите количевство рублей");
                payment = scanner.nextInt();
                if (payment == price2) {
                    System.out.println("Спасибо за покупку");
                } else if (payment > price2) {
                    System.out.println("Ваша сдача: " + (payment - price2));
                } else {
                    System.out.println("Денег не хватает");
                }
            case (3):
                System.out.println("Введите количевство рублей");
                payment = scanner.nextInt();
                if (payment == price3) {
                    System.out.println("Спасибо за покупку");
                } else if (payment > price3) {
                    System.out.println("Ваша сдача: " + (payment - price3));
                } else {
                    System.out.println("Денег не хватает");
                }

        }
    }

    public static void loops1() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i*4);
        }
    }

    public static void loops2() {
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void loops3() {
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public static void loops4() {
        long number = scanner.nextLong();
        long result = 1;
        for (long i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

    public static void loops5() {
        String post = scanner.nextLine();
        for (int i = 0; i < post.length(); i++) {
            System.out.println(post.charAt(i));
        }
    }

    public static void arrays1() {
        int pos=0,neg=0;
        int[] array = {1,2,-3,4,-5,6,-7,7,8};
        for (int j : array) {
            if (j < 0) {
                neg++;
            } else {
                pos++;
            }
        }
        System.out.println("Положительных чисел: " + pos + " Отрицательных чисел: " + neg );
    }

    public static void arrays2() {
        int result = 0;
        int[] array = {1, 2, -3, 4, -5, 6, -7, 7, 8};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result = result + array[i];
            }
            System.out.println(result);
        }

    }

    public static void arrays3() {
        int result = 0;
        int[] array = {1, 2, -3, 4, -5, 6, -7, 7, 8};
        for (int j : array) {
            if (j % 2 == 0) {
                result = result + j;
            }
            System.out.println(result);
        }

    }


}



