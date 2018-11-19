package retrofit.client;

import java.io.IOException;

public interface Client {

    public interface Provider {
        Client get();
    }

    C19370e execute(C19369d c19369d) throws IOException;
}
