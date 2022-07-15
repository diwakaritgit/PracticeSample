package StreamAPI.TerminalOperations;

/*
Terminal Operations
collect: The collect method is used to return the result of the intermediate operations performed on the stream.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectFunction {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2,4,5,4,7,9,9);

        Set<Integer> squareList = list.stream().map(n -> n * n).collect(Collectors.toSet());
        System.out.println(squareList); //[16, 49, 81, 4, 25]
    }


}
