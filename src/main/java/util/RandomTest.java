package util;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomTest {

    public static void extraLongFactorials(int n) {

        long sum = 1;
        for(int i=n; i>1; i--)
        {
            sum*=i;
            System.out.print(i+" ");
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);

        Random random = new Random();
        String i = random.ints(65, 90)
                .limit(8).collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append).toString();
        System.out.println(i);


    }
}
