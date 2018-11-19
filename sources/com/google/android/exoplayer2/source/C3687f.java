package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.f */
public final class C3687f implements SampleStream {
    public boolean isReady() {
        return true;
    }

    public void maybeThrowError() throws IOException {
    }

    public int skipData(long j) {
        return 0;
    }

    public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
        decoderInputBuffer.m7340a(4);
        return -4;
    }
}
