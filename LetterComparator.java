import java.util.Comparator;

public class LetterComparator implements Comparator<LicensePlate> {
    public int compare(LicensePlate p1, LicensePlate p2) {
        return CharSequence.compare(p1.getLetters(), p2.getLetters());
    }
}
