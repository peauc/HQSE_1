package HQSE_5;

import com.google.common.base.Strings;

public class GetOpt {

    private String[] theArgs = null;
    private int argCount = 0;

    public GetOpt(String[] args) {
        this.theArgs = args;
        this.argCount = args.length;
    }

    public String[] getTheArgs() {
        return (this.theArgs);
    }

    public int getArgCount() {
        return (this.argCount);
    }
}
