package codebyte_codewars;

public class FakeBinary {
    public String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}
