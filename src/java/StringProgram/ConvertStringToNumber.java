package StringProgram;

public class ConvertStringToNumber {
    public static void main(String [] args){
        String number = "345";
        // Using inbuilt method
        /*try{
            int num = Integer.parseInt(number);
            System.out.println("Number format :: "+num);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }*/

        // Without inbuilt method

        char []charArray = number.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0'; // 48 and 1 = 49, 2 = 50
        System.out.println(zeroAscii);
        for(int i=0; i<charArray.length; i++){
            int c = (int)charArray[i];
            System.out.println(c);
            sum = (sum * 10) +  (c-zeroAscii);
        }
        System.out.println(sum);
    }
}
