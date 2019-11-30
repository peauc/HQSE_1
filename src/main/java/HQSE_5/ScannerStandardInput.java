package HQSE_5;

import java.util.Scanner;

public class ScannerStandardInput {
    private String UserCommand;

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        this.UserCommand = scanner.nextLine();
        scanner.close();
        return (this.UserCommand);
        }
    }
