import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Task 1 Cere de la user o litera intre R , P si S (daca e altceva afiseaza eroare)
        // Task 2 Inplementeaza un sistem prin care calculatorul alege singur random intre R P si S
        // Task 3 Conditii Daca user alege R si calculator alege tot R -> Draw
        // Task 4 Conditii Daca user alege R si calculator alege tot S -> User wins
        // Task 5 Conditii Daca user alege R si calculator alege tot P -> Computer wins
        // Update 1 Fa un sistem de scor (2 variabile scor user si scor computer care se incrementeaza fiecare in functie de cine castiga)
        // Update 2 Afiseaaza la fiecare joc scorul curent.
        // Update 3 Care ajunge primul la 5 sa se termine jocul si se afiseaza castigatorul.
        int scorPlayer = 0;
        int scorComputer = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Pick a letter from P (Paper), S (Scissors), R (Rock)");
            char userLetter = scan.next().charAt(0);
            userLetter = Character.toUpperCase(userLetter);

            char[] letters = {'R', 'P', 'S'};
            Random rnd = new Random();
            int index = rnd.nextInt(letters.length);
            char computerLetter = letters[index];



            if (userLetter == 'R' && computerLetter == 'R') {
                System.out.println("Computer chose R");
                System.out.println("Draw");
            } else if (userLetter == 'R' && computerLetter == 'P') {
                System.out.println("Computer chose P");
                System.out.println("Computer wins!");
                scorComputer++;
            } else if (userLetter == 'R') {
                System.out.println("Computer chose S");
                System.out.println("User wins!");
                scorPlayer++;
            } else if (userLetter == 'P' && computerLetter == 'R') {
                System.out.println("Computer chose R");
                System.out.println("User wins!");
                scorPlayer++;
            } else if (userLetter == 'P' && computerLetter == 'P') {
                System.out.println("Computer chose P");
                System.out.println("Draw");
            } else if (userLetter == 'P') {
                System.out.println("Computer chose S");
                System.out.println("Computer wins!");
                scorComputer++;
            } else if (userLetter == 'S' && computerLetter == 'R') {
                System.out.println("Computer chose R");
                System.out.println("Computer wins!");
                scorComputer++;
            } else if (userLetter == 'S' && computerLetter == 'P') {
                System.out.println("Computer chose P");
                System.out.println("User wins!");
                scorPlayer++;
            } else if (userLetter == 'S') {
                System.out.println("Computer chose S");
                System.out.println("Draw");
            } else {
                System.out.println("Invalid letter");
            }
            System.out.println("The score is: Player - Computer " + scorPlayer + " - " + scorComputer);
            System.out.println("--------------------------------------------------------------\n");
            if (scorPlayer == 5) {
                System.out.println("User won the game!");
                break;
            }
            if(scorComputer == 5){
                System.out.println("Computer won the game!");
                break;
            }
        }

    }
}
