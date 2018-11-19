package com.squareup.okhttp.internal.framed;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import okio.C18549c;

public interface FrameWriter extends Closeable {
    void ackSettings(C6038i c6038i) throws IOException;

    void connectionPreface() throws IOException;

    void data(boolean z, int i, C18549c c18549c, int i2) throws IOException;

    void flush() throws IOException;

    void goAway(int i, ErrorCode errorCode, byte[] bArr) throws IOException;

    void headers(int i, List<C6028c> list) throws IOException;

    int maxDataLength();

    void ping(boolean z, int i, int i2) throws IOException;

    void pushPromise(int i, int i2, List<C6028c> list) throws IOException;

    void rstStream(int i, ErrorCode errorCode) throws IOException;

    void settings(C6038i c6038i) throws IOException;

    void synReply(boolean z, int i, List<C6028c> list) throws IOException;

    void synStream(boolean z, boolean z2, int i, int i2, List<C6028c> list) throws IOException;

    void windowUpdate(int i, long j) throws IOException;
}
