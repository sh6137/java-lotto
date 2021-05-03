package stringCalculator;

public class StringCalculator {

    String[] normalClassifier() {
        String[] classifier = {",",":",";"};
        return classifier;
    }

    String[] specialClassifier(String compare) {
        String value1 = "\"//";
        String value2 = "\\n";
        String classifier = ";";
        String[] result = new String[0];

        if (compare.contains(value1) | compare.contains(value2)) {
            result = compare.split(classifier);
        }
        return result;
    }
}
