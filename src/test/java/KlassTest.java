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
       // System.out.print(tom.getKlass().getLeader());
        assertThat(sndClass.assignLeader(tom),is(tom.getKlass().getLeader()));
       // System.out.print(tom.getKlass().getLeader());
    }
//    @Test
//    public void should_klass_appendMember_return_student_class(){
//        Student tom=new Student("Tom");
//        // System.out.print(tom.getKlass().getLeader());
//        assertThat(new Klass().appendMember(tom),is(tom.getKlass().getLeader()));
//        // System.out.print(tom.getKlass().getLeader());
//    }
}
