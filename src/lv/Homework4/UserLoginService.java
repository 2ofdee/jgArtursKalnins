package lv.Homework4;

//Ok
public class UserLoginService {

    //ctrl + alt + l
    public void login(User user, String password)   {
        if (!verify(user.getPassword(), password)){
            user.decreaseLoginAttempts();
            System.out.println("Incorrect Password");
            System.out.println("Password attempts left " +user.getLoginAttemptsLeft());
            System.out.println("Is user blocker: " +user.isBlocked());
        }else{
            System.out.println("Logged in successful");
            user.resetLoginAttempts();
        }

    }

    private boolean verify(String userPassword, String password){
        return password.equals(userPassword);

    }

}


