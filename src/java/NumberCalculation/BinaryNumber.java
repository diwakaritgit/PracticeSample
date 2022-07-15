package NumberCalculation;

public class BinaryNumber {
    public static void main(String [] args){
        int number = 1000141;
        boolean boo = getBinaryNumber(number);
        System.out.println("is  " +number+" Binary number???  "+boo);
    }

    static boolean getBinaryNumber(int number){
        boolean b = true;
        while (true){
            if(number == 0) { // break when last number  = 0
                break;
            }else{
                int rem = number % 10;
                if(rem > 1){
                    b = false;
                    System.out.println("Not a binary number");
                    break;
                }
                number = number / 10;
                //System.out.println("Binary number numbernumbernumbernumber:   "+number);
            }
        }
        return b;
    }
}
/*

Binary number numbernumbernumbernumber:   100011
Binary number numbernumbernumbernumber:   10001
Binary number numbernumbernumbernumber:   1000
Binary number numbernumbernumbernumber:   100
Binary number numbernumbernumbernumber:   10
Binary number numbernumbernumbernumber:   1
Binary number numbernumbernumbernumber:   0
 */