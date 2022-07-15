package StreamAPI;

/*
Intermediate Operations:
sorted: The sorted method is used to sort the stream.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFunction {
    public static void main(String [] args){
        List<String> names = Arrays.asList("Reflection","Collection","Stream");

        List<String> sort = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sort); //[Collection, Reflection, Stream]
        List<String> sortDesc = names.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDesc); //[Stream, Reflection, Collection]
    }
}
