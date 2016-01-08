
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by tyw on 16-1-9.
 */
public class WorkTest {
    @Test
    public void should_worker_test_introduce_return_name_age_and_work(){
        assertThat(new Worker("Tom",21).introduce(),is("My name is Tom. I am 21 years old. I am a Worker. I have a job."));
    }
}
