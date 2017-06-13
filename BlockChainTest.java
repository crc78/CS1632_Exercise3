import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.*;
import org.hamcrest.*;

public class BlockChainTest {

    @Test
    public void testBlockchain1(){
      LaboonCoin l = new LaboonCoin();
      l.blockchain.add("fake block 1");
      l.blockchain.add("fake block 2");
      assertThat(l.getBlockChain(), instanceOf(String.class));
    }

    @Test
    public void testBlockchain2(){
      LaboonCoin l = new LaboonCoin();
      l.blockchain.add("fake block 1");
      l.blockchain.add("fake block 2");
      String returnValue = l.getBlockChain();

      assertTrue(returnValue.split("\n").length == 2);
    }

    @Test
    public void testBlockchain3(){
      LaboonCoin l = new LaboonCoin();
      l.blockchain.add("another fake block");
      l.blockchain.add("so many fake blocks");
      String bc = l.getBlockChain();

      assertTrue(bc.contains("another fake block"));
      assertTrue(bc.contains("so many fake blocks"));
    }

    @Test
    public void testBlockchain4(){
      LaboonCoin l = new LaboonCoin();
      l.blockchain.add("fake blocks 5ever");
      l.blockchain.add("look its a fake block");
      l.blockchain.add("take a look at that fake block");
      String bc = l.getBlockChain();
      String[] bcArray = bc.split("\n");

      assertTrue(bcArray[0].equals("fake blocks 5ever"));
      assertTrue(bcArray[1].equals("look its a fake block"));
      assertTrue(bcArray[2].equals("take a look at that fake block"));
    }

}
