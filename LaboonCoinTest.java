import static org.junit.Assert.*;

import org.junit.*;

public class LaboonCoinTest {

    // Assert that creating a new LaboonCoin instance
    // does not return a null reference
    @Test
    public void testLaboonCoinExists() {
	LaboonCoin l = new LaboonCoin();
	assertNotNull(l);
    }

    //Assert that hash function will return a value on empty string
    @Test
    public void testHashWorksOnEmptyString() {
    	LaboonCoin l = new LaboonCoin();
    	int t = l.hash("");
    	assertNotNull(t);
    }
    //assert that hash function will return a value from a string
    @Test
    public void testHashReturnsValue(){
    	LaboonCoin l = new LaboonCoin();
    	int t= l.hash("boo");
    	boolean r=false;
    	if(t>0){
    		r=true;
    	}
    	assertTrue(r);
    	
    }
    //assert that hash function will return the correct value bsed on the maths
    @Test
    public void testHashReturnsCorrectValue() {
    	LaboonCoin l = new LaboonCoin();
    	int t = l.hash("boo");
    	String a = "" + t;
    	String b = "1428150834";
    	assertEquals(a,b);
    }

    //assert that the valid hash function will accept any int on difficulty zero (test it with an  bit hash value that contains no hex zeros)
    @Test
    public void testValidHashDifficulty0() {
    	LaboonCoin l = new LaboonCoin();
    	assertTrue(l.validHash(0, 1428150834));
    }
    //assert that the 
    @Test
    public void testValidHashFalseDifficulty3() {
    	LaboonCoin l = new LaboonCoin();
    	assertFalse(l.validHash(3, 1428150834));
    }

    //assert that the function will return true with a hash value with 3 zeros proceeding it in hex value
    @Test
    public void testValidHashTrueDifficulty3(){
    	LaboonCoin l = new LaboonCoin();
    	assertTrue(l.validHash(3, 1005884));
    }



}
