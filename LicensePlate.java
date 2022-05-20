public class LicensePlate {
    private String letters;
    private String numbers;

    public LicensePlate(String letters, String numbers) {
        this.letters = letters;
        this.numbers = numbers;
    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String toString() {
        return "LicensePlate{" +
                "letters='" + letters + '\'' +
                ", numbers='" + numbers + '\'' +
                '}';
    }
}
