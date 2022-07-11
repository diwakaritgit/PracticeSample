import java.util.ArrayList;
import java.util.List;

public class CountAllPrimeNumbers {
    public static void main(String [] args){
       // int number = 79;
        List list = new ArrayList<Integer>();
        for(int number= 2; number<=100;number++ ) {
            int retNumber = checkPrimeNumberFromNumbers(number);
            if(retNumber != 0)
            list.add(retNumber);
        }
        System.out.println("List of all prime numbers between 1 to 100 are :::"+list);
    }

    static int checkPrimeNumberFromNumbers(int number){
        int count = 0;
        for(int i=1; i<=number/2;i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 1){
            return number;
        }
        return 0;
    }
}
