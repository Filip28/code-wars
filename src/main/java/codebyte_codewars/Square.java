package codebyte_codewars;

public class Square {
    public boolean isSquare(int n) {
        double square = Math.sqrt(n);
        return (square - Math.floor(square)) == 0;
    }
}
