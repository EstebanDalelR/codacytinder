package com.evernote.android.job.util;

/* renamed from: com.evernote.android.job.util.a */
public final class C1147a {
    /* renamed from: a */
    public static final C1147a f3016a = new C1147a(false, 1.0f);
    /* renamed from: b */
    private final boolean f3017b;
    /* renamed from: c */
    private final float f3018c;

    C1147a(boolean z, float f) {
        this.f3017b = z;
        this.f3018c = f;
    }

    /* renamed from: a */
    public boolean m3878a() {
        return this.f3017b;
    }

    /* renamed from: b */
    public boolean m3879b() {
        return this.f3018c < 0.15f && !this.f3017b;
    }
}
