import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tyw on 16-1-9.
 */
public class KlassTest {
    @Test
    public void should_klass_getKlass_return_class(){

        assertThat(new Klass(2).getKlass(),is(2));
    }
    @Test
    public void should_klass_assignLeader_return_student_class(){
        Klass sndClass=new Klass(2);
        Student tom=new Student("Tom",sndClass);
        sndClass.assignLeader(tom);
       // System.out.print(tom.getKlass().getLeader());
        assertThat(sndClass.getLeader(),is(tom.getKlass().getLeader()));
       // System.out.print(tom.getKlass().getLeader());
    }
    @Test
    public void should_klass_appendMember_return_student_class(){
        Klass sndClass=new Klass(2);
        Student tom=new Student("Tom");
        assertThat(sndClass.appendMember(tom),is(tom.getKlass()));
    }
    @Test
    public void should_klass_assignLeader_return_failed(){
        Klass secondClass=new Klass(2);
        Klass firstClass=new Klass(1);
        Student tom=new Student("Tom",firstClass);
        assertThat(secondClass.assignLeader(tom),is("It is not one of us."));
    }
}
