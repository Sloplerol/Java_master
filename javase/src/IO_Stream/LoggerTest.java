package IO_Stream;

public class LoggerTest {
    public static void main(String[] args) {
        LogClass.LogMsg("修改了打印的默认输出方向");
        LogClass.LogMsg("用户验证失败，正在强制退出系统");
        LogClass.LogMsg("WARRNING：系统因root文件被破坏，请快速启动紧急措施");
    }
}
