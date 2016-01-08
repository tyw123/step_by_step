/**
 * Created by tyw on 16-1-8.
 */
public class Person {
    private int age;
    private String name;


    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
    public String introduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }
    public String basicIntroduce() {
        return "My name is "+name+". I am "+age+" years old.";
    }
}
