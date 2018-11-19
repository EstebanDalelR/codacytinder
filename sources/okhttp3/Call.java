package okhttp3;

import java.io.IOException;

public interface Call extends Cloneable {

    public interface Factory {
        Call newCall(C15963q c15963q);
    }

    void cancel();

    Call clone();

    void enqueue(Callback callback);

    C15966s execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C15963q request();
}
