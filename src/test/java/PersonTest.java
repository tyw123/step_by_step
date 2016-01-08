import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tyw on 16-1-8.
 */
public class PersonTest {
    @Test
    public void should_person_test_introduce_return_name_and_age(){
        assertThat(new Person("Tom",21).introduce(),is("My name is Tom. I am 21 years old."));
    }


}
