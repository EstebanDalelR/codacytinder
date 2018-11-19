package com.google.android.exoplayer2.text.p065a;

import android.support.annotation.NonNull;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.C4259c;
import com.google.android.exoplayer2.text.C4260d;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2289a;
import java.util.LinkedList;
import java.util.PriorityQueue;

/* renamed from: com.google.android.exoplayer2.text.a.d */
abstract class C4257d implements SubtitleDecoder {
    /* renamed from: a */
    private final LinkedList<C4377a> f13787a = new LinkedList();
    /* renamed from: b */
    private final LinkedList<C4260d> f13788b;
    /* renamed from: c */
    private final PriorityQueue<C4377a> f13789c;
    /* renamed from: d */
    private C4377a f13790d;
    /* renamed from: e */
    private long f13791e;
    /* renamed from: f */
    private long f13792f;

    /* renamed from: com.google.android.exoplayer2.text.a.d$a */
    private static final class C4377a extends C4259c implements Comparable<C4377a> {
        /* renamed from: e */
        private long f14509e;

        private C4377a() {
        }

        public /* synthetic */ int compareTo(@NonNull Object obj) {
            return m18086a((C4377a) obj);
        }

        /* renamed from: a */
        public int m18086a(@NonNull C4377a c4377a) {
            int i = -1;
            if (m7344c() != c4377a.m7344c()) {
                if (m7344c() != null) {
                    i = 1;
                }
                return i;
            }
            long j = this.c - c4377a.c;
            if (j == 0) {
                long j2 = this.f14509e - c4377a.f14509e;
                if (j2 == 0) {
                    return null;
                }
                j = j2;
            }
            if (j > 0) {
                i = 1;
            }
            return i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.a.d$b */
    private final class C4378b extends C4260d {
        /* renamed from: c */
        final /* synthetic */ C4257d f14510c;

        private C4378b(C4257d c4257d) {
            this.f14510c = c4257d;
        }

        /* renamed from: e */
        public final void mo3739e() {
            this.f14510c.m17021a((C4260d) this);
        }
    }

    /* renamed from: a */
    protected abstract void mo3733a(C4259c c4259c);

    /* renamed from: a */
    protected abstract boolean mo3734a();

    /* renamed from: b */
    protected abstract Subtitle mo3735b();

    public void release() {
    }

    public /* synthetic */ Object dequeueInputBuffer() throws Exception {
        return mo3738d();
    }

    public /* synthetic */ Object dequeueOutputBuffer() throws Exception {
        return mo3737c();
    }

    public /* synthetic */ void queueInputBuffer(Object obj) throws Exception {
        mo3736b((C4259c) obj);
    }

    public C4257d() {
        for (int i = 0; i < 10; i++) {
            this.f13787a.add(new C4377a());
        }
        this.f13788b = new LinkedList();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f13788b.add(new C4378b());
        }
        this.f13789c = new PriorityQueue();
    }

    public void setPositionUs(long j) {
        this.f13791e = j;
    }

    /* renamed from: d */
    public C4259c mo3738d() throws SubtitleDecoderException {
        C2289a.m8313b(this.f13790d == null);
        if (this.f13787a.isEmpty()) {
            return null;
        }
        this.f13790d = (C4377a) this.f13787a.pollFirst();
        return this.f13790d;
    }

    /* renamed from: b */
    public void mo3736b(C4259c c4259c) throws SubtitleDecoderException {
        C2289a.m8311a(c4259c == this.f13790d);
        if (c4259c.m7342b() != null) {
            m17019a(this.f13790d);
        } else {
            c4259c = this.f13790d;
            long j = this.f13792f;
            this.f13792f = j + 1;
            c4259c.f14509e = j;
            this.f13789c.add(this.f13790d);
        }
        this.f13790d = null;
    }

    /* renamed from: c */
    public C4260d mo3737c() throws SubtitleDecoderException {
        if (this.f13788b.isEmpty()) {
            return null;
        }
        while (!this.f13789c.isEmpty() && ((C4377a) this.f13789c.peek()).c <= this.f13791e) {
            C4377a c4377a = (C4377a) this.f13789c.poll();
            if (c4377a.m7344c()) {
                C4260d c4260d = (C4260d) this.f13788b.pollFirst();
                c4260d.m7341b(4);
                m17019a(c4377a);
                return c4260d;
            }
            mo3733a((C4259c) c4377a);
            if (mo3734a()) {
                Subtitle b = mo3735b();
                if (!c4377a.m7342b()) {
                    c4260d = (C4260d) this.f13788b.pollFirst();
                    c4260d.m17039a(c4377a.c, b, Format.OFFSET_SAMPLE_RELATIVE);
                    m17019a(c4377a);
                    return c4260d;
                }
            }
            m17019a(c4377a);
        }
        return null;
    }

    /* renamed from: a */
    private void m17019a(C4377a c4377a) {
        c4377a.mo2221a();
        this.f13787a.add(c4377a);
    }

    /* renamed from: a */
    protected void m17021a(C4260d c4260d) {
        c4260d.mo2221a();
        this.f13788b.add(c4260d);
    }

    public void flush() {
        this.f13792f = 0;
        this.f13791e = 0;
        while (!this.f13789c.isEmpty()) {
            m17019a((C4377a) this.f13789c.poll());
        }
        if (this.f13790d != null) {
            m17019a(this.f13790d);
            this.f13790d = null;
        }
    }
}
