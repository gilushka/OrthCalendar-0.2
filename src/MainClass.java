import java.time.LocalDate;
import java.time.Period;

public class MainClass {
    public static void main(String[] args) throws Exception {

       LocalDate now = LocalDate.now();
       LocalDate previousPasha = DayCalculate.getPasha(now, false);
       LocalDate nextPasha = DayCalculate.getPasha(now, true);

       LocalDate troica = DayCalculate.getDay(previousPasha, 49, true);

        System.out.println(previousPasha);
        System.out.println(troica);

/*         LocalDate one = LocalDate.of(2019,04,12);
        Period duration = Period.between(one, pasha);
        System.out.println(duration.getDays());
        duration = Period.between(pasha, one);
        System.out.println(duration.getDays());
        LocalDate two = one.plus(duration).plus(duration);
        System.out.println(two);*/

    }
}

