public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String midleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + midleName;
        System.out.println("ФИО сотрудника " + fullName);
        System.out.println();
        //Задание 2
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName);
        System.out.println();
        //Задание 3
        fullName = "Семёнов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника для заполнения отчета " + fullName);
    }
}