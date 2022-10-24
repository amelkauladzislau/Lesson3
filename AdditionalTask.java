import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class AdditionalTask {
    public static void Task() {


        System.out.println("ADDITIONAL TASK");

        String info = "1. Ввести имя\n2. Ввести фамилию\n3. Ввести год рождения\n4. Вывести информацию\n0. Выход";
        String firstName  = "не указано";
        String secondName= "не указана";
        String birthYear= "не указан";
        System.out.println(info);
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int var = parseInt(scanner.nextLine());
            if (var == 0) {
                break;
            } else {
        switch(var) {
            case (1):
                System.out.println("Введите имя");
                String tmpFirstName = scanner.nextLine();
                firstName = tmpFirstName;
                break;
            case (2):
                System.out.println("Введите фамилию");
                String tmpSecondName = scanner.nextLine();
                secondName = tmpSecondName;
                break;
            case (3):
                System.out.println("Введите год рождения");
                String tmpBirthYear = scanner.nextLine();
                birthYear = tmpBirthYear;
                break;
            case (4):
                System.out.println("Фамилия: " + secondName + " Имя: " + firstName + " Год рождения: " + birthYear );
                break;

        }
        }
        }
    }
}
