package com.google.android.exoplayer2.decoder;

/* renamed from: com.google.android.exoplayer2.decoder.a */
public abstract class C2033a {
    /* renamed from: a */
    private int f5597a;

    /* renamed from: a */
    public void mo2221a() {
        this.f5597a = 0;
    }

    /* renamed from: b */
    public final boolean m7342b() {
        return m7346d(Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public final boolean m7344c() {
        return m7346d(4);
    }

    /* renamed from: d */
    public final boolean m7345d() {
        return m7346d(1);
    }

    /* renamed from: a */
    public final void m7340a(int i) {
        this.f5597a = i;
    }

    /* renamed from: b */
    public final void m7341b(int i) {
        this.f5597a = i | this.f5597a;
    }

    /* renamed from: c */
    public final void m7343c(int i) {
        this.f5597a = (i ^ -1) & this.f5597a;
    }

    /* renamed from: d */
    protected final boolean m7346d(int i) {
        return (this.f5597a & i) == i;
    }
}
