import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.pjatk.Hamming;


import static org.junit.jupiter.api.Assertions.*;
public class HammingTest {
    @Test
    public void testHammingEmpty() throws Exception{
        assertEquals(Hamming.distance("", ""), 0);
    }
    @Test
    public void testHammingIdentical() throws Exception{
        assertEquals(Hamming.distance("A", "A"), 0);
    }
    @Test
    public void testHammingDifferent() throws Exception{
        assertEquals(Hamming.distance("G", "T"), 1);
    }
    @Test
    public void testHammingIdenticalLong() throws Exception{
        assertEquals(Hamming.distance("GGACTGAAATCTG", "GGACTGAAATCTG"), 0);
    }
    @Test
    public void testHammingDifferentLong() throws Exception{
        assertEquals(Hamming.distance("GGACGGATTCTG", "AGGACGGATTCT"), 9);
    }
    @Test
    public void testDisallowFirstStrandLonger(){
        assertThrows(Exception.class, () -> { Hamming.distance("AATG", "AAA"); } );
    }
    @Test
    public void testDisallowSecondStrandLonger(){
        assertThrows(Exception.class, () -> { Hamming.distance("ATA", "AGTG"); } );
    }
    @Test
    public void testDisallowFirstStrandEmpty(){
        assertThrows(Exception.class, () -> { Hamming.distance("", "G"); } );
    }
    @Test
    public void testDisallowSecondStrandEmpty(){
        assertThrows(Exception.class, () -> { Hamming.distance("G", ""); } );
    }
    @Test
    public void testClassInstance(){
        assertEquals(Hamming.class, new Hamming().getClass());
    }

}
