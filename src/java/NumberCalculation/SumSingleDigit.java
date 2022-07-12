package NumberCalculation;

public class SumSingleDigit {
    public static void main(String [] args) {
        int digit = 1234;
        int x = getDigit(digit);
        System.out.println(x);
    }

     static int getDigit(int digit){
         int sum = 0;
        while (digit > 0 || sum > 9) {
            if(digit == 0){
                digit = sum;
                sum = 0;
            }
            int rem = digit % 10;
            sum = sum + rem;
            digit = digit / 10;
        }

        return sum;
    }
}


