package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstDivision = number/100;
        int secondDivision = (number/10)%10;
        int thirdDivision = number%10;
        int answer = thirdDivision*100+secondDivision*10+firstDivision;
        System.out.println(answer);
    }
}
