package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.C3600d;
import com.google.android.exoplayer2.decoder.C3601e;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.text.a */
public abstract class C4258a extends C3601e<C4259c, C4260d, SubtitleDecoderException> implements SubtitleDecoder {
    /* renamed from: a */
    private final String f13793a;

    /* renamed from: a */
    protected abstract Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException;

    public void setPositionUs(long j) {
    }

    /* renamed from: a */
    protected /* synthetic */ Exception mo3510a(Throwable th) {
        return m17033b(th);
    }

    /* renamed from: c */
    protected /* synthetic */ DecoderInputBuffer mo3512c() {
        return mo3514e();
    }

    /* renamed from: d */
    protected /* synthetic */ C3600d mo3513d() {
        return mo3515f();
    }

    protected C4258a(String str) {
        super(new C4259c[2], new C4260d[2]);
        this.f13793a = str;
        m13533a(1024);
    }

    public final String getName() {
        return this.f13793a;
    }

    /* renamed from: e */
    protected final C4259c mo3514e() {
        return new C4259c();
    }

    /* renamed from: f */
    protected final C4260d mo3515f() {
        return new C4380b(this);
    }

    /* renamed from: b */
    protected final SubtitleDecoderException m17033b(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    /* renamed from: a */
    protected final void m17032a(C4260d c4260d) {
        super.mo3511a((C3600d) c4260d);
    }

    /* renamed from: a */
    protected final SubtitleDecoderException m17028a(C4259c c4259c, C4260d c4260d, boolean z) {
        try {
            ByteBuffer byteBuffer = c4259c.b;
            C4260d c4260d2 = c4260d;
            c4260d2.m17039a(c4259c.c, mo3740a(byteBuffer.array(), byteBuffer.limit(), z), c4259c.f13794d);
            c4260d.m7343c(Integer.MIN_VALUE);
            return null;
        } catch (C4259c c4259c2) {
            return c4259c2;
        }
    }
}
