package fizz_buzz;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FizzBuzz {
    private static Map<Integer, String> fizzers = initializeFizzers();

    private static Map<Integer, String> initializeFizzers() {
        fizzers = new HashMap<>();
        fizzers.put(3, "fizz");
        fizzers.put(5, "buzz");
        return fizzers;
    }

    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String fizzBuzz() {
        return doFizz();
    }

    private String doFizz() {
        String result = mapFizz();
        return (mapFizz().isEmpty() ? String.valueOf(number) : result);
    }

    private String mapFizz() {
        return fizzers.keySet()
                .stream()
                .map(key -> isDividable(number, key) ? fizzers.get(key) : "")
                .collect(Collectors.joining())
                ;
    }

    private boolean isDividable(int numerator, int denominator) {
        return numerator%denominator == 0;
    }
}
