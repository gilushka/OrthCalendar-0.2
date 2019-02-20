package services;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Chasy {
    LocalDate date;
    LocalDate nextPasha;

    Chasy (LocalDate date, LocalDate nextPasha) {
        this.date = date;
        this.nextPasha = nextPasha;
    }
}
