package codebyte_codewars;

public class Kata4{
    public String bonusTime(final int salary, final boolean bonus) {
        return bonus ? "£" + salary * 10 : "£" + salary;
    }
}
