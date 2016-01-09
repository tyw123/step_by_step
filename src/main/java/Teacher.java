import java.util.ArrayList;
import java.util.List;

/**
 * Created by tyw on 16-1-9.
 */
public class Teacher extends Person{
    private List<Klass> classes=new ArrayList();

    public Teacher(String name, int age, List<Klass>classes) {//居然还跟参数顺序有关系
        super(name, age);
        this.classes=classes;
        for(int i=0;i<classes.size();i++){
            classes.get(i).setTeacher(this);
        }
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, Klass klass) {//之后会调用的参数，都需要判断一下传进来的是否为空
        super(name);
        if(klass!=null) {
            System.out.print(klass);
            this.classes.add(klass);
            klass.setTeacher(this);
        }
    }

    public void setClass(Klass klass){
        if(klass!=null) {
            if (klass.isIn(classes)) {
            } else {
                //  System.out.print(classes.size());
                classes.add(klass);
                klass.setTeacher(this);
            }
        }

    }
    public List<Klass> getClasses(){
        return classes;
    }
    public String introduce(){
        if(this.classes.size()==0){
            return super.introduce()+" I am a "+"Teacher"+". I teach No Class.";
        }else {
            String result=super.introduce()+" I am a "+"Teacher"+". I teach Class ";
            for(int i=0;i<classes.size();i++){
                result+=classes.get(i).getKlass();
                if(i!=classes.size()-1){result+=", ";}
            }
            result+=".";
            return result;
        }
    }

    public boolean isTeaching(Student student){
        if(student!=null&&student.getKlass().isIn(classes)){return  true;}
        else {return false;}
    }
    public String introduceWith(Student student) {
        if(student!=null) {
            if (this.isTeaching(student)) {
                return super.introduce() + " I am a " + "Teacher" + ". I teach " + student.getName() + ".";
            } else {
                return super.introduce() + " I am a " + "Teacher" + ". I don't teach " + student.getName() + ".";
            }
        }else{
            return "input null.";
        }
    }

    public String addStudent(Student student, Klass klass) {
        if(student!=null) {
            return "I am " + this.getName() + ". I know " + student.getName() + " has joined Class " + klass.getKlass() + ".";
        }else{
            return "input null.";
        }
    }

    public String addClassLeader(Student leader, Klass klass) {
        if(leader!=null||klass!=null) {
        return "I am "+this.getName()+". I know "+leader.getName()+" become Leader of Class "+klass.getKlass()+"." ;
    }else{
        return "input null.";
    }
    }
}
