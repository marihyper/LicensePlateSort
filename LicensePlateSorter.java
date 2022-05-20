import java.util.Arrays;
import java.util.List;

public class LicensePlateSorter {

    private void sortLetters(LicensePlate[] plates) {
        LetterComparator letterComparator = new LetterComparator();
        List<LicensePlate> newList = Arrays.asList(plates);
        newList.sort(letterComparator);
        LicensePlate[] targetArray = newList.toArray(new LicensePlate[0]);
    }
    
    private void sortNumbers(LicensePlate[] plates) {
        NumberComparator numberComparator = new NumberComparator();
        List<LicensePlate> newList = Arrays.asList(plates);
        newList.sort(numberComparator);
        LicensePlate[] targetArray = newList.toArray(new LicensePlate[0]);
    }

    public void sortFinal(LicensePlate[] plates) {
        sortNumbers(plates);
        sortLetters(plates);
    }
}
