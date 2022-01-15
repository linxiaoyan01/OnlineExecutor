package top.kaluna.OnlineExecutor.execute;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yuery
 * @date 2022/1/13/0013 - 21:02
 */
public class HackInputStream extends InputStream {
    public final static ThreadLocal<InputStream> holdInputStream = new ThreadLocal<>();

    @Override
    public int read() throws IOException {
        return 0;
    }

    public InputStream get() {
        return holdInputStream.get();
    }

    public void set(String systemIn) {
        holdInputStream.set(new ByteArrayInputStream(systemIn.getBytes()));
    }

    @Override
    public void close() {
        holdInputStream.remove();
    }
}
