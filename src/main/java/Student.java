/**
 * Created by tyw on 16-1-8.
 */
public class Student extends Person {
    private  int klass;
    //http://my.oschina.net/tashi/blog/186961
    //调用父类构造器
    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass=klass;
    }

    public  String introduce() {
        return super.introduce()+" I am a Student. I am at Class "+klass+".";
    }
}
