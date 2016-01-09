/**
 * Created by tyw on 16-1-8.
 */
public class Person {
    private int age;
    private String name;
    private int id;


    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public Person(String name) {
        this.name=name;
    }
    public Person(int id) {
        this.id=id;
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
