package cn.arch.mcp.seek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RuntimeUtilsTest {

    @Test
    public void testGetAvailableProcessors() {
        int processors = RuntimeUtils.getAvailableProcessors();
        assertTrue(processors > 0, "CPU核心数应该大于0");
        assertEquals(processors, Runtime.getRuntime().availableProcessors(), 
            "获取的CPU核心数应该与系统报告的一致");
    }
}