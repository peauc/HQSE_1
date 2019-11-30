package HQSE_5;

public class Chat {
    private static String user;

    public Chat(String name) {
        this.user = name;
    }

    public static void run() {
        String msg;
        int i = 0;


        while (i == 0) {
            msg = "Salut";
            //user = "toto";
            formatMessage(user, msg);
            ++i;
        }
    }

    public static void formatMessage(String name, String msg) {
        System.out.println("[" + name + "] " + msg);
    }
}
