import java.util.Arrays;

public class BinarySearch {
    public static void main(String [] args){
        int []arr = {1, 2, 3, 4, 5, 6};

        int arraySize = arr.length - 1;
        int start = 0;
        int searchData = 5;
        int s =  getSearchedData(arraySize, start,searchData, arr);
        if(s == -1){
            System.out.println("Searched Data not found in the array");
        }else{
            System.out.println("Searched data:   ---"+arr[s]);
            System.out.println("Indexed position:   ---"+s);
        }
    }
    static int getSearchedData(int arraySize, int start,int searchData, int []arr) {
        int mid = 0;
        try {
            while (start <= arraySize) {
                mid = start + (arraySize - start) / 2;
                //System.out.println("MID :"+mid);
                if (searchData == arr[mid]) {
                    return mid;

                } else if (searchData > arr[mid]) {
                    start = mid + 1;
                    //System.out.println("start start start:   ---"+start);


                } else {
                    arraySize = mid - 1;
                }

            }

            //return -1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Searched Data not found");
        }
        return -1;
    }
}

