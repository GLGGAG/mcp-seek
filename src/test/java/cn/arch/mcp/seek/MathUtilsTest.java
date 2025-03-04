package cn.arch.mcp.seek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        assertEquals(4, MathUtils.add(2, 2));
        assertEquals(0, MathUtils.add(0, 0));
        assertEquals(-1, MathUtils.add(-2, 1));
        assertEquals(Integer.MAX_VALUE, MathUtils.add(Integer.MAX_VALUE - 1, 1));
    }
}