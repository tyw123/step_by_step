/**
 * Created by tyw on 16-1-9.
 */
public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }
    public String introduce(){
       return super.introduce()+" I am a "+this.getClass().getName()+". I have a job." ;
    }
}
