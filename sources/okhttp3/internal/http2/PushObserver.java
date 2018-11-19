package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

public interface PushObserver {
    /* renamed from: a */
    public static final PushObserver f49357a = new C176651();

    /* renamed from: okhttp3.internal.http2.PushObserver$1 */
    class C176651 implements PushObserver {
        public boolean onHeaders(int i, List<C15929a> list, boolean z) {
            return true;
        }

        public boolean onRequest(int i, List<C15929a> list) {
            return true;
        }

        public void onReset(int i, ErrorCode errorCode) {
        }

        C176651() {
        }

        public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip((long) i2);
            return true;
        }
    }

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<C15929a> list, boolean z);

    boolean onRequest(int i, List<C15929a> list);

    void onReset(int i, ErrorCode errorCode);
}
