import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{
    @Test
    public void test_Given_aTestString_When_CallingMethodToGetString_Then_StringShouldMatch()
    {
        //arrange

        //act
        var actual  String = Main.GetTestString();

        //assert
        Assertions.assertEquals(expected "maven test", actual);
    }
}
