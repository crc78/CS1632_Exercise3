import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.*;
import org.hamcrest.*;

public class CreateBlockTest {

    @Test
    public void testCreateBlock1(){
      LaboonCoin l = new LaboonCoin();
      assertThat(l.createBlock("asdf",1,2,3), instanceOf(String.class));
    }

    @Test
    public void testCreatBlock2(){
      LaboonCoin l = new LaboonCoin();
      String returnValue = l.createBlock("asdf",1,2,3);
      assertFalse(returnValue.isEmpty());
    }

    @Test
    public void testCreateBlock3(){
      LaboonCoin l = new LaboonCoin();
      String returnVal1 = l.createBlock("not hotdog",1,2,3);
      String returnVal2 = l.createBlock("not hotdog", 1,2,3);
      assertTrue(returnVal1.equals(returnVal2));
    }

    @Test
    public void testCreateBlock4(){
      LaboonCoin l = new LaboonCoin();
      String returnValue = l.createBlock("not hotdog", 840293,20394,1231231231);

      assertTrue(returnValue.contains("not hotdog"));
      assertTrue(returnValue.contains("cd265"));
      assertTrue(returnValue.contains("4faa"));
      assertTrue(returnValue.contains("496318ff"));
    }

}
