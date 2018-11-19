package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.cg.C4467a;
import java.util.Collections;
import java.util.Map;

public abstract class aom<T> implements Comparable<aom<T>> {
    /* renamed from: a */
    private final C4467a f15535a;
    /* renamed from: b */
    private final int f15536b;
    /* renamed from: c */
    private final String f15537c;
    /* renamed from: d */
    private final int f15538d;
    /* renamed from: e */
    private final zzx f15539e;
    /* renamed from: f */
    private Integer f15540f;
    /* renamed from: g */
    private ary f15541g;
    /* renamed from: h */
    private boolean f15542h;
    /* renamed from: i */
    private boolean f15543i;
    /* renamed from: j */
    private boolean f15544j;
    /* renamed from: k */
    private boolean f15545k;
    /* renamed from: l */
    private zzaa f15546l;
    /* renamed from: m */
    private pt f15547m;
    /* renamed from: n */
    private aqh f15548n;
    /* renamed from: o */
    private final Object f15549o;

    public aom(int i, String str, zzx zzx) {
        this.f15535a = C4467a.f15913a ? new C4467a() : null;
        this.f15542h = true;
        int i2 = 0;
        this.f15543i = false;
        this.f15544j = false;
        this.f15545k = false;
        this.f15547m = null;
        this.f15549o = new Object();
        this.f15536b = i;
        this.f15537c = str;
        this.f15539e = zzx;
        this.f15546l = new agk();
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                if (host != null) {
                    i2 = host.hashCode();
                }
            }
        }
        this.f15538d = i2;
    }

    /* renamed from: a */
    public final aom<?> m19378a(int i) {
        this.f15540f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final aom<?> m19379a(ary ary) {
        this.f15541g = ary;
        return this;
    }

    /* renamed from: a */
    public final aom<?> m19380a(pt ptVar) {
        this.f15547m = ptVar;
        return this;
    }

    /* renamed from: a */
    protected abstract asu<T> mo4623a(amz amz);

    /* renamed from: a */
    final void m19382a(aqh aqh) {
        synchronized (this.f15549o) {
            this.f15548n = aqh;
        }
    }

    /* renamed from: a */
    final void m19383a(asu<?> asu) {
        synchronized (this.f15549o) {
            if (this.f15548n != null) {
                this.f15548n.mo4169a(this, asu);
            }
        }
    }

    /* renamed from: a */
    public final void m19384a(zzad zzad) {
        if (this.f15539e != null) {
            this.f15539e.zzd(zzad);
        }
    }

    /* renamed from: a */
    protected abstract void mo4624a(T t);

    /* renamed from: a */
    public byte[] mo6871a() throws zza {
        return null;
    }

    /* renamed from: b */
    public Map<String, String> mo6872b() throws zza {
        return Collections.emptyMap();
    }

    /* renamed from: b */
    public final void m19388b(String str) {
        if (C4467a.f15913a) {
            this.f15535a.m19566a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: c */
    public final int m19389c() {
        return this.f15536b;
    }

    /* renamed from: c */
    final void m19390c(String str) {
        if (this.f15541g != null) {
            this.f15541g.m19468b(this);
        }
        if (C4467a.f15913a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new apg(this, str, id));
            } else {
                this.f15535a.m19566a(str, id);
                this.f15535a.m19565a(toString());
            }
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        aom aom = (aom) obj;
        zzu zzu = zzu.NORMAL;
        zzu zzu2 = zzu.NORMAL;
        return zzu == zzu2 ? this.f15540f.intValue() - aom.f15540f.intValue() : zzu2.ordinal() - zzu.ordinal();
    }

    /* renamed from: d */
    public final int m19391d() {
        return this.f15538d;
    }

    /* renamed from: e */
    public final String m19392e() {
        return this.f15537c;
    }

    /* renamed from: f */
    public final pt m19393f() {
        return this.f15547m;
    }

    /* renamed from: g */
    public final boolean m19394g() {
        return this.f15542h;
    }

    /* renamed from: h */
    public final int m19395h() {
        return this.f15546l.zzb();
    }

    /* renamed from: i */
    public final zzaa m19396i() {
        return this.f15546l;
    }

    /* renamed from: j */
    public final void m19397j() {
        this.f15544j = true;
    }

    /* renamed from: k */
    public final boolean m19398k() {
        return this.f15544j;
    }

    /* renamed from: l */
    final void m19399l() {
        synchronized (this.f15549o) {
            if (this.f15548n != null) {
                this.f15548n.mo4168a(this);
            }
        }
    }

    public String toString() {
        String str = "0x";
        String valueOf = String.valueOf(Integer.toHexString(this.f15538d));
        str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        valueOf = "[ ] ";
        String str2 = this.f15537c;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.f15540f);
        StringBuilder stringBuilder = new StringBuilder(((((String.valueOf(valueOf).length() + 3) + String.valueOf(str2).length()) + String.valueOf(str).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        stringBuilder.append(" ");
        stringBuilder.append(str);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" ");
        stringBuilder.append(valueOf3);
        return stringBuilder.toString();
    }
}
