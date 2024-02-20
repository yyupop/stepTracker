import java.util.Scanner;
public class StepTracker {

    // Что-то здесь произошло с отступами
    // Все остальное в этом классе замечательно, умница!
    int goalByStepsPerDay = 10000;
     MonthData[] monthToData = new MonthData[12];
     Scanner scanner;

    public StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    public void changeStepGoal() {
        System.out.println("Введите новое значение цели шагов на день");
        int newGoal = scanner.nextInt();
        if (newGoal <= 0) {
            System.out.println("Цель должна быть больше нуля");
        } else {
            goalByStepsPerDay = newGoal;
            System.out.println("Цель успешно изменена");
        }
    }
    public void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца от 1 до 12:");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца.");
            return;
        }
        System.out.println("Введите номер дня от 1 до 30:");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Некорректный номер дня.");
            return;
        }
        System.out.print("Введите количество шагов: ");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Количество шагов должно быть положительным числом.");
            return;
        }
        MonthData month = monthToData[monthNumber - 1];
        month.saveSteps(day, steps);
        System.out.println("Данные сохранены");
    }
    void printStatistic() {
        System.out.println("Введите номер месяца (от 1 до 12):");
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Некорректный номер месяца.");
            return;
        }

        MonthData month  = monthToData[monthNumber - 1];


        System.out.println("Количество пройденных шагов по дням:");
        month.printDaysAndStepsFromMonth();

        int sumSteps = month.sumStepsFromMonth();
        System.out.println("Общее количество шагов за месяц: " + sumSteps);


        int maxSteps = month.maxSteps();
        System.out.println("Максимальное пройденное количество шагов в месяце: " + maxSteps);

        double averageSteps =  sumSteps / month.days.length;
        System.out.println("Среднее количество шагов: " + averageSteps);

        Converter converter = new Converter();
        int distance = converter.convertToKm(sumSteps);
        System.out.println("Пройденная дистанция (в км): " + distance);

        int kilocalories = converter.convertStepsToKilocalories(sumSteps);
        System.out.println("Количество сожжённых килокалорий: " + kilocalories);

        int bestSeries = month.bestSeries(goalByStepsPerDay);
        System.out.println("Лучшая серия: " + bestSeries);
    }

}
