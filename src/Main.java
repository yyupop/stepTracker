import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            // Название переменной не очень подходящее
            // Стараемся избавиться от однобуквенных переменных
            // Здесь подходит command
            int command = scanner.nextInt();
            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2){
                stepTracker.changeStepGoal();
            } else if (command == 3){
                stepTracker.printStatistic();
            } else if (command == 4) {
                break;
            }
        }
    }
    static void printMenu() {
        System.out.println("Меню:");
        System.out.println("1. Ввести количество шагов за день");
        System.out.println("2. Изменить цель по количеству шагов в день");
        System.out.println("3. Напечатать статистику за день");
        System.out.println("4. Выйти из приложения");
    }
}
