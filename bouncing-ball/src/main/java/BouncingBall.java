public class BouncingBall {
    void main(){
        System.out.println(calculateBounce(0.5, 100));
    }
    static int calculateBounce(double bounce, double h) {
        double window = 1.5;

        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;

        int seen = 1;
        double height = h * bounce;

        while (height >= window) {
            seen += 2;
            height *= bounce;
        }

        return seen;
    }
}