/**
 * Created by tyw on 16-1-9.
 */
public class Klass {
    private int klass;
    private Student leader;

    public Klass(int klass) {

        this.klass=klass;
      //  this.leader=false;
    }

    public Klass() {//当有了自定义的构造函数后，会默认把系统原先的无参的空构造函数覆盖掉
       // this.leader=false;
    }


    public int getKlass(){return klass;}

    public Student getLeader(){return leader;}

    public String assignLeader(Student leader) {
        if(leader.getKlass()==this){
            this.leader=leader;
            return "yes";
        }else {
            return "It is not one of us.";
        }
    }

    public Klass appendMember(Student student) {
        student.setKlass(this);
        return this;
    }
}
