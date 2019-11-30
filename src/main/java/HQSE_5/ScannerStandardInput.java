package HQSE_5;

import java.util.Scanner;

public class ScannerStandardInput {
    private String userCommand;
    private Scanner scanner;

    public ScannerStandardInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        this.userCommand = this.scanner.nextLine();
        return (this.userCommand);
    }
}
