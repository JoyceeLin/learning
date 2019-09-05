package learning.juc;

import java.util.Optional;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        int i = 0;
        Integer a = 1;
        System.out.println(Optional.ofNullable(a).orElse(i));
    }
}
