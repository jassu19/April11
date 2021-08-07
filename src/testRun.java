import java.util.Arrays;

public class testRun {
    public static void main(String[] args) {
        Jokes joke = Joke.get();
        System.out.println(joke.joke());
       Double[] argss = {0.0,0.0};
        for (int i = 0; i < 5; i++) {

            argss[i]=Math.random();
            System.out.println((argss[i]));
            System.out.println(Arrays.toString(argss));
        }

    }
}
