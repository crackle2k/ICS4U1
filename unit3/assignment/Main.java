import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        

    }

    public static int chooseDifficulty() {

        Scanner sc = new Scanner(System.in);
        System.out.println("What difficulty do you want to play?"); 
        System.out.println("[1] Easy (5x5)"); 
        System.out.println("[2] Medium (7x7)"); 
        System.out.println("[3] Hard (9x9)"); 
        int choice = sc.nextInt();

        if (choice == 1) { return 5;}
        else if (choice == 2) { return 7; }
        else if (choice == 3) { return 9; }
        else { return 0; }
    }
}
