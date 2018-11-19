package com.google.android.exoplayer2.extractor.flv;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.android.exoplayer2.extractor.C2075h;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.SeekMap.C3605b;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.flv.b */
public final class C3627b implements Extractor {
    /* renamed from: a */
    public static final ExtractorsFactory f10970a = new C36261();
    /* renamed from: b */
    private static final int f10971b = C2314v.m8499g("FLV");
    /* renamed from: c */
    private final C2302k f10972c = new C2302k(4);
    /* renamed from: d */
    private final C2302k f10973d = new C2302k(9);
    /* renamed from: e */
    private final C2302k f10974e = new C2302k(11);
    /* renamed from: f */
    private final C2302k f10975f = new C2302k();
    /* renamed from: g */
    private final C3628c f10976g = new C3628c();
    /* renamed from: h */
    private ExtractorOutput f10977h;
    /* renamed from: i */
    private int f10978i = 1;
    /* renamed from: j */
    private long f10979j = -9223372036854775807L;
    /* renamed from: k */
    private int f10980k;
    /* renamed from: l */
    private int f10981l;
    /* renamed from: m */
    private int f10982m;
    /* renamed from: n */
    private long f10983n;
    /* renamed from: o */
    private boolean f10984o;
    /* renamed from: p */
    private C3625a f10985p;
    /* renamed from: q */
    private C3629d f10986q;

    /* renamed from: com.google.android.exoplayer2.extractor.flv.b$1 */
    static class C36261 implements ExtractorsFactory {
        C36261() {
        }

        public Extractor[] createExtractors() {
            return new Extractor[]{new C3627b()};
        }
    }

    public void release() {
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z = false;
        extractorInput.peekFully(this.f10972c.f6929a, 0, 3);
        this.f10972c.m8388c(0);
        if (this.f10972c.m8399k() != f10971b) {
            return false;
        }
        extractorInput.peekFully(this.f10972c.f6929a, 0, 2);
        this.f10972c.m8388c(0);
        if ((this.f10972c.m8396h() & Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        extractorInput.peekFully(this.f10972c.f6929a, 0, 4);
        this.f10972c.m8388c(0);
        int o = this.f10972c.m8403o();
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(o);
        extractorInput.peekFully(this.f10972c.f6929a, 0, 4);
        this.f10972c.m8388c(0);
        if (this.f10972c.m8403o() == null) {
            z = true;
        }
        return z;
    }

    public void init(ExtractorOutput extractorOutput) {
        this.f10977h = extractorOutput;
    }

    public void seek(long j, long j2) {
        this.f10978i = 1;
        this.f10979j = -9223372036854775807L;
        this.f10980k = 0;
    }

    public int read(ExtractorInput extractorInput, C2075h c2075h) throws IOException, InterruptedException {
        while (true) {
            switch (this.f10978i) {
                case 1:
                    if (m13641a(extractorInput) != null) {
                        break;
                    }
                    return -1;
                case 2:
                    m13642b(extractorInput);
                    break;
                case 3:
                    if (m13643c(extractorInput) != null) {
                        break;
                    }
                    return -1;
                case 4:
                    if (m13644d(extractorInput) == null) {
                        break;
                    }
                    return null;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    private boolean m13641a(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z = false;
        if (extractorInput.readFully(this.f10973d.f6929a, 0, 9, true) == null) {
            return false;
        }
        this.f10973d.m8388c(0);
        this.f10973d.m8390d(4);
        extractorInput = this.f10973d.m8395g();
        Object obj = (extractorInput & 4) != 0 ? 1 : null;
        if ((extractorInput & 1) != null) {
            z = true;
        }
        if (obj != null && this.f10985p == null) {
            this.f10985p = new C3625a(this.f10977h.track(8, 1));
        }
        if (z && this.f10986q == null) {
            this.f10986q = new C3629d(this.f10977h.track(9, 2));
        }
        this.f10977h.endTracks();
        this.f10980k = (this.f10973d.m8403o() - 9) + 4;
        this.f10978i = 2;
        return true;
    }

    /* renamed from: b */
    private void m13642b(ExtractorInput extractorInput) throws IOException, InterruptedException {
        extractorInput.skipFully(this.f10980k);
        this.f10980k = null;
        this.f10978i = 3;
    }

    /* renamed from: c */
    private boolean m13643c(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (extractorInput.readFully(this.f10974e.f6929a, 0, 11, true) == null) {
            return false;
        }
        this.f10974e.m8388c(0);
        this.f10981l = this.f10974e.m8395g();
        this.f10982m = this.f10974e.m8399k();
        this.f10983n = (long) this.f10974e.m8399k();
        this.f10983n = (((long) (this.f10974e.m8395g() << 24)) | this.f10983n) * 1000;
        this.f10974e.m8390d(3);
        this.f10978i = 4;
        return true;
    }

    /* renamed from: d */
    private boolean m13644d(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z = true;
        if (this.f10981l == 8 && this.f10985p != null) {
            m13640a();
            this.f10985p.m7424b(m13645e(extractorInput), this.f10979j + this.f10983n);
        } else if (this.f10981l == 9 && this.f10986q != null) {
            m13640a();
            this.f10986q.m7424b(m13645e(extractorInput), this.f10979j + this.f10983n);
        } else if (this.f10981l != 18 || this.f10984o) {
            extractorInput.skipFully(this.f10982m);
            z = false;
        } else {
            this.f10976g.m7424b(m13645e(extractorInput), this.f10983n);
            long a = this.f10976g.m13655a();
            if (a != -9223372036854775807L) {
                this.f10977h.seekMap(new C3605b(a));
                this.f10984o = true;
            }
        }
        this.f10980k = 4;
        this.f10978i = 2;
        return z;
    }

    /* renamed from: e */
    private C2302k m13645e(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (this.f10982m > this.f10975f.m8391e()) {
            this.f10975f.m8383a(new byte[Math.max(this.f10975f.m8391e() * 2, this.f10982m)], 0);
        } else {
            this.f10975f.m8388c(0);
        }
        this.f10975f.m8386b(this.f10982m);
        extractorInput.readFully(this.f10975f.f6929a, 0, this.f10982m);
        return this.f10975f;
    }

    /* renamed from: a */
    private void m13640a() {
        if (!this.f10984o) {
            this.f10977h.seekMap(new C3605b(-9223372036854775807L));
            this.f10984o = true;
        }
        if (this.f10979j == -9223372036854775807L) {
            this.f10979j = this.f10976g.m13655a() == -9223372036854775807L ? -this.f10983n : 0;
        }
    }
}
