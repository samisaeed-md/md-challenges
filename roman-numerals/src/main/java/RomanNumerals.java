import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
     static void main() {
        System.out.println(intToRoman(3999));
    }
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Roman numerals only except numbers 1-3999");
        }

        Map<String, Integer> mapping = new LinkedHashMap<>();
        mapping.put("M", 1000);mapping.put("CM", 900);mapping.put("D", 500);mapping.put("CD", 400);mapping.put("C", 100);mapping.put("XC", 90);
        mapping.put("L", 50);mapping.put("XL", 40);mapping.put("X", 10);mapping.put("IX", 9);mapping.put("V", 5);mapping.put("IV", 4);mapping.put("I", 1);

        StringBuilder roman = new StringBuilder();

        for (Map.Entry<String, Integer> entry : mapping.entrySet()) {
            if (num == 0) break;

            String symbol = entry.getKey();
            int value = entry.getValue();

            int count = num / value;
            if (count > 0) {
                roman.append(symbol.repeat(count));
                num %= value;
            }
        }

        return roman.toString();
    }
}
