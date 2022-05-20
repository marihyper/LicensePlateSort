import java.util.Comparator;

public class NumberComparator implements Comparator<LicensePlate> {
    public int compare(LicensePlate p1, LicensePlate p2) {
        return CharSequence.compare(p1.getNumbers(), p2.getNumbers());
    }
}
