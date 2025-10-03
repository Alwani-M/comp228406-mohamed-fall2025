package exercise1;

import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private String[] questions;
    private String[][] options;
    private int[] correctIndex;

    private int correctCount;
    private int incorrectCount;

    private Random random;

    // constructor
    public Test() {
        questions = new String[5];
        options = new String[5][4];
        correctIndex = new int[5];

        correctCount = 0;
        incorrectCount = 0;

        random = new Random();

        // fill questions & answers (edit text if you want)
        questions[0] = "Which tool shows pop-up dialogs in Java?";
        options[0][0] = "Scanner";
        options[0][1] = "System.out";
        options[0][2] = "JOptionPane";
        options[0][3] = "Console";
        correctIndex[0] = 2; // 0-based → option 3

        questions[1] = "Which keyword defines a class in Java?";
        options[1][0] = "def";
        options[1][1] = "class";
        options[1][2] = "struct";
        options[1][3] = "module";
        correctIndex[1] = 1; // option 2

        questions[2] = "Which method starts a Java program?";
        options[2][0] = "public start()";
        options[2][1] = "main(String[] args)";
        options[2][2] = "run()";
        options[2][3] = "execute()";
        correctIndex[2] = 1; // option 2

        questions[3] = "Which access modifier hides data inside a class?";
        options[3][0] = "public";
        options[3][1] = "protected";
        options[3][2] = "private";
        options[3][3] = "package";
        correctIndex[3] = 2; // option 3

        questions[4] = "Which one is a Java class library (API) package?";
        options[4][0] = "java.util";
        options[4][1] = "py.list";
        options[4][2] = "js.array";
        options[4][3] = "c.header";
        correctIndex[4] = 0; // option 1
    }

    // show a question, collect input
    public void simulateQuestion(int qIndex) {
        String questionText = questions[qIndex] + "\n";
        for (int i = 0; i < 4; i++) {
            questionText += (i + 1) + ". " + options[qIndex][i] + "\n";
        }

        String answer = JOptionPane.showInputDialog(null, questionText);
        checkAnswer(qIndex, answer);
    }

    // check  input, update counters
    public void checkAnswer(int qIndex, String answer) {
        int userChoice = -1;
        try {
            userChoice = Integer.parseInt(answer.trim()); // expect 1..4
        } catch (Exception e) {
            userChoice = -1;
        }

        int correctOneBased = correctIndex[qIndex] + 1;
        if (userChoice == correctOneBased) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrectCount++;
            String msg = generateMessage(false)
                    + "\nCorrect answer: " + correctOneBased + ". " + options[qIndex][correctIndex[qIndex]];
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    public String generateMessage(boolean correct) {
        switch (random.nextInt(4)) {
            case 0: return correct ? "Excellent!" : "No. Please try again.";
            case 1: return correct ? "Good!" : "Wrong. Try once more.";
            case 2: return correct ? "Keep up the good work!" : "Don't give up!";
            default: return correct ? "Nice work!" : "No. Keep trying..";
        }
    }

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        int total = correctCount + incorrectCount;
        double percent = total > 0 ? (correctCount * 100.0) / total : 0.0;

        JOptionPane.showMessageDialog(null,
                "Correct: " + correctCount
                        + "\nIncorrect: " + incorrectCount
                        + "\nPercentage: " + String.format("%.1f", percent) + "%");
    }
}
