package de.benni;

import java.io.*;
import java.util.Objects;

public class Palindrom {

    private final Tools tools;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public Palindrom() {
        this.tools = new Tools();
        this.runTestFiles();
    }

    private void runTestFiles() {
        File testdatenDir = new File("Testdaten");
        if(testdatenDir.exists()) {
            for (File file : Objects.requireNonNull(testdatenDir.listFiles())) {
                System.out.println("Testing file [" + file.getName() + "]");

                StringBuilder text = new StringBuilder();

                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        text.append(line);
                    }
                } catch (IOException e) {
                    System.out.println("Beim lesen von [" + file.getName() + "] ist ein Fehler aufgetreten.");
                    continue;
                }

                String[] words = text.toString().split(", ");
                int failed = 0;
                for (String word : words) {
                    if (this.tools.deleteSpecialCharacters(word).equalsIgnoreCase(this.tools.strReverse(this.tools.deleteSpecialCharacters(word)))) {
                        System.out.println(ANSI_GREEN + "✓ " +  ANSI_WHITE + "[" + word + "]" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_RED + "❌ " +  ANSI_WHITE + "["+ this.tools.deleteSpecialCharacters(word) + "] != [" + this.tools.strReverse(this.tools.deleteSpecialCharacters(word)) + "]" + ANSI_RESET);
                        failed++;
                    }
                }

                System.out.println("[" + file.getName() +"] " + ANSI_GREEN + (words.length-failed) + " Accepted " + ANSI_RED + failed + " Failed" + ANSI_RESET);
                System.out.println("---------------------------");
            }
        } else {
            System.out.println(testdatenDir.getAbsolutePath());
        }
    }

    // --------------------------------------------

    public static void main(String[] args) {
        new Palindrom();
    }

}
