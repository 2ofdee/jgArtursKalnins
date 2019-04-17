package lv.Homework10;


public class UserValidationTest {
    public static void main(String[] args) {

    UserValidationService userValidationService = new UserValidationService("Arturs", "Kalnins", 29);
        System.out.println(userValidationService);


    UserValidationService userValidationService1 = new UserValidationService("ar", "Kalnins", 29);
        System.out.println(userValidationService1);




    }

}
