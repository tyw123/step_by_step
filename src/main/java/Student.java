/**
 * Created by tyw on 16-1-8.
 */
public class Student extends Person {
    private  Klass klass;
    //http://my.oschina.net/tashi/blog/186961
    //调用父类构造器
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass=klass;
    }

    public Student(String name, Klass klass) {
        super(name);
        this.klass=klass;
       // this.getKlass().setLeader(false);
    }

    public Student(String name, int age, Klass klass, boolean leader) {
        super(name, age);
        this.klass= klass;
        if(leader){
            this.getKlass().assignLeader(this);
        }

    }

    public  String introduce() {
        if(this.getKlass().getLeader()==this){
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getKlass() + ".";
        }else {
            return super.introduce() + " I am a Student. I am at Class " + klass.getKlass() + ".";
        }
    }
    public Klass getKlass(){return klass;}
}
