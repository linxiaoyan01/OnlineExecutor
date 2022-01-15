package top.kaluna.OnlineExecutor.execute;

/**
 * @author Yuery
 * @date 2022/1/13/0013 - 21:20
 */
public class HotSwapClassLoader extends ClassLoader{
    public HotSwapClassLoader() {
        super(HotSwapClassLoader.class.getClassLoader());
    }

    public Class loadByte(byte[] classBytes) {
        return defineClass(null, classBytes, 0, classBytes.length);
    }
}
