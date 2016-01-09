import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tyw on 16-1-8.
 */
public class StudentTest {
    Klass sndClass=new Klass(2);
    @Test
    public void should_student_test_introduce_return_name_age_and_klass(){
        assertThat(new Student("Tom",21,sndClass).introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
    }
    @Test
    public void should_student_test_introduce_return_name_age_and_is_klass(){
        assertThat(new Student("Tom",21,sndClass,true).introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2."));
    }
}
