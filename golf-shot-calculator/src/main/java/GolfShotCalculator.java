public class GolfShotCalculator {
    static void main() {
        int par = (int) (Math.random() * 6) + 3;
        int strokes = (int) (Math.random() * 6) + 1;
        int diff = strokes - par;

        String result = (strokes == 1) ? "Hole in One!" : switch (diff) {
            case -2 -> "Eagle";
            case -1 -> "Birdie";
            case  0 -> "Par";
            case  1 -> "Bogey";
            case  2 -> "Double Bogey";
            default -> "Quit";
        };

        System.out.println("|Strokes: " + strokes + "|Par: " + par + "|Result: "+ result + "|");
    }
}
