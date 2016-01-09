import java.util.Arrays;
import java.util.List;

/**
 * Created by tyw on 16-1-9.
 */
public class Teacher extends Person{
    private Klass[] classes;

    public Teacher(String name, int age, Klass[]classes) {//居然还跟参数顺序有关系
        super(name, age);
        this.classes=classes;
    }



    public Teacher(String name, int age) {
        super(name, age);
    }

    public String introduce(){
        if(this.classes==null||this.classes.length==0){
            return super.introduce()+" I am a "+"Teacher"+". I teach No Class.";
        }else {
            String result=super.introduce()+" I am a "+"Teacher"+". I teach Class ";
            for(int i=0;i<classes.length;i++){
                result+=classes[i].getKlass();
                if(i!=classes.length-1){result+=", ";}
            }
            result+=".";
            return result;
        }
    }

    public String introduceWith(Student student) {
        int flag=0;
        for (int i=0;i<classes.length;i++) {
            if(classes[i]==student.getKlass()){flag=1;}
        }
        if(flag!=0){
            return super.introduce()+" I am a "+"Teacher"+". I teach "+ student.getName()+".";
        }else {
            return super.introduce()+" I am a "+"Teacher"+". I don't teach "+ student.getName()+".";
        }
    }
}
