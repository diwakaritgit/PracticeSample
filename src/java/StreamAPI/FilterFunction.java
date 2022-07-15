package StreamAPI;

/*
Intermediate Operations:
The filter method is used to select elements as per the Predicate passed as argument.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFunction {
    public static void main(String [] args){
        List<String> names = Arrays.asList("seflection","Sollection","Stream");

        List<String> stratWithS = names.stream().filter(s -> s.startsWith("S") || s.startsWith("s")).collect(Collectors.toList());
        System.out.println(stratWithS);
    }
}
