package services;

import basic.DayCalculate;
import basic.MainClass;

import java.time.LocalDate;

public class Chasy {
    LocalDate date;
    LocalDate nextPasha;
    DayCalculate dayCalculate;

    public Chasy(String serviceName, DayCalculate dayCalculate) {
        this.dayCalculate = dayCalculate;
        date = dayCalculate.getDate();
        nextPasha = dayCalculate.getNextPasha();
    }


}
