import java.util.*;

public class AmountAsCoins {

    static ArrayList<Integer> amountAsCoins(int money) {
        ArrayList<Integer> coins = new ArrayList<>();
        Collections.addAll(coins, 20, 10, 5, 2, 1);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < coins.size(); i++) {
            // keep using this coin while it fits
            while (money >= coins.get(i)) {
                money -= coins.get(i);      // actually change the amount
                res.add(coins.get(i));      // store the coin used
            }

        }

        System.out.println(res);

        return res;
    }

    static void main() {
        amountAsCoins(46);
    }

}