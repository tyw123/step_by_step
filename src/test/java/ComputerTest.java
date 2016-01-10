import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by tyw on 16-1-10.
 */
public class ComputerTest {
    Klass sndClass=new Klass(2);
    Komputer Dell=new Komputer("Dell");
    @Test
    public void should_computer_listenAddStudent_return_right(){
        sndClass.setKomputer(Dell);
        Teacher Tom=new Teacher("Tom",sndClass);
        sndClass.appendMember(new Student("Jerry"));
        PrintStream fakedOut = mock(PrintStream.class);
        Dell.say(fakedOut);
        verify(fakedOut).println("I am the Machine. I know Jerry has joined Class 2.");
    }
    @Test
    public void should_computer_listenAssignLeader_return_right(){
        sndClass.setKomputer(Dell);
        Teacher Tom=new Teacher("Tom",sndClass);
        sndClass.assignLeader(new Student("Jerry",sndClass));
        PrintStream fakedOut = mock(PrintStream.class);
        Dell.say(fakedOut);
        verify(fakedOut).println("I am the Machine. I know Jerry become Leader of Class 2.");
    }
}
