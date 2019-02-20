import basic.Parameters;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayCalculate {
    LocalDate date;
    LocalDate previousPasha;
    LocalDate nextPasha;
    DayOfWeek dayOfWeek;
//    LocalDate pasha = LocalDate.parse("1900-01-01");

    /**
     * Конструктор для класса
     * @param date дата для которой происходит расчет службы
     * @throws Exception НЕ ЗНАЮ ЧТО ТУТ МОЖЕТ БЫТЬ!!!
     */
    DayCalculate(LocalDate date) throws Exception {
        this.date = date;
        getPasha(date);
        dayOfWeek = getDayOfWeek(date);

        System.out.println(previousPasha);
        System.out.println(nextPasha);
        System.out.println(date + " " + dayOfWeek);
    }

    /**
     * Расчитываем даты предшествовавшей и следующей Пасхи. Метод используется при  инициализации класса для установки
     * значений переменным класса
     *
     * @param date - заданная на входе дата
     * @throws Exception точно есть ошибка ввода/вывода при закрытии файла, возможно есть что-то ещё
     */
    private void getPasha(LocalDate date) throws Exception {
        File pashalia = new File(Parameters.DATA_FILES_PATH + "pashalia.data");

        FileReader fr = new FileReader(pashalia);
        Scanner scanner = new Scanner(fr);
        LocalDate element;

        while (scanner.hasNextLine()) {
            element = LocalDate.parse(scanner.nextLine());

            if (date.isBefore(element)) {
                nextPasha = element;
                break;
            }
            previousPasha = element;
        }

        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }
    }

    /**
     * Полечаем день недели на нужную дату
     *
     * @param date дата для которой нужно получить день недели
     * @return день недели
     */
    public DayOfWeek getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek();
    }

    public static LocalDate getDay(LocalDate pasha, int interval, boolean old) throws Exception {
        if (old == true) {
            return pasha.plusDays(interval);
        } else {
            return pasha.minusDays(interval);
        }
    }
}
