package basic;

import java.time.LocalDate;

public class Book {
    private LocalDate date;
    private String text;
    private int stih;
//    int i, j;

    public Book(LocalDate date) {
        date = date;

        // Здесь должна быть загрузка файла?
    }

    public Book() {}

    Book (int k) {

    }

    // Определить через обобщения (через T)?
    public String getStih (int num) {
        return null;
    }

/*    Book (int i, int j) {
        this.i = i * 3;
        this.j = j + 3;
    }*/
}
