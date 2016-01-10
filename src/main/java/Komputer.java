import java.io.PrintStream;

/**
 * Created by tyw on 16-1-10.
 */
public class Komputer implements Listen{
    String name;
    String forPrint;
    public Komputer(String name) {
        this.name=name;
    }

    public String listenAddStudent(Student student, Klass klass) {
        if(student!=null) {
            forPrint="I am the Machine"  + ". I know " + student.getName() + " has joined Class " + klass.getKlass() + ".";
            return forPrint;
        }else{
            return "input null.";
        }
    }

    public String listenAssignLeader(Student leader, Klass klass) {
        if(leader!=null||klass!=null) {
            forPrint="I am the Machine"+". I know "+leader.getName()+" become Leader of Class "+klass.getKlass()+".";
            return  forPrint;
        }else{
            return "input null.";
        }
    }

    public void say(PrintStream out) {
        out.println(forPrint);
    }
}
