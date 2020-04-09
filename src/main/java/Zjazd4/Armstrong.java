package Zjazd4;

/**
 * summary: Implement UML chart, exercise 24: Armstrong number
 * author: Michal Wadas
 **/
public class Armstrong {

    /**
     * @param num1
     * @param num2
     * @param num3
     * @return Information if given number is Armstrong number. True|False
     */
    public boolean isArmstrongNumber(int num1, int num2, int num3) {

        String rowNumber = "" + num1 + num2 + num3;
        int result = (int) (Math.pow(num1, 3) + Math.pow(num2, 3) + Math.pow(num3, 3));

        return rowNumber.equals(Integer.toString(result));
    }

    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        System.out.println(armstrong.isArmstrongNumber(1, 5, 3));
        System.out.println(armstrong.isArmstrongNumber(1, 2, 3));
    }
}