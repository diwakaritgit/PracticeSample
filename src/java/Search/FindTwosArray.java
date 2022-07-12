public class FindTwosArray {
    public static void main(String [] args){
       int count = 0;
        for(int i=1; i<=100;i++){
            int num = i;
            while (num > 0) {
                    int rem = num % 10;
                    if(rem == 2){
                        count++;
                    }
                    num = num / 10;
                }
        }
        System.out.println(count);
    }
}
