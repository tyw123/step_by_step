import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by tyw on 16-1-9.
 */
public class TeacherTest {
    Klass sndClass=new Klass(2);
    Klass fstClass=new Klass(1);
    List<Klass>  klass=new ArrayList();
    List<Klass> klasses=new ArrayList();
    List<Klass> emptyClasses=new ArrayList();

    @Before
    public void ready(){
        klass.add(sndClass);
        klasses.add(fstClass);
        klasses.add(sndClass);
    }

    @Test
    public void should_teacher_test_introduce_return_name_age_and_klass(){
        assertThat(new Teacher("Tom",21,klass).introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));

    }
    @Test
    public void should_teacher_test_introduce_return_name_and_age(){
        assertThat(new Teacher("Tom", 21).introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_teacher_test_introduceWith_return_name_age_and_no_student(){
        assertThat(new Teacher("Tom", 21,klass).introduceWith(new Student("Jerry",21,fstClass)),is("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry."));
    }
    @Test
    public void should_teacher_test_introduceWith_return_name_age_and_student(){
        assertThat(new Teacher("Tom", 21,klass).introduceWith(new Student("Jerry",21,sndClass)),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."));
    }
    @Test
    public void should_teacher_test_introduce_return_classes(){
        assertThat(new Teacher("Tom", 21,klasses).introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 1, 2."));
    }
    @Test
    public void should_teacher_test_introduce_return_empty_classes(){
        assertThat(new Teacher("Tom", 21,emptyClasses).introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_teacher_test_setClass_return_right(){
        Teacher Tom=new Teacher("Tom");
        Klass thridClass=new Klass(3);
        Tom.setClass(thridClass);
        assertThat(thridClass.getTeacher(),is(Tom));
    }
    @Test
    public void should_teacher_addStudent_return_name_student_and_class(){
        Student Jerry=new Student("Jerry");
        Teacher tom=new Teacher("Tom",sndClass);
        sndClass.appendMember(Jerry);
        assertThat(tom.addStudent(Jerry, sndClass),is("I am Tom. I know Jerry has joined Class 2."));
    }
    @Test
    public void should_teacher_addClassLeader_return_name_student_and_class(){
        Student Jerry=new Student("Jerry",sndClass);
        Teacher tom=new Teacher("Tom",sndClass);
        sndClass.assignLeader(Jerry);
        assertThat(tom.addClassLeader(Jerry, sndClass),is("I am Tom. I know Jerry become Leader of Class 2."));
    }
}
