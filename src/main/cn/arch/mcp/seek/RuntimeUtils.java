package cn.arch.mcp.seek;

/**
 * 系统运行时工具类
 */
public class RuntimeUtils {
    
    /**
     * 获取系统可用的CPU核心数
     * @return CPU核心数
     */
    public static int getAvailableProcessors() {
        return Runtime.getRuntime().availableProcessors();
    }
}