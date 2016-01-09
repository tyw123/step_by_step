/**
 * Created by tyw on 16-1-9.
 */
public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name, int age, Klass klass) {//居然还跟参数顺序有关系
        super(name, age);
        this.klass= klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        if(this.klass!=null){
          //  System.out.print(this.getClass().getName());
            return super.introduce()+" I am a "+"Teacher"+". I teach Class "+klass.getKlass()+".";
            //System.out.println();
        }else{
            System.out.print(this.getClass().getName());
            return super.introduce()+" I am a "+"Teacher"+". I teach No Class.";
        }
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getKlass()==klass.getKlass()){
            return super.introduce()+" I am a "+"Teacher"+". I teach "+ student.getName()+".";
        }else {
            return super.introduce()+" I am a "+"Teacher"+". I don't teach "+ student.getName()+".";
        }
    }
}
