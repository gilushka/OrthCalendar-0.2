package books;

import basic.Book;
import basic.Parameters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Psaltir extends Book {

    public Psaltir (LocalDate date, String sericeName) throws FileNotFoundException {
        DayOfWeek dayOfWeek = getDayOfWeek(date);

        File psaltir = new File(Parameters.DATA_FILES_PATH + "psaltir.data");

        FileReader fr = new FileReader(psaltir);
        Scanner scanner = new Scanner(fr);


    }

    public String getPsalomByNumber(int number) {
        return null;
    }
}
