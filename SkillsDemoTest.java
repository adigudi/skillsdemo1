import static org.junit.Assert.*;
import org.junit.*;

public class SkillsDemoTest{
    @Test
    public void testAddition(){
        assertEquals(4, SkillsDemo.addition(2, 2));
    }
}