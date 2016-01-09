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

    public Student assignLeader(Student leader) {
        this.leader=leader;
        return leader;
    }

}
