package HQSE_5;

import java.util.Scanner;

public class ScannerStandardInput {
    private String UserCommand;
    private Scanner scanner;

    public ScannerStandardInput() {
        this.scanner = new Scanner(System.in);
    }

    protected void CloseScanner() {
        this.scanner.close();
    }

    public String getInput() {
        this.UserCommand = this.scanner.nextLine();
        return (this.UserCommand);
        }
    }
