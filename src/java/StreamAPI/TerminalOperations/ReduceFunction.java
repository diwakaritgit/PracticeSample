package StreamAPI.TerminalOperations;

/*
Terminal Operations
reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceFunction {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2,4,5,4,7,9,9);

        int even = list.stream().filter(n -> n%2 == 0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even); // 10

        // SUM of all elements
        // Creating list of integers
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
        int sum = array.stream().reduce(0,(a,b) -> a+b);
        System.out.println(sum); // 16

        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longest = words.stream().reduce((word1, word2)-> (word1.length()>word2.length() ? word1 : word2));
        System.out.println(longest); // 16
    }


}
