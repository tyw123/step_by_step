import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tyw on 16-1-8.
 */
public class StudentTest {
    @Test
    public void should_student_test_introduce_return_name_age_and_klass(){
        assertThat(new Student("Tom",21,2).introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
    }
}
