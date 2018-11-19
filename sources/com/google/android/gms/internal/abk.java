package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.io.IOException;

public abstract class abk {
    /* renamed from: e */
    private static volatile boolean f14984e = true;
    /* renamed from: a */
    int f14985a;
    /* renamed from: b */
    int f14986b;
    /* renamed from: c */
    int f14987c;
    /* renamed from: d */
    private boolean f14988d;

    private abk() {
        this.f14986b = 100;
        this.f14987c = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f14988d = false;
    }

    /* renamed from: a */
    public static abk m18816a(byte[] bArr) {
        return m18817a(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    static abk m18817a(byte[] bArr, int i, int i2, boolean z) {
        abk abm = new abm(bArr, i, i2, z, null);
        try {
            abm.mo4177b(i2);
            return abm;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public abstract int mo4174a() throws IOException;

    /* renamed from: a */
    public abstract <T extends zzffu<T, ?>> T mo4175a(T t, abq abq) throws IOException;

    /* renamed from: a */
    public abstract void mo4176a(int i) throws zzfge;

    /* renamed from: b */
    public abstract int mo4177b(int i) throws zzfge;

    /* renamed from: b */
    public abstract long mo4178b() throws IOException;

    /* renamed from: c */
    public abstract long mo4179c() throws IOException;

    /* renamed from: c */
    public abstract void mo4180c(int i);

    /* renamed from: d */
    public abstract int mo4181d() throws IOException;

    /* renamed from: e */
    public abstract boolean mo4182e() throws IOException;

    /* renamed from: f */
    public abstract String mo4183f() throws IOException;

    /* renamed from: g */
    public abstract String mo4184g() throws IOException;

    /* renamed from: h */
    public abstract zzfes mo4185h() throws IOException;

    /* renamed from: i */
    public abstract int mo4186i() throws IOException;

    /* renamed from: j */
    public abstract int mo4187j() throws IOException;

    /* renamed from: k */
    public abstract int mo4188k() throws IOException;

    /* renamed from: l */
    abstract long mo4189l() throws IOException;

    /* renamed from: m */
    public abstract boolean mo4190m() throws IOException;

    /* renamed from: n */
    public abstract int mo4191n();
}
