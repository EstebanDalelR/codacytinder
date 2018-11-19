package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.List;
import okio.BufferedSource;

public interface PushObserver {
    /* renamed from: a */
    public static final PushObserver f22047a = new C72131();

    /* renamed from: com.squareup.okhttp.internal.framed.PushObserver$1 */
    static class C72131 implements PushObserver {
        public boolean onHeaders(int i, List<C6028c> list, boolean z) {
            return true;
        }

        public boolean onRequest(int i, List<C6028c> list) {
            return true;
        }

        public void onReset(int i, ErrorCode errorCode) {
        }

        C72131() {
        }

        public boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
            bufferedSource.skip((long) i2);
            return true;
        }
    }

    boolean onData(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, List<C6028c> list, boolean z);

    boolean onRequest(int i, List<C6028c> list);

    void onReset(int i, ErrorCode errorCode);
}
