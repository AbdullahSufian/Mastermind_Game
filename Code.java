package mastermind;

import java.util.Random;

public class Code {
    private String attempt;

    public Code() {
        this.attempt = "****" +
                "";
    }
    public Code(String attempt) {
        setAttempt(attempt);
    }

    public String getAttempt() {
        return attempt;
    }

    public void setAttempt(String attempt) {
        for (int i=0;i<=attempt.length();i++)
            if (attempt.length() == 4)
                this.attempt = attempt;
            else
                this.attempt="****";
    }

}

