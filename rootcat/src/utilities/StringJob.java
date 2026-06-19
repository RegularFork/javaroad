package utilities;

import java.util.Scanner;

public class StringJob implements AutoCloseable{
    private final Scanner in;

    public StringJob() {
        this.in = new Scanner(System.in);
    }

    public String createName() {
        System.out.print("\nEnter the cat name here: ");
        String newName = in.nextLine();
        return newName.isEmpty() ? "Butch" : newName;
    }

    @Override
    public void close(){
    }
}
