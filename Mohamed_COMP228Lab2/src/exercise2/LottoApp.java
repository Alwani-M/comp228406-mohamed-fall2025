package exercise2;

import javax.swing.JOptionPane;

public class LottoApp {
    public static void main(String[] args) {
        Lotto game = new Lotto();

        String input = JOptionPane.showInputDialog("Pick a number between 3 and 27:");
        int chosen = Integer.parseInt(input.trim());

        boolean win = false;

        for (int i = 1; i <= 5; i++) {
            int sum = game.roll();
            int[] nums = game.getNumbers();

            JOptionPane.showMessageDialog(null,
                    "Roll " + i + ": " + nums[0] + " + " + nums[1] + " + " + nums[2] +
                            " = " + sum);

            if (sum == chosen) {
                JOptionPane.showMessageDialog(null, "You win! The sum matched your number.");
                win = true;
                break;
            }
        }

        if (!win) {
            JOptionPane.showMessageDialog(null, "Computer wins! You didn’t match in 5 rolls.");
        }
    }
}
