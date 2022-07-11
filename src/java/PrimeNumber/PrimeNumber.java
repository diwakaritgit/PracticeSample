public class PrimeNumber {
    public static void main(String [] args){
        int number = 79;
        checkPrimeNumber(number);
    }

    static void checkPrimeNumber(int number){
        int count = 0;
        for(int i=1; i<=number/2;i++){
            if(number % i == 0){
                count++;
            }
        }
        System.out.println(count);
        if(count == 1){
            System.out.println("Number is Prime number::::"+number);
        }
    }
}
