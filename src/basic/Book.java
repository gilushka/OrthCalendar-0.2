package basic;

import java.time.LocalDate;

public class Book {
    private LocalDate date;

    Book (LocalDate date) {
        this.date = date;

        // Здесь должна быть загрузка файла?
    }

    // Определить через обобщения (через T)?
    public String getStih (int num) {
        return null;
    }
}
