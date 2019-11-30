package HQSE_5;

import java.util.Scanner;

public class ScannerStandardInput {
    private String UserCommand;
    private Scanner scanner;

    public ScannerStandardInput() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        this.UserCommand = this.scanner.nextLine();
        return (this.UserCommand);
        }
    }
