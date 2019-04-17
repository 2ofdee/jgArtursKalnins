package lv.Homework10;

public class UserValidationService {

        private String name;
        private String lastName;
        private int age;

        public UserValidationService(String name, String lastName, int age){
            if(name.length() < 3 || name.length()+lastName.length() > 15 || age < 0 || age > 120 ) {
                throw new IllegalStateException("Something is not right, brother");
            }
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
}
