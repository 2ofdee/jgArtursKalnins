package lv.Homework3;

//OK
public class Human {
    private String name;
    private int age;

    public void sayHi() {
        System.out.println("Hi! my name is " + getName() +  ", I'm " + getAge() + " years old!" );
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
