package com.google.android.exoplayer2.source.chunk;

import android.support.annotation.Nullable;
import android.util.Log;
import com.google.android.exoplayer2.C2122i;
import com.google.android.exoplayer2.C2162p;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaSourceEventListener.C2177a;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Callback<C3680c>, com.google.android.exoplayer2.upstream.Loader.ReleaseCallback {
    /* renamed from: a */
    public final int f11392a;
    /* renamed from: b */
    long f11393b;
    /* renamed from: c */
    boolean f11394c;
    /* renamed from: d */
    private final int[] f11395d;
    /* renamed from: e */
    private final Format[] f11396e;
    /* renamed from: f */
    private final boolean[] f11397f;
    /* renamed from: g */
    private final T f11398g;
    /* renamed from: h */
    private final SequenceableLoader.Callback<ChunkSampleStream<T>> f11399h;
    /* renamed from: i */
    private final C2177a f11400i;
    /* renamed from: j */
    private final int f11401j;
    /* renamed from: k */
    private final Loader f11402k = new Loader("Loader:ChunkSampleStream");
    /* renamed from: l */
    private final C2191d f11403l = new C2191d();
    /* renamed from: m */
    private final ArrayList<C4371a> f11404m = new ArrayList();
    /* renamed from: n */
    private final List<C4371a> f11405n = Collections.unmodifiableList(this.f11404m);
    /* renamed from: o */
    private final SampleQueue f11406o;
    /* renamed from: p */
    private final SampleQueue[] f11407p;
    /* renamed from: q */
    private final C3679b f11408q;
    /* renamed from: r */
    private Format f11409r;
    @Nullable
    /* renamed from: s */
    private ReleaseCallback<T> f11410s;
    /* renamed from: t */
    private long f11411t;
    /* renamed from: u */
    private long f11412u;

    public interface ReleaseCallback<T extends ChunkSource> {
        void onSampleStreamReleased(ChunkSampleStream<T> chunkSampleStream);
    }

    /* renamed from: com.google.android.exoplayer2.source.chunk.ChunkSampleStream$a */
    public final class C3678a implements SampleStream {
        /* renamed from: a */
        public final ChunkSampleStream<T> f11387a;
        /* renamed from: b */
        final /* synthetic */ ChunkSampleStream f11388b;
        /* renamed from: c */
        private final SampleQueue f11389c;
        /* renamed from: d */
        private final int f11390d;
        /* renamed from: e */
        private boolean f11391e;

        public void maybeThrowError() throws IOException {
        }

        public C3678a(ChunkSampleStream chunkSampleStream, ChunkSampleStream<T> chunkSampleStream2, SampleQueue sampleQueue, int i) {
            this.f11388b = chunkSampleStream;
            this.f11387a = chunkSampleStream2;
            this.f11389c = sampleQueue;
            this.f11390d = i;
        }

        public boolean isReady() {
            if (!this.f11388b.f11394c) {
                if (this.f11388b.m13942a() || !this.f11389c.m13882d()) {
                    return false;
                }
            }
            return true;
        }

        public int skipData(long j) {
            if (!this.f11388b.f11394c || j <= this.f11389c.m13886h()) {
                j = this.f11389c.m13877b(j, true, true);
                if (j == -1) {
                    j = null;
                }
            } else {
                j = this.f11389c.m13891m();
            }
            if (j > null) {
                m13919b();
            }
            return j;
        }

        public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (this.f11388b.m13942a()) {
                return -3;
            }
            c2122i = this.f11389c.m13870a(c2122i, decoderInputBuffer, z, this.f11388b.f11394c, this.f11388b.f11393b);
            if (c2122i == -4) {
                m13919b();
            }
            return c2122i;
        }

        /* renamed from: a */
        public void m13920a() {
            C2289a.m8313b(this.f11388b.f11397f[this.f11390d]);
            this.f11388b.f11397f[this.f11390d] = false;
        }

        /* renamed from: b */
        private void m13919b() {
            if (!this.f11391e) {
                this.f11388b.f11400i.m7827a(this.f11388b.f11395d[this.f11390d], this.f11388b.f11396e[this.f11390d], 0, null, this.f11388b.f11412u);
                this.f11391e = true;
            }
        }
    }

    public /* synthetic */ void onLoadCanceled(Loadable loadable, long j, long j2, boolean z) {
        m13941a((C3680c) loadable, j, j2, z);
    }

    public /* synthetic */ void onLoadCompleted(Loadable loadable, long j, long j2) {
        m13940a((C3680c) loadable, j, j2);
    }

    public /* synthetic */ int onLoadError(Loadable loadable, long j, long j2, IOException iOException) {
        return m13934a((C3680c) loadable, j, j2, iOException);
    }

    public ChunkSampleStream(int i, int[] iArr, Format[] formatArr, T t, SequenceableLoader.Callback<ChunkSampleStream<T>> callback, Allocator allocator, long j, int i2, C2177a c2177a) {
        this.f11392a = i;
        this.f11395d = iArr;
        this.f11396e = formatArr;
        this.f11398g = t;
        this.f11399h = callback;
        this.f11400i = c2177a;
        this.f11401j = i2;
        formatArr = null;
        if (iArr == null) {
            t = null;
        } else {
            t = iArr.length;
        }
        this.f11407p = new SampleQueue[t];
        this.f11397f = new boolean[t];
        callback = t + 1;
        i2 = new int[callback];
        callback = new SampleQueue[callback];
        this.f11406o = new SampleQueue(allocator);
        i2[0] = i;
        callback[0] = this.f11406o;
        while (formatArr < t) {
            i = new SampleQueue(allocator);
            this.f11407p[formatArr] = i;
            c2177a = formatArr + 1;
            callback[c2177a] = i;
            i2[c2177a] = iArr[formatArr];
            formatArr = c2177a;
        }
        this.f11408q = new C3679b(i2, callback);
        this.f11411t = j;
        this.f11412u = j;
    }

    /* renamed from: a */
    public void m13938a(long j, boolean z) {
        int e = this.f11406o.m13883e();
        this.f11406o.m13874a(j, z, true);
        int e2 = this.f11406o.m13883e();
        if (e2 > e) {
            long i = this.f11406o.m13887i();
            for (int i2 = 0; i2 < this.f11407p.length; i2++) {
                this.f11407p[i2].m13874a(i, z, this.f11397f[i2]);
            }
            m13927b(e2);
        }
    }

    /* renamed from: a */
    public C3678a m13936a(long j, int i) {
        for (int i2 = 0; i2 < this.f11407p.length; i2++) {
            if (this.f11395d[i2] == i) {
                C2289a.m8313b(this.f11397f[i2] ^ 1);
                this.f11397f[i2] = 1;
                this.f11407p[i2].m13888j();
                this.f11407p[i2].m13877b(j, true, true);
                return new C3678a(this, this, this.f11407p[i2], i2);
            }
        }
        throw new IllegalStateException();
    }

    public long getBufferedPositionUs() {
        if (this.f11394c) {
            return Long.MIN_VALUE;
        }
        if (m13942a()) {
            return this.f11411t;
        }
        long j = this.f11412u;
        C4371a b = m13926b();
        if (!b.mo3732d()) {
            b = this.f11404m.size() > 1 ? (C4371a) this.f11404m.get(this.f11404m.size() - 2) : null;
        }
        if (b != null) {
            j = Math.max(j, b.h);
        }
        return Math.max(j, this.f11406o.m13886h());
    }

    /* renamed from: a */
    public long m13935a(long j, C2162p c2162p) {
        return this.f11398g.getAdjustedSeekPositionUs(j, c2162p);
    }

    /* renamed from: a */
    public void m13937a(long j) {
        boolean z;
        int i;
        this.f11412u = j;
        this.f11406o.m13888j();
        int i2 = 0;
        if (m13942a()) {
            z = false;
        } else {
            C4371a c4371a = null;
            i = 0;
            while (i < this.f11404m.size()) {
                C4371a c4371a2 = (C4371a) this.f11404m.get(i);
                long j2 = c4371a2.g;
                if (j2 == j && c4371a2.f14437a == -9223372036854775807L) {
                    c4371a = c4371a2;
                    break;
                } else if (j2 > j) {
                    break;
                } else {
                    i++;
                }
            }
            if (c4371a != null) {
                z = this.f11406o.m13881c(c4371a.m18014a(0));
                this.f11393b = Long.MIN_VALUE;
            } else {
                z = this.f11406o.m13877b(j, true, (j > getNextLoadPositionUs() ? 1 : (j == getNextLoadPositionUs() ? 0 : -1)) < 0) != -1;
                this.f11393b = this.f11412u;
            }
        }
        if (z) {
            for (SampleQueue sampleQueue : this.f11407p) {
                sampleQueue.m13888j();
                sampleQueue.m13877b(j, true, false);
            }
            return;
        }
        this.f11411t = j;
        this.f11394c = false;
        this.f11404m.clear();
        if (this.f11402k.m14087a() != null) {
            this.f11402k.m14088b();
            return;
        }
        this.f11406o.m13871a();
        j = this.f11407p;
        int length = j.length;
        while (i2 < length) {
            j[i2].m13871a();
            i2++;
        }
    }

    /* renamed from: a */
    public void m13939a(@Nullable ReleaseCallback<T> releaseCallback) {
        this.f11410s = releaseCallback;
        this.f11406o.m13890l();
        for (SampleQueue l : this.f11407p) {
            l.m13890l();
        }
        this.f11402k.m14086a((com.google.android.exoplayer2.upstream.Loader.ReleaseCallback) this);
    }

    public void onLoaderReleased() {
        this.f11406o.m13871a();
        for (SampleQueue a : this.f11407p) {
            a.m13871a();
        }
        if (this.f11410s != null) {
            this.f11410s.onSampleStreamReleased(this);
        }
    }

    public boolean isReady() {
        if (!this.f11394c) {
            if (m13942a() || !this.f11406o.m13882d()) {
                return false;
            }
        }
        return true;
    }

    public void maybeThrowError() throws IOException {
        this.f11402k.maybeThrowError();
        if (!this.f11402k.m14087a()) {
            this.f11398g.maybeThrowError();
        }
    }

    public int readData(C2122i c2122i, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (m13942a()) {
            return -3;
        }
        c2122i = this.f11406o.m13870a(c2122i, decoderInputBuffer, z, this.f11394c, this.f11393b);
        if (c2122i == -4) {
            m13921a(this.f11406o.m13884f(), (int) true);
        }
        return c2122i;
    }

    public int skipData(long j) {
        int i = 0;
        if (m13942a()) {
            return 0;
        }
        if (!this.f11394c || j <= this.f11406o.m13886h()) {
            j = this.f11406o.m13877b(j, true, true);
            if (j != -1) {
                i = j;
            }
        } else {
            i = this.f11406o.m13891m();
        }
        if (i > 0) {
            m13921a(this.f11406o.m13884f(), i);
        }
        return i;
    }

    /* renamed from: a */
    public void m13940a(C3680c c3680c, long j, long j2) {
        C3680c c3680c2 = c3680c;
        this.f11398g.onChunkLoadCompleted(c3680c2);
        this.f11400i.m7834a(c3680c2.f11415b, c3680c2.f11416c, this.f11392a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, c3680c.mo3499b());
        this.f11399h.onContinueLoadingRequested(this);
    }

    /* renamed from: a */
    public void m13941a(C3680c c3680c, long j, long j2, boolean z) {
        C3680c c3680c2 = c3680c;
        this.f11400i.m7841b(c3680c2.f11415b, c3680c2.f11416c, this.f11392a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, c3680c.mo3499b());
        if (!z) {
            r0.f11406o.m13871a();
            for (SampleQueue a : r0.f11407p) {
                a.m13871a();
            }
            r0.f11399h.onContinueLoadingRequested(r0);
        }
    }

    /* renamed from: a */
    public int m13934a(C3680c c3680c, long j, long j2, IOException iOException) {
        boolean z;
        boolean z2;
        C3680c c3680c2 = c3680c;
        long b = c3680c.mo3499b();
        boolean a = m13923a(c3680c);
        int size = this.f11404m.size() - 1;
        if (b != 0 && a) {
            if (m13922a(size)) {
                z = false;
                if (r0.f11398g.onChunkLoadError(c3680c2, z, iOException)) {
                    if (z) {
                        Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    } else {
                        if (a) {
                            C2289a.m8313b(m13932d(size) != c3680c2);
                            if (r0.f11404m.isEmpty()) {
                                r0.f11411t = r0.f11412u;
                            }
                        }
                        z2 = true;
                        r0.f11400i.m7835a(c3680c2.f11415b, c3680c2.f11416c, r0.f11392a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, b, iOException, z2);
                        if (!z2) {
                            return 0;
                        }
                        r0.f11399h.onContinueLoadingRequested(r0);
                        return 2;
                    }
                }
                z2 = false;
                r0.f11400i.m7835a(c3680c2.f11415b, c3680c2.f11416c, r0.f11392a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, b, iOException, z2);
                if (!z2) {
                    return 0;
                }
                r0.f11399h.onContinueLoadingRequested(r0);
                return 2;
            }
        }
        z = true;
        if (r0.f11398g.onChunkLoadError(c3680c2, z, iOException)) {
            if (z) {
                if (a) {
                    if (m13932d(size) != c3680c2) {
                    }
                    C2289a.m8313b(m13932d(size) != c3680c2);
                    if (r0.f11404m.isEmpty()) {
                        r0.f11411t = r0.f11412u;
                    }
                }
                z2 = true;
                r0.f11400i.m7835a(c3680c2.f11415b, c3680c2.f11416c, r0.f11392a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, b, iOException, z2);
                if (!z2) {
                    return 0;
                }
                r0.f11399h.onContinueLoadingRequested(r0);
                return 2;
            }
            Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        }
        z2 = false;
        r0.f11400i.m7835a(c3680c2.f11415b, c3680c2.f11416c, r0.f11392a, c3680c2.f11417d, c3680c2.f11418e, c3680c2.f11419f, c3680c2.f11420g, c3680c2.f11421h, j, j2, b, iOException, z2);
        if (!z2) {
            return 0;
        }
        r0.f11399h.onContinueLoadingRequested(r0);
        return 2;
    }

    public boolean continueLoading(long j) {
        boolean z = false;
        if (!this.f11394c) {
            if (!r0.f11402k.m14087a()) {
                C4249g c4249g;
                long j2;
                boolean a = m13942a();
                if (a) {
                    c4249g = null;
                    j2 = r0.f11411t;
                } else {
                    c4249g = m13926b();
                    j2 = c4249g.h;
                }
                r0.f11398g.getNextChunk(c4249g, j, j2, r0.f11403l);
                boolean z2 = r0.f11403l.f6304b;
                C3680c c3680c = r0.f11403l.f6303a;
                r0.f11403l.m7862a();
                if (z2) {
                    r0.f11411t = -9223372036854775807L;
                    r0.f11394c = true;
                    return true;
                } else if (c3680c == null) {
                    return false;
                } else {
                    if (m13923a(c3680c)) {
                        C4371a c4371a = (C4371a) c3680c;
                        if (a) {
                            long j3;
                            if (c4371a.g == r0.f11411t) {
                                z = true;
                            }
                            if (z) {
                                j3 = Long.MIN_VALUE;
                            } else {
                                j3 = r0.f11411t;
                            }
                            r0.f11393b = j3;
                            r0.f11411t = -9223372036854775807L;
                        }
                        c4371a.m18015a(r0.f11408q);
                        r0.f11404m.add(c4371a);
                    }
                    long a2 = r0.f11402k.m14085a(c3680c, r0, r0.f11401j);
                    r0.f11400i.m7833a(c3680c.f11415b, c3680c.f11416c, r0.f11392a, c3680c.f11417d, c3680c.f11418e, c3680c.f11419f, c3680c.f11420g, c3680c.f11421h, a2);
                    return true;
                }
            }
        }
        return false;
    }

    public long getNextLoadPositionUs() {
        if (m13942a()) {
            return this.f11411t;
        }
        return this.f11394c ? Long.MIN_VALUE : m13926b().h;
    }

    public void reevaluateBuffer(long j) {
        if (!this.f11402k.m14087a()) {
            if (!m13942a()) {
                int size = this.f11404m.size();
                int preferredQueueSize = this.f11398g.getPreferredQueueSize(j, this.f11405n);
                if (size > preferredQueueSize) {
                    while (preferredQueueSize < size) {
                        if (!m13922a(preferredQueueSize)) {
                            break;
                        }
                        preferredQueueSize++;
                    }
                    preferredQueueSize = size;
                    if (preferredQueueSize != size) {
                        long j2 = m13926b().h;
                        j = m13932d(preferredQueueSize);
                        if (this.f11404m.isEmpty()) {
                            this.f11411t = this.f11412u;
                        }
                        this.f11394c = false;
                        this.f11400i.m7826a(this.f11392a, j.g, j2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m13923a(C3680c c3680c) {
        return c3680c instanceof C4371a;
    }

    /* renamed from: a */
    private boolean m13922a(int i) {
        C4371a c4371a = (C4371a) this.f11404m.get(i);
        if (this.f11406o.m13884f() > c4371a.m18014a(0)) {
            return true;
        }
        int i2 = 0;
        while (i2 < this.f11407p.length) {
            int f = this.f11407p[i2].m13884f();
            i2++;
            if (f > c4371a.m18014a(i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    boolean m13942a() {
        return this.f11411t != -9223372036854775807L;
    }

    /* renamed from: b */
    private void m13927b(int i) {
        i = m13925b(i, 0);
        if (i > 0) {
            C2314v.m8475a(this.f11404m, 0, i);
        }
    }

    /* renamed from: a */
    private void m13921a(int i, int i2) {
        int b = m13925b(i - i2, 0);
        if (i2 == 1) {
            i = b;
        } else {
            i = m13925b(i - 1, b);
        }
        while (b <= i) {
            m13929c(b);
            b++;
        }
    }

    /* renamed from: c */
    private void m13929c(int i) {
        C4371a c4371a = (C4371a) this.f11404m.get(i);
        Format format = c4371a.d;
        if (!format.equals(this.f11409r)) {
            this.f11400i.m7827a(this.f11392a, format, c4371a.e, c4371a.f, c4371a.g);
        }
        this.f11409r = format;
    }

    /* renamed from: b */
    private int m13925b(int i, int i2) {
        do {
            i2++;
            if (i2 >= this.f11404m.size()) {
                return this.f11404m.size() - 1;
            }
        } while (((C4371a) this.f11404m.get(i2)).m18014a(0) <= i);
        return i2 - 1;
    }

    /* renamed from: b */
    private C4371a m13926b() {
        return (C4371a) this.f11404m.get(this.f11404m.size() - 1);
    }

    /* renamed from: d */
    private C4371a m13932d(int i) {
        C4371a c4371a = (C4371a) this.f11404m.get(i);
        C2314v.m8475a(this.f11404m, i, this.f11404m.size());
        int i2 = 0;
        this.f11406o.m13879b(c4371a.m18014a(0));
        while (i2 < this.f11407p.length) {
            i = this.f11407p[i2];
            i2++;
            i.m13879b(c4371a.m18014a(i2));
        }
        return c4371a;
    }
}
