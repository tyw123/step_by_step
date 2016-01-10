import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tyw on 16-1-9.
 */
public class KlassTest {
    Klass secondClass =new Klass(2);
    Klass firstClass=new Klass(1);
    @Test
    public void should_klass_getKlass_return_class(){

        assertThat(secondClass.getKlass(),is(2));
    }
    @Test
    public void should_klass_assignLeader_return_student_class(){
        Student tom=new Student("Tom", secondClass);
        secondClass.assignLeader(tom);
       // System.out.print(tom.getKlass().getLeader());
        assertThat(secondClass.getLeader(),is(tom.getKlass().getLeader()));
       // System.out.print(tom.getKlass().getLeader());
    }
    @Test
    public void should_klass_appendMember_return_student_class(){
        Student tom=new Student("Tom");
        assertThat(secondClass.appendMember(tom),is(tom.getKlass()));
    }
    @Test
    public void should_klass_assignLeader_return_failed(){

        Student tom=new Student("Tom",firstClass);
        assertThat(secondClass.assignLeader(tom),is("It is not one of us."));
    }
    @Test
    public void should_klass_isIn_return_right(){
        Klass thirdClass=new Klass(3);
        List<Klass> klasses= new ArrayList<Klass>();
        klasses.add(firstClass);
        klasses.add(secondClass);
        assertThat(secondClass.isIn(klasses),is(true));
        assertThat(thirdClass.isIn(klasses),is(false));
    }
    @Test
    public void should_klass_setTeacher_return_right(){
        Teacher Alice=new Teacher("Alice");
        Klass thirdClass=new Klass(3);
        thirdClass.setTeacher(Alice);
        assertThat(thirdClass.getTeacher(),is(Alice));
        assertThat(thirdClass.isIn(Alice.getClasses()),is(true));
    }

}
