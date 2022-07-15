public class SumOfPrimeNumber {
    public static void main(String [] args){
        int sum = 0;

        for(int i=1; i <=10; i++){
            int primeNo = getPrimeNumber(i);
            //System.out.println(primeNo);
            if(primeNo != -1)
            sum = sum + primeNo;
        }
        System.out.println("Sum of number::"+sum);
    }

    static int getPrimeNumber(int number){
        int count = 0;
        for(int j = 1; j <= number/2 ; j++){
            if(number % j == 0){
                count++;
            }
        }
        if(count == 1){
            return number;
        }
        return -1;
    }
}
