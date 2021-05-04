package stringCalculator;

public class StringCalculator {
    // 일반구분자(숫자와 구분자 및 문자를 구분)
    String normalSeperator(String input) {
        String temp = new String(input.replaceAll("[0-9]",""));
        System.out.println(temp.length());
        String[] temp2 = temp.split("");
        System.out.println(temp2[1]);

        // 집어넣기
        for (int i = 0; i < temp.length(); i++) {
            temp2[i] = temp2[i] + "|";
        }
        temp2[temp2.length-1] = temp.substring(temp.length()-1);

        // 뒤에만 제거
        System.out.println(temp2[temp2.length-1]);

        // 베열값을 String으로 합치기
        String seperator = "";
        for (int i = 0; i < temp2.length; i++) {
            seperator += temp2[i];
        }

        System.out.println("------------------------------");
        System.out.println(seperator);
        return seperator;
    }

    // 구분자를 통해서 구분된 결과 받기
    String[] seperateString(String input) {

        String seperator = normalSeperator(input);
        String[] seperateString = input.split(seperator);
        return seperateString;
    }

    // 문자형을 숫자형으로 변경
    int[] changeToNumber(String[] seperateString) {
        int changeToNumber[] = new int[seperateString.length];
        for (int i = 0; i < changeToNumber.length; i++) {
            changeToNumber[i] = Integer.valueOf(seperateString[i]);
            System.out.println(changeToNumber[i]);
            System.out.println("------------------------------");
        }
        return changeToNumber;
    }

    // 더하기!!
    int addNumber(int[] changeToNumber) {
        int addNumber = 0;
        for (int i = 0; i < changeToNumber.length; i++) {
            addNumber += changeToNumber[i];
        }
        System.out.println(addNumber);
        return addNumber;
    }
}

/*
    // 지정구분자
    String[] selectSeperator(String compare) {
        String value1 = "\"//";
        String value2 = "\\n";
        String seperator = ";";
        String[] result = new String[0];

        if (compare.contains(value1) | compare.contains(value2)) {
            result = compare.split(seperator);
        }
        return result;
    }

 */