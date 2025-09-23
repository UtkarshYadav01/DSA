package Diamond;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1,2,3,4");
        Collections.reverse(list);
        System.out.println(list);
    }
}
