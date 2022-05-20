import java.util.Arrays;

public class LicensePlateTest {

    public static void main(String[] args) {
        
        LicensePlate[] plates = new LicensePlate[(int) (Math.random() * 100 + 1)];
        for (int i = 0; i < plates.length; i++) {
            String number = "";
            for (int j = 0; j < 4; j++)
                number += (int) (Math.random() * 10);
            String letters = "";
            for (int j = 0; j < 3; j++)
                letters += (char) ((int) (Math.random() * 26) + 65);
            plates[i] = new LicensePlate(letters, number);
        }

        System.out.println(Arrays.deepToString(plates)
                .replace("}, ", "\n")
                .replace("[", "")
                .replace("}]", "")
                .replace("LicensePlate{letters=", "")
                .replace(", numbers=", " ")
                .replace("'", "")
        );

        LicensePlateSorter lps = new LicensePlateSorter();
        lps.sortFinal(plates);

        System.out.println();
        System.out.println(Arrays.deepToString(plates)
                .replace("}, ", "\n")
                .replace("[", "")
                .replace("}]", "")
                .replace("LicensePlate{letters=", "")
                .replace(", numbers=", " ")
                .replace("'", "")
        );
    }
}
