package NumberCalculation;

public class SumOfAllNumberOneToN {
    public static void main(String [] args) {
        int sum = 0;
        for (int i = 1; i <= 328; i++) {

            if(i > 9){
                   int rem =  segregateDigit(i);
                   sum = sum + rem;
            }else{
                    sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    static int segregateDigit(int digit){
        int sum = 0;
        while(digit > 0){
            int rem = digit % 10;
            sum = sum + rem;
            digit = digit / 10;
        }
        return sum;
    }
}
