package StreamAPI;

/*
Intermediate Operations:
The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFunction {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2,3,4,5);
       // List number = list.stream().map(x->x*x).collect(Collectors.toList());
        List<Integer> square = list.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(square);  //outout [4, 9, 16, 25]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //outout [2, 4, 6, 8, 10]
    }
}
