package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2310s;
import java.util.Collections;
import java.util.List;

public interface TsPayloadReader {

    public interface Factory {
        SparseArray<TsPayloadReader> createInitialPayloadReaders();

        TsPayloadReader createPayloadReader(int i, C2105b c2105b);
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$a */
    public static final class C2104a {
        /* renamed from: a */
        public final String f5964a;
        /* renamed from: b */
        public final int f5965b;
        /* renamed from: c */
        public final byte[] f5966c;

        public C2104a(String str, int i, byte[] bArr) {
            this.f5964a = str;
            this.f5965b = i;
            this.f5966c = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$b */
    public static final class C2105b {
        /* renamed from: a */
        public final int f5967a;
        /* renamed from: b */
        public final String f5968b;
        /* renamed from: c */
        public final List<C2104a> f5969c;
        /* renamed from: d */
        public final byte[] f5970d;

        public C2105b(int i, String str, List<C2104a> list, byte[] bArr) {
            this.f5967a = i;
            this.f5968b = str;
            if (list == null) {
                i = Collections.emptyList();
            } else {
                i = Collections.unmodifiableList(list);
            }
            this.f5969c = i;
            this.f5970d = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsPayloadReader$c */
    public static final class C2106c {
        /* renamed from: a */
        private final String f5971a;
        /* renamed from: b */
        private final int f5972b;
        /* renamed from: c */
        private final int f5973c;
        /* renamed from: d */
        private int f5974d;
        /* renamed from: e */
        private String f5975e;

        public C2106c(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C2106c(int i, int i2, int i3) {
            if (i != Integer.MIN_VALUE) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(i);
                stringBuilder.append("/");
                i = stringBuilder.toString();
            } else {
                i = "";
            }
            this.f5971a = i;
            this.f5972b = i2;
            this.f5973c = i3;
            this.f5974d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void m7534a() {
            this.f5974d = this.f5974d == Integer.MIN_VALUE ? this.f5972b : this.f5974d + this.f5973c;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f5971a);
            stringBuilder.append(this.f5974d);
            this.f5975e = stringBuilder.toString();
        }

        /* renamed from: b */
        public int m7535b() {
            m7533d();
            return this.f5974d;
        }

        /* renamed from: c */
        public String m7536c() {
            m7533d();
            return this.f5975e;
        }

        /* renamed from: d */
        private void m7533d() {
            if (this.f5974d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void consume(C2302k c2302k, boolean z) throws ParserException;

    void init(C2310s c2310s, ExtractorOutput extractorOutput, C2106c c2106c);

    void seek();
}
