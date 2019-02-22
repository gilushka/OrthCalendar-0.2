package basic;

import services.*;

import java.time.LocalDate;
import java.time.Period;

public class MainClass {
    public static void main(String[] args) throws Exception {
        LocalDate now = LocalDate.now();
        String serviceName = "pervyChas";
        DayCalculate dayCalculate = new DayCalculate(now);

        DayCalculate dc = dayCalculate;
        Chasy chasy = new Chasy(serviceName, dayCalculate);
    }

/*    public DayCalculate getDayCalculate() {
        return dc;
    }*/


//       LocalDate troica = basic.DayCalculate.getDay(previousPasha, 49, true);

//       System.out.println(troica);

/*         LocalDate one = LocalDate.of(2019,04,12);
        Period duration = Period.between(one, pasha);
        System.out.println(duration.getDays());
        duration = Period.between(pasha, one);
        System.out.println(duration.getDays());
        LocalDate two = one.plus(duration).plus(duration);
        System.out.println(two);*/
}

