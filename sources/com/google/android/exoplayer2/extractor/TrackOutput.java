package com.google.android.exoplayer2.extractor;

import android.support.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.C2302k;
import java.io.IOException;
import java.util.Arrays;

public interface TrackOutput {

    /* renamed from: com.google.android.exoplayer2.extractor.TrackOutput$a */
    public static final class C2055a {
        /* renamed from: a */
        public final int f5637a;
        /* renamed from: b */
        public final byte[] f5638b;
        /* renamed from: c */
        public final int f5639c;
        /* renamed from: d */
        public final int f5640d;

        public C2055a(int i, byte[] bArr, int i2, int i3) {
            this.f5637a = i;
            this.f5638b = bArr;
            this.f5639c = i2;
            this.f5640d = i3;
        }

        public boolean equals(@Nullable Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C2055a c2055a = (C2055a) obj;
                    if (this.f5637a != c2055a.f5637a || this.f5639c != c2055a.f5639c || this.f5640d != c2055a.f5640d || Arrays.equals(this.f5638b, c2055a.f5638b) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f5637a * 31) + Arrays.hashCode(this.f5638b)) * 31) + this.f5639c) * 31) + this.f5640d;
        }
    }

    void format(Format format);

    int sampleData(ExtractorInput extractorInput, int i, boolean z) throws IOException, InterruptedException;

    void sampleData(C2302k c2302k, int i);

    void sampleMetadata(long j, int i, int i2, int i3, C2055a c2055a);
}
