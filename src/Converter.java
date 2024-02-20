import java.util.Scanner;
public class Converter {
    int convertToKm(int steps) {
        int distance = steps * 75 / 10000;
        return distance;
    }

    int convertStepsToKilocalories(int steps) {
        int kilocalories = steps * 50 / 1000;
        return kilocalories;
    }
}
