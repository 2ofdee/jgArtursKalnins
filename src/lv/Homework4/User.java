package lv.Homework4;

public class User {

    private String login;
    private String password;
    private int loginAttemptsLeft;
    private boolean blocked;

//  liekas rindas
//
//
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.loginAttemptsLeft = 3;
        this.blocked = false;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
            return password;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public void decreaseLoginAttempts(){
        this.loginAttemptsLeft--;
    }

    //ctrl + alt + l
    public void resetLoginAttempts() {
            if (this.loginAttemptsLeft == 0) {
            this.loginAttemptsLeft = 3;
        }
    }
    private void block() {
        if (this.loginAttemptsLeft == 0) {
            this.blocked = true;
        }
    }
    public boolean isBlocked() {
        return blocked;
    }

}
