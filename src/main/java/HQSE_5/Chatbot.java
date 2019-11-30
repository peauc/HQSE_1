package HQSE_5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chatbot {
    private String res;
    private String user;
    private boolean shouldRun;
    private String botName;

    public Chatbot(String username) {
        this.shouldRun = true;
        this.user = username;
        this.botName = "Hello";
    }

    public String getBotName() {
        return (this.botName);
    }

    public boolean getShouldRun() {
        return (this.shouldRun);
    }

    public String executeCommand(String command) {
        if (command == null) {
            return ("");
        } else if (command.equals("@Hello")) {
            Date aujourdhui = new Date();
            SimpleDateFormat formater;
            formater = new SimpleDateFormat("'le' dd/MM/yyyy 'et il est' hh:mm.");
            this.res = "Salut " + this.user + "! Nous sommes " + formater.format(aujourdhui);
            return this.res;
        } else if (command.equals("++")) {
            this.shouldRun = false;
            return ("");
        }
        return "";
    }
}
