package lv.Homework4;

public class SiteAccess {

    public static void main(String[] args) {
      UserLoginService userLoginService = new UserLoginService("arturs", "kalnins", 29);
      User archie = new User("arturs.kalnins@hotmail.com", "safepassword");

      userLoginService.login(archie, "unsafe password");


    }
}
