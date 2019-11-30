package HQSE_5;

public class Chat {
    private static String user;

    public Chat(String name) {
        user = name;
    }

    public void run() {
        String msg;
        ScannerStandardInput scanner = new ScannerStandardInput();
        Printer printer = new Printer();

        //noinspection InfiniteLoopStatement
        while (true) {
            printer.printName(user);
            msg = scanner.getInput();
        }
    }
}
