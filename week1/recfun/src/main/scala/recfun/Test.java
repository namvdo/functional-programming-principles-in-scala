package recfun;

import java.util.List;

public class Test {
    List.of(1, 2, 3, 4).stream().reduce(0, Integer::sum);
    public static void main(String[] args) {
        int sum = List.of(1, 2, 3, 4).stream().reduce(0, Integer::sum);
    }
}
