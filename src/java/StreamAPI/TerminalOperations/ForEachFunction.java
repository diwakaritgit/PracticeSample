package StreamAPI.TerminalOperations;

/*
Terminal Operations
forEach: The forEach method is used to iterate through every element of the stream.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachFunction {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2,4,5,4,7,9,9);

        list.stream().forEach(y->System.out.println(y));
        list.stream().map(n -> n * n).collect(Collectors.toSet()).forEach(x->System.out.println(x));
        //System.out.println(squareList); //[16, 49, 81, 4, 25]
    }


}
