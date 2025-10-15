public class Main {
    public static void main (String[] ards){
        System.out.println("Task 1");
        System.out.println();
        // Создаем переменные для хранения ФИО
        String frisName = "Ivanov";
        String lastName = "Ivan";
        String middleName = "Ivanovich";

        // полное ФИО
        String fullName = frisName + " " + lastName + " " + middleName;

        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();

        System.out.println("Task 2");
        System.out.println();

        // пишем все заглавными
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println();

        System.out.println("Task 3");
        System.out.println();

        // исходники
        String frisName1 = "Иванов";
        String lastName1 = "Семён";
        String middleName1 = "Семёнович";

        // полное ФИО
        String fullName1 = frisName1 + " " + lastName1 + " " + middleName1;

        // заменяем ё на е
        String fullName2 = fullName1.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);

    }
}
