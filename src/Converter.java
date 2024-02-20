// Лишний неиспользованный импорт, надо удалить
public class Converter {
    int convertToKm(int steps) {
        // Если подсчеты реализованы в одну строку,
        // можно не создавать дополнительную переменную, а сразу возвращать
        // То есть сразу return steps * 75 / 10000;
        return steps * 75 / 10000;

    }

    int convertStepsToKilocalories(int steps) {
        // Здесь аналогично
        int kilocalories = steps * 50 / 1000;
        return kilocalories;
    }
}
