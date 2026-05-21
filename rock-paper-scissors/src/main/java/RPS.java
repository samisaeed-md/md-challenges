import java.util.*;

public class RPS {
    static void main() {
        Scanner player1Input = new Scanner(System.in);
        System.out.println("ROCK,PAPER,SCISSORS: ");

        String player1 = player1Input.nextLine().toUpperCase();
        System.out.println("You picked: " + player1);

        int randomIndex = (int) (Math.random() * 3);

        String[] rps = {"ROCK","PAPER","SCISSORS"};

        String cpu = rps[randomIndex];

        System.out.println("CPU: " + cpu);

        if(player1.equals(cpu)){
            System.out.println("DRAW");
        } else if (player1.equals("ROCK") && cpu.equals("SCISSORS")){
            System.out.println("YOU WIN");
        } else if (player1.equals("SCISSORS") && cpu.equals("PAPER")){
            System.out.println("YOU WIN");
        } else if (player1.equals("PAPER") && cpu.equals("ROCK")){
            System.out.println("YOU WIN");
        } else{
            System.out.println("YOU LOSE");
        }
    }
}
