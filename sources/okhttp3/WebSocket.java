package okhttp3;

import javax.annotation.Nullable;
import okio.ByteString;

public interface WebSocket {

    public interface Factory {
        WebSocket newWebSocket(C15963q c15963q, C15970v c15970v);
    }

    void cancel();

    boolean close(int i, @Nullable String str);

    long queueSize();

    C15963q request();

    boolean send(String str);

    boolean send(ByteString byteString);
}
