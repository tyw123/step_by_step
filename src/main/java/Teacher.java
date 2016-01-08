/**
 * Created by tyw on 16-1-9.
 */
public class Teacher extends Person{
    private int klass;
    public Teacher(String name, int age, int klass) {//居然还跟参数顺序有关系
        super(name, age);
        this.klass=klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }
    public String introduce(){
        if(this.klass!=0){
            return super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
        }else{
            return super.introduce()+" I am a Teacher. I teach No Class.";
        }

    }
}
