package okhttp3;

import java.net.Socket;
import javax.annotation.Nullable;

public interface Connection {
    @Nullable
    C15955k handshake();

    Protocol protocol();

    C15969u route();

    Socket socket();
}
