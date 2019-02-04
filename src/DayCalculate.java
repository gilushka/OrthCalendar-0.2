import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class DayCalculate {
    public static LocalDate getPasha(LocalDate date, boolean isPreviousPasha) throws Exception {
        File pashalia = new File(Parameters.DATA_FILES_PATH + "pashalia.data");
        LocalDate pasha = LocalDate.parse("1900-01-01");

        FileReader fr = new FileReader(pashalia);
        Scanner scanner = new Scanner(fr);
        LocalDate element;

        while (scanner.hasNextLine()) {
            element = LocalDate.parse(scanner.nextLine());

            if (date.isBefore(element) && isPreviousPasha == false) {
                break;
            }

            pasha = element;

            if (date.isBefore(element) && isPreviousPasha == true) {
                break;
            }
        }

        try {
            fr.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }

        return (pasha);
    }

    public static LocalDate getDay(LocalDate pasha, int interval, boolean old) throws Exception {
        if (old == true) {
            return pasha.plusDays(interval);
        }
        else {
            return pasha.minusDays(interval);
        }
    }
}
