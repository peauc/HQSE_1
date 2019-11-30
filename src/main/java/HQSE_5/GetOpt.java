package HQSE_5;

public class GetOpt {

    private String[] theArgs = null;
    private String userName = null;

    private int argCount = 0;

    public GetOpt(String[] args) {
        if (args.length == 2 && (args[0].equals("-p"))) {
            this.userName = args[1];
        }
    }

    public String[] getTheArgs() {
        return (this.theArgs);
    }

    public String getUserName() {
        return (this.userName);
    }

    public int getArgCount() {
        return (this.argCount);
    }
}
