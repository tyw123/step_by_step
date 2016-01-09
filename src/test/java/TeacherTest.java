import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by tyw on 16-1-9.
 */
public class TeacherTest {
    Klass sndClass=new Klass(2);
    Klass fstClass=new Klass(1);
    @Test
    public void should_teacher_test_introduce_return_name_age_and_klass(){
        assertThat(new Teacher("Tom",21,sndClass).introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));
    }
    @Test
    public void should_teacher_test_introduce_return_name_and_age(){
        assertThat(new Teacher("Tom", 21).introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }
    @Test
    public void should_teacher_test_introduceWith_return_name_age_and_no_student(){
        assertThat(new Teacher("Tom", 21,sndClass).introduceWith(new Student("Jerry",21,fstClass)),is("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry."));
    }
    @Test
    public void should_teacher_test_introduceWith_return_name_age_and_student(){
        assertThat(new Teacher("Tom", 21,sndClass).introduceWith(new Student("Jerry",21,sndClass)),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."));
    }
}
