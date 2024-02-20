public class MonthData {
    int[] days= new int[30];
    int bestSeries(int goalByStepsPerDay) {
        int current =0;
        int finalSeries = 0;
        // Алгоритм описан корректно, все правильно
        // Но мне не очень понятно почему переменные так называются
        // Тут почему-то переменная, которая хранит текущую серию называется финальной
        // , а переменная, которая хранится финальную(итоговую) называется текущей
        for (int i = 0; i < days.length; i ++) {
            if (days[i] >= goalByStepsPerDay) {
                current++;
            } else {
                if (finalSeries< current) {
                    finalSeries = current;

                }
                current = 0;
            }
        }
        if (current > finalSeries)
            finalSeries = current;
        return finalSeries;
    }
    void saveSteps(int day, int steps) {
        days[day - 1] += steps;
    }
    int maxSteps() {
        int maxSteps = 0;
        for ( int i =0; i < days.length; i ++) {
            if (days[i] > maxSteps) {
                 maxSteps = days [i];
            }
        }
        return maxSteps;
    }
    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        return sumSteps;
    }
    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {

            System.out.println((i+1) + " день: " + days[i]);
        }

    }

}
