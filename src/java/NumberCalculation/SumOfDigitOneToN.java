package NumberCalculation;

public class SumOfDigitOneToN {
    public static void main(String [] args) {
        int digit = 328;
        //int sum = digit * (digit + 1) / 2;
        int sum = 0;
        for(int i=1 ; i <= digit; i++){
            sum  = sum + i;
        }
        System.out.println(sum);
    }
}
