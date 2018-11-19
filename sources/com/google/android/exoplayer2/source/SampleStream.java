package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

public interface SampleStream {
    boolean isReady();

    void maybeThrowError() throws IOException;

    int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z);

    int skipData(long j);
}
