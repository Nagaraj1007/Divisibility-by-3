
public class Main {

    public static int divisibleByThree(int[] array){
        int sumOfDigits = 0;
        for (int values : array){
            sumOfDigits += values;
        }
        return (sumOfDigits % 3 == 0) ? 1 : 0 ;
    }

    public static void main(String[] args) {
        System.out.println(divisibleByThree(new int[]{1, 0, 0, 1, 2}));
    }
}