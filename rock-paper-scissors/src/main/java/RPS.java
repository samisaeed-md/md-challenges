import java.util.*;

public class RPS {

    static void main(String[] args) {
        rps();
    }

    static void rps() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ROCK, PAPER, SCISSORS: ");

        String playerChoice = scanner.nextLine().toUpperCase();
        String cpuChoice = getRandomChoice();

        System.out.println("You picked: " + playerChoice);
        System.out.println("CPU: " + cpuChoice);

        String result = getResult(playerChoice, cpuChoice);

        System.out.println(result);
    }

    static String getRandomChoice() {
        String[] choices = {"ROCK", "PAPER", "SCISSORS"};

        int randomIndex = (int) (Math.random() * choices.length);

        return choices[randomIndex];
    }

    static String getResult(String player, String cpu) {
        if (player.equals(cpu)) {
            return "DRAW";
        }

        if (player.equals("ROCK") && cpu.equals("SCISSORS")) {
            return "YOU WIN";
        }

        if (player.equals("SCISSORS") && cpu.equals("PAPER")) {
            return "YOU WIN";
        }

        if (player.equals("PAPER") && cpu.equals("ROCK")) {
            return "YOU WIN";
        }

        return "YOU LOSE";
    }
}