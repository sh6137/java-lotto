package stringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @DisplayName("input 받기")
    @ParameterizedTest
    @ValueSource(strings = {"1,2", "1,2,3", "1,2:3"})
    void inputTest(String input) {
        System.out.println(input);
    }

    @DisplayName("일반구분자 인풋값 테스트")
    @Test
    void normalClassifierTest() {
        StringCalculator ca =  new StringCalculator();
        String input = "1,2";
        String[] expected = {"1", "2"};
        String[] classifier= ca.normalClassifier();
        assertThat(input.split(classifier[0])).isEqualTo(expected);
    }

    @DisplayName("지정구분자 인풋값 테스트")
    @Test
    void specialClassifierTest() {
        StringCalculator ca =  new StringCalculator();
        String input = "\"//;\\n";
        String[] expected = {"\"//","\\n"};
        String[] result= ca.specialClassifier(input);
        assertThat(result).isEqualTo(expected);
    }
}