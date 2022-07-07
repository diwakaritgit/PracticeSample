import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String [] args){
        // List<Integer> list =  new ArrayList<Integer>();
        List list = Arrays.asList(12, 13, 16);
        //list.add(12);
        //list.add(17);
        //list.add(19);
        //list.add(20);

        //list.forEach(sub->System.out.println(sub));
        list.forEach(System.out::println);
    }
}
