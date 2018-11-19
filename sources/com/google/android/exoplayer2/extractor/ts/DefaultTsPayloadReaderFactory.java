package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.C2105b;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory;
import com.google.android.exoplayer2.util.C2302k;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DefaultTsPayloadReaderFactory implements Factory {
    /* renamed from: a */
    private final int f11137a;
    /* renamed from: b */
    private final List<Format> f11138b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public DefaultTsPayloadReaderFactory() {
        this(0);
    }

    public DefaultTsPayloadReaderFactory(int i) {
        this(i, Collections.emptyList());
    }

    public DefaultTsPayloadReaderFactory(int i, List<Format> list) {
        this.f11137a = i;
        if (m13761a(32) == 0 && list.isEmpty() != 0) {
            list = Collections.singletonList(Format.createTextSampleFormat(null, "application/cea-608", null, null));
        }
        this.f11138b = list;
    }

    public SparseArray<TsPayloadReader> createInitialPayloadReaders() {
        return new SparseArray();
    }

    public TsPayloadReader createPayloadReader(int i, C2105b c2105b) {
        TsPayloadReader tsPayloadReader = null;
        switch (i) {
            case 2:
                return new C3658n(new C3652g());
            case 3:
            case 4:
                return new C3658n(new C3657l(c2105b.f5968b));
            case 15:
                if (m13761a(2) == 0) {
                    tsPayloadReader = new C3658n(new C3649d(false, c2105b.f5968b));
                }
                return tsPayloadReader;
            case 17:
                if (m13761a(2) == 0) {
                    tsPayloadReader = new C3658n(new C3656k(c2105b.f5968b));
                }
                return tsPayloadReader;
            case 21:
                return new C3658n(new C3655j());
            case 27:
                if (m13761a(4) == 0) {
                    tsPayloadReader = new C3658n(new C3653h(m13760a(c2105b), m13761a(1), m13761a(8)));
                }
                return tsPayloadReader;
            case 36:
                return new C3658n(new C3654i(m13760a(c2105b)));
            case 89:
                return new C3658n(new C3651f(c2105b.f5969c));
            case 129:
            case 135:
                return new C3658n(new C3646b(c2105b.f5968b));
            case 130:
            case 138:
                return new C3658n(new C3650e(c2105b.f5968b));
            case 134:
                if (m13761a(16) == 0) {
                    tsPayloadReader = new C3661p(new C3662r());
                }
                return tsPayloadReader;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private C2114q m13760a(C2105b c2105b) {
        if (m13761a(32)) {
            return new C2114q(this.f11138b);
        }
        C2302k c2302k = new C2302k(c2105b.f5970d);
        c2105b = this.f11138b;
        while (c2302k.m8385b() > 0) {
            int d = c2302k.m8389d() + c2302k.m8395g();
            if (c2302k.m8395g() == 134) {
                c2105b = new ArrayList();
                int g = c2302k.m8395g() & 31;
                for (int i = 0; i < g; i++) {
                    int i2;
                    String str;
                    String e = c2302k.m8392e(3);
                    int g2 = c2302k.m8395g();
                    if (((g2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? 1 : null) != null) {
                        i2 = g2 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    c2105b.add(Format.createTextSampleFormat(null, str, null, -1, 0, e, i2, null));
                    c2302k.m8390d(2);
                }
            }
            c2302k.m8388c(d);
        }
        return new C2114q(c2105b);
    }

    /* renamed from: a */
    private boolean m13761a(int i) {
        return (i & this.f11137a) != 0;
    }
}
