import java.util.List;

/**
 * Created by tyw on 16-1-9.
 */
public class Klass {
    private int klass;
    private Student leader;
    private Teacher teacher;
    private Listen listen;
    private Komputer komputer;

    public Klass(int klass) {

        this.klass=klass;
    }
    public Klass(int klass,Teacher teacher) {

        this.klass=klass;
        this.teacher=teacher;
        teacher.setClass(this);
    }
    //当有了自定义的构造函数后，会默认把系统原先的无参的空构造函数覆盖掉
    public Klass() {
       // this.leader=false;
    }
    public void setListen(Listen listen){
        this.listen=listen;
    }
    public String executeAddStudent(Student student,Klass klass){
        return listen.listenAddStudent(student,klass);
    }
    public String executeAssignLeader(Student leader,Klass klass){
        return listen.listenAssignLeader(leader,klass);
    }
    public Teacher setTeacher(Teacher teacher){
        if(teacher!=null) {
            this.teacher = teacher;
            this.teacher.setClass(this);
        }
        return this.teacher;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }


    public int getKlass(){return klass;}

    public Student getLeader(){return leader;}

    public String assignLeader(Student leader) {
        if(leader!=null) {
            if (this.equals(leader.getKlass())) {
                this.leader = leader;
                if (this.teacher != null) {
                //    this.teacher.addStudent(leader, this);
                //    System.out.print(leader);
                    this.setListen(this.teacher);
                 //   System.out.print(this.listen);
                    this.executeAssignLeader(leader,this);
                    if(this.komputer!=null) {
                        this.setListen(this.komputer);
                        this.executeAssignLeader(leader, this);
                    }
                }
                return "yes";
            } else {
                return "It is not one of us.";
            }
        }else{
            return "input null.";
        }
    }

    public Klass appendMember(Student student) {
        if(student!=null) {
            student.setKlass(this);
            if (this.teacher != null) {
                this.teacher.addStudent(student, this);
                this.setListen(this.teacher);
                this.executeAddStudent(student,this);
                if(this.komputer!=null) {
                    this.setListen(this.komputer);
                    this.executeAddStudent(student, this);
                }
            }
        }
            return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass1 = (Klass) o;

        if (klass != klass1.klass) return false;
        if (leader != null ? !leader.equals(klass1.leader) : klass1.leader != null) return false;
        return teacher != null ? teacher.equals(klass1.teacher) : klass1.teacher == null;

    }

    @Override
    public int hashCode() {
        int result = klass;
        result = 31 * result + (leader != null ? leader.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        return result;
    }

    public boolean isIn(List<Klass> classes){
        int flag=0;
        if(classes!=null) {
            for (int i = 0; i < classes.size(); i++) {
                if (this.equals(classes.get(i))) {
                    flag = 1;
                }
            }
        }
        if(flag!=0){
            return true;
        }else {
            return false;
        }
    }
    public void setKomputer(Komputer komputer){
     this.komputer=komputer;
    }
}
