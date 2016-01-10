/**
 * Created by tyw on 16-1-8.
 */
public class Student extends Person {
    private  Klass klass;
    //http://my.oschina.net/tashi/blog/186961
    //调用父类构造器
    public Student(String name, int age, Klass klass) {
        super(name, age);
        if(klass!=null){
            this.klass=klass;
            klass.appendMember(this);
        }
    }

    public Student(String name, Klass klass) {
        super(name);
        if(klass!=null){
            this.klass=klass;
           // klass.appendMember(this);
        }
    }

    public Student(String name, int age, Klass klass, boolean leader) {
        super(name, age);
        if(klass!=null){
            this.klass=klass;
            klass.appendMember(this);
        }
        if(leader){
            this.getKlass().assignLeader(this);
        }
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return klass != null ? klass.equals(student.klass) : student.klass == null;

    }

    @Override
    public int hashCode() {
        return klass != null ? klass.hashCode() : 0;
    }

    public  String introduce() {
        if(this.equals(this.getKlass().getLeader())){
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getKlass() + ".";
        }else {
            return super.introduce() + " I am a Student. I am at Class " + klass.getKlass() + ".";
        }
    }

    public Klass setKlass(Klass klass){
        if(klass!=null){
            this.klass=klass;
           // klass.appendMember(this);
        }
        return klass;
    }
    public Klass getKlass(){return klass;}
}
