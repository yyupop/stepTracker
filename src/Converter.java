
public class Converter {
    int convertToKm(int steps) {

        return steps * 75 / 10000;

    }

    int convertStepsToKilocalories(int steps) {
        // Здесь аналогично
        int kilocalories = steps * 50 / 1000;
        return kilocalories;
    }
}
