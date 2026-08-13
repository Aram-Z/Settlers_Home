package User;

import java.util.Scanner;

public class ConsolUserInterface implements UserInterface{

    Scanner scanner = new Scanner(System.in);


    @Override
    public String getUserCommand() {
        return scanner.nextLine();
    }

    @Override
    public void closeScanner() {
        scanner.close();

    }
}
