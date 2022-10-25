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
        if (first > second) {
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
        if (first == second && second == third) {
            System.out.println("Треугольник равносторонний");
        } else if ((first == second || first == third || second == third)) {
            System.out.println("Треугольник равнобедренный");
        } else {
            System.out.println("Треугольник разносторонний");
        }
    }

    public static void conditionalStatements4() {
        int positive = 0, negative = 0;
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        if (first > 0) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        if (second > 0) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Введите третье число");
        int third = scanner.nextInt();
        if (third > 0) {
            positive++;
        } else {
            negative++;
        }
        System.out.println("Введите четвертое число");
        int four = scanner.nextInt();
        if (four > 0) {
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
        if (first > second && first > third) {
            System.out.println("Наибольшее число: " + first);
        } else if (second > first && second > third) {
            System.out.println("Наибольшее число: " + second);
        } else {
            System.out.println("Наибольшее число: " + third);
        }
    }

    public static void conditionalStatements6() {
        int max, min, result;
        System.out.println("Введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        System.out.println("Введите третье число");
        int third = scanner.nextInt();

        if (first > second && first > third) {
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
            System.out.println(i * 4);
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
        int pos = 0, neg = 0;
        int[] array = {1, 2, -3, 4, -5, 6, -7, 7, 8};
        for (int j : array) {
            if (j < 0) {
                neg++;
            } else {
                pos++;
            }
        }
        System.out.println("Положительных чисел: " + pos + " Отрицательных чисел: " + neg);
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
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result = result + array[i];
            }
            System.out.println(result);
        }
    }

    public static void arrays4() {

        int[] array = {1, 2, -3, 4, -5, 6, -7, 7, 8};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void arrays5() {
        //Дан массив с целыми числами. Вывести в консоль наиболее часто встречающееся. Если
        // таких несколько, то вывести наибольшее из них, если повторяющихся нет, в
        // ывести соответствующее сообщение.

        int[] a = {1, 2, -3, 234, 6, 4, 3, 7, 8};

        int n = 0;
        int counter = 0;
        int cmax = 0;


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (i == j) {

                } else if (a[i] == a[j]) {
                    counter++;
                }
            }

            if (counter > cmax) {
                cmax = counter;
                if (a[i] > n ) {
                    n = a[i];
                }
            }
        }

        if (cmax == 0) {
            System.out.println("Совпадений нет");
        }  else {
            System.out.println("Нужное число: " + n);
        }
    }

    public static void arrays6() {
        //6. Дан двумерный массив 10х10 с целыми числами.
        // Вывести в консоль все числа по диагонали от [0][0] до [10][10]
        int[][] array = new int[10][10];
//fill massive

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

// print massive

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == 9) {
                    System.out.println(array[i][j] + "");
                } else {
                    System.out.print(array[i][j] + " ");
                }

            }

        }

// task
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 6;
                    System.out.println(array[i][j]);
                }
            }

        }
// print massive

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == 9) {
                    System.out.println(array[i][j] + "");
                } else {
                    System.out.print(array[i][j] + " ");
                }

            }
        }
    }

            public static void arrays7() {
                //Дан двумерный массив 10х10 с целыми числами.
                // Вывести в консоль все числа по диагонали от [0][10] до [10][0]

                int[][] arrays = new int[10][10];

//fill massive

                for (int i = 0; i < arrays.length; i++) {
                    for (int j = 0; j < arrays[i].length; j++) {
                        if ((i + j) % 2 == 0) {
                            arrays[i][j] = 1;
                        } else {
                            arrays[i][j] = 0;
                        }
                    }
                }

// print massive

                for (int[] array : arrays) {
                    for (int j = 0; j < arrays.length; j++) {
                        if (j == 9) {
                            System.out.println(array[j] + "");
                        } else {
                            System.out.print(array[j] + " ");
                        }

                    }

                }

// task
                for (int i = 0; i < arrays.length; i++) {
                    for (int j = arrays[i].length - 1; j >= 0; j--) {
                        if (i + j == 9) {
                            arrays[i][j] = 6;
                            System.out.println(arrays[i][j]);
                        }
                    }

                }
// print massive

                for (int i = 0; i < arrays.length; i++) {
                    for (int j = 0; j < arrays.length; j++) {
                        if (j == 9) {
                            System.out.println(arrays[i][j] + "");
                        } else {
                            System.out.print(arrays[i][j] + " ");
                        }

                    }

                }


            }
    public static void arrays8() {
        // Дан двумерный массив 5х5 с целыми числами. Посчитать суммы чисел в каждом столбце
        // и вывести наибольшую из них
        
        int[][] array = new int[5][5];
        int max = 0;

//fill massive
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = 1;
                } else if ((i + j) % 3 == 0) {
                    array[i][j] = 3;
                } else {
                    array[i][j] = 0;
                }
            }
        }
//task 
        
        for (int i = 0; i < array.length; i++) {
            int tmp = 0;
            for (int j = 0; j < array[i].length; j++) {
                tmp = tmp + array[i][j];
                max = Math.max(max,tmp);
            }
        }
        System.out.println(max);

    }
}






