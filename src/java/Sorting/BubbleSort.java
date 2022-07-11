import java.util.Arrays;

public class BubbleSort {

    public static void main(String [] args){
        int []arr = {10,7,1,5,2,12};
        int temp;
        try {
            for (int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp;

                    }
                }

            }
            System.out.println(Arrays.toString(arr));
            /*for (int s: arr) {
                System.out.println(s);
            }*/
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
