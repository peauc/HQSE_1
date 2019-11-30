package HQSE_5;

public class Chat {
    private static String user;

    public Chat(String name) {
        this.user = name;
    }

    public static void run() {
        String msg;

        while (true) {
            msg = "Salut";
            formatMessage(user, msg);
        }
    }

    public static void formatMessage(String name, String msg) {
        System.out.println("[" + name + "] " + msg);
    }
}
