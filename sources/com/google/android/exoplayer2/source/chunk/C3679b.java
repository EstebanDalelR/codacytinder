package com.google.android.exoplayer2.source.chunk;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C3623d;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper.TrackOutputProvider;

/* renamed from: com.google.android.exoplayer2.source.chunk.b */
final class C3679b implements TrackOutputProvider {
    /* renamed from: a */
    private final int[] f11413a;
    /* renamed from: b */
    private final SampleQueue[] f11414b;

    public C3679b(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.f11413a = iArr;
        this.f11414b = sampleQueueArr;
    }

    public TrackOutput track(int i, int i2) {
        for (i = 0; i < this.f11413a.length; i++) {
            if (i2 == this.f11413a[i]) {
                return this.f11414b[i];
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unmatched track of type: ");
        stringBuilder.append(i2);
        Log.e("BaseMediaChunkOutput", stringBuilder.toString());
        return new C3623d();
    }

    /* renamed from: a */
    public int[] m13943a() {
        int[] iArr = new int[this.f11414b.length];
        for (int i = 0; i < this.f11414b.length; i++) {
            if (this.f11414b[i] != null) {
                iArr[i] = this.f11414b[i].m13880c();
            }
        }
        return iArr;
    }
}
