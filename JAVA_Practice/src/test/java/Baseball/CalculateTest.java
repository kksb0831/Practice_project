package Baseball;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculateTest {
    @Test
    void CalculateTest(){
        int[] answer = Answer.answer();
        int[] correct = Gamego.gamego(answer);

        Calculate.calculate(correct,answer);


        assertAll();

    }


}
