import static java.lang.Integer.parseInt;

public class StringCalculator {
    void main() {
        StringCalculator stringCalculator = new StringCalculator();
    }
    int add(){
        return 0;
    }

    int add(String num1){
        return parseInt(num1);
    }

    int add(String num1, String num2) {
        int stringToNumber1 = parseInt(num1);int stringToNumber2 = parseInt(num2);
        if(stringToNumber1 > 1000 || stringToNumber2 > 1000){
            throw new IllegalArgumentException("Number(s) exceed 1000");
        } else {
            return stringToNumber1 + stringToNumber2;
        }
    }
}