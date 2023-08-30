import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class chandrayantest {
    @Test
    public void testChandrayan() {
        chandrayan ch = new chandrayan(0, 0, 0, 'N');

        // Test:1
        assertEquals('N', ch.getDirection());
        assertEquals(0, ch.getX());
        assertEquals(0, ch.getY());
        assertEquals(0, ch.getZ());

        // Test:2
        chandrayan obj = new chandrayan(0, 0, 0, 'N');
        obj.sendCommands(new char[] { 'f', 'r', 'l', 'b', 'f', 'l' });

        assertEquals('W', obj.getDirection());
        assertEquals(0, obj.getX());
        assertEquals(1, obj.getY());
        assertEquals(0, obj.getZ());

        chandrayan obj2 = new chandrayan(0, 0, 0, 'N');
        obj2.sendCommands(new char[] { 'l', 'f', 'r', 'u', 'b' });
        assertEquals('U', obj2.getDirection());
        assertEquals(1, obj2.getX());
        assertEquals(0, obj2.getY());
        assertEquals(-1, obj2.getZ());

        chandrayan obj3 = new chandrayan(0, 0, 0, 'N');
        obj3.sendCommands(new char[] { 'r', 'u', 'f', 'b', 'l' });
        assertEquals('N', obj3.getDirection());
        assertEquals(0, obj3.getX());
        assertEquals(0, obj3.getY());
        assertEquals(0, obj3.getZ());

        chandrayan obj4 = new chandrayan(0, 0, 0, 'N');
        obj4.sendCommands(new char[] { 'l', 'u', 'f', 'r', 'l' });
        assertEquals('W', obj4.getDirection());
        assertEquals(0, obj4.getX());
        assertEquals(0, obj4.getY());
        assertEquals(1, obj4.getZ());

    }
}
