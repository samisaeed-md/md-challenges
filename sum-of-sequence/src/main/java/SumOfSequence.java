public class SumOfSequence {
    static void sum(int begin, int end, int step) {
        int sum = 0;
        for(int i = begin; i <= end; i += step){
            sum += i;
        }
        System.out.println("Total Sum: " + sum);
    }


    static void main() {
        sum(1,4,1);
    }
}
