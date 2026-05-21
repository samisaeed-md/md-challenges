import java.util.ArrayList;

public class SayThatAgain {
    void main() {
        duplicateString("Hello",3);
    }
    String duplicateString(String text, int times){
        ArrayList<String> dupe = new ArrayList<>();

        for(int i = 0; i < times; i++){
            dupe.add(text);
        }

        return String.join("",dupe);
    }
}
