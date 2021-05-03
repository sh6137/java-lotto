package stringCalculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"1,2", "1,2,3", "1,2:3"})
    void inputTest(String input) {
        System.out.println(input);
    }

    @Test
    void normalClassifierTest() {
        StringCalculator ca =  new StringCalculator();
        String input = "1,2";
        String[] expected = {"1", "2"};
        String[] classifier= ca.normalClassifier();
        assertThat(input.split(classifier[0])).isEqualTo(expected);
    }

}