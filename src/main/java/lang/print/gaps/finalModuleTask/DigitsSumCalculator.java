package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first, second, third, fourth, answer;
        first = number / 1000;
        second = number / 100 - first * 10;
        third = number / 10 - first * 100 - second * 10;
        fourth = number - first * 1000 - second * 100 - third * 10;
        answer = first + second + third + fourth;
        System.out.println(answer);
    }
}
