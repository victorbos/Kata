package tennis

import spock.lang.Shared
import spock.lang.Specification
import sun.security.provider.SHA

class GameTest extends Specification {
    @Shared Player victor
    @Shared Player sarah

    @Shared Game game

    def 'test scores'() {
        given:
        winBalls(victor, victorWins)
        winBalls(sarah, saraWins)

        expect:
        game.getScore() == result

        where:
        victorWins | saraWins | result
        0 | 0 | 'love-love'
        0 | 1 | 'love-fifteen'
        2 | 1 | 'thirty-fifteen'
        3 | 0 | 'forty-love'
        3 | 4 | 'advantage Sarah'
        3 | 3 | 'deuce'
        4 | 4 | 'deuce'
        11 | 10 | 'advantage Victor'
    }



    def setup() {
        victor = new Player("Victor")
        sarah = new Player("Sarah")
        game = new Game(victor, sarah)
    }

    def winBalls(Player player, int number) {
        if (number <= 0)
            return
        1.upto(number) {player.winBall()}
    }
}
