package fizz_buzz

import spock.lang.Specification

class FizzBuzzTest extends Specification {
    def 'FizzyBuzzy'() {
        expect:
            new FizzBuzz(input).fizzBuzz() == result

        where:
            input   | result
            0       | "fizzbuzz"
            1       | "1"
            3       | "fizz"
            5       | "buzz"
            8       | "8"
            9       | "fizz"
            10      | "buzz"
            14      | "14"
            15      | "fizzbuzz"
            16      | "16"


    }

}
