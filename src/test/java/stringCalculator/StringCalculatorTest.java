package stringCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @DisplayName("구분자 추출하기")
    @Test
    void normalSeperatorTest() {
        String input = "1,2;gd,d";
        String[] expected = {",", ";gd,d"};

        StringCalculator ca =  new StringCalculator();
        String seperator = ca.normalSeperator(input);

        assertThat(input.split(seperator).equals(expected));
    }

    @DisplayName("구분자 이용해서 숫자와 문자열 구분하여 문자열 숫자형만 가져오기")
    @Test
    void seperateStringTest() {
        String input = "122,23;3";
        String[] expected = {"122", "23", "3"};

        StringCalculator ca =  new StringCalculator();
        String[] seperateString = ca.seperateString(input);

        assertThat(seperateString).isEqualTo(expected);
    }

    @DisplayName("문자열 숫자형을 숫자형으로 만들기")
    @Test
    void changeToNumberTest() {
        String input = "122,23;3";
        int[] expected = {122, 23, 3};

        StringCalculator ca =  new StringCalculator();
        String[] seperateString = ca.seperateString(input);
        int[] changeToNumber = ca.changeToNumber(seperateString);

        assertThat(changeToNumber).isEqualTo(expected);
    }

    @DisplayName("더하기!!")
    @Test
    void addNumberTest() {
        String input = "122,23;3";
        int expected = 148;

        StringCalculator ca =  new StringCalculator();
        String[] seperateString = ca.seperateString(input);
        int[] changeToNumber = ca.changeToNumber(seperateString);
        int addNumber = ca.addNumber(changeToNumber);

        assertThat(addNumber).isEqualTo(expected);
    }
}

//    @DisplayName("지정구분자 인풋값 테스트")
//    @Test
//    void selectSeperatorTest() {
//        StringCalculator ca =  new StringCalculator();
//        String input = "\"//;\\n";
//        String[] expected = {"\"//\\n"};
//        String[] seperator= ca.seperateString(input);
//        assertThat(seperator).isEqualTo(expected);
//    }
