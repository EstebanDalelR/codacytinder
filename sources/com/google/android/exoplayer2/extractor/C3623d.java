package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.TrackOutput.C2055a;
import com.google.android.exoplayer2.util.C2302k;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.d */
public final class C3623d implements TrackOutput {
    public void format(Format format) {
    }

    public void sampleMetadata(long j, int i, int i2, int i3, C2055a c2055a) {
    }

    public int sampleData(ExtractorInput extractorInput, int i, boolean z) throws IOException, InterruptedException {
        extractorInput = extractorInput.skip(i);
        if (extractorInput != -1) {
            return extractorInput;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void sampleData(C2302k c2302k, int i) {
        c2302k.m8390d(i);
    }
}
