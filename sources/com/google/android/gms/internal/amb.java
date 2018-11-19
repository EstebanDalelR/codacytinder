package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@zzzv
public final class amb {
    /* renamed from: a */
    private boolean f15500a;
    /* renamed from: b */
    private final List<alz> f15501b = new LinkedList();
    /* renamed from: c */
    private final Map<String, String> f15502c = new LinkedHashMap();
    /* renamed from: d */
    private final Object f15503d = new Object();
    /* renamed from: e */
    private String f15504e;
    @Nullable
    /* renamed from: f */
    private amb f15505f;

    public amb(boolean z, String str, String str2) {
        this.f15500a = z;
        this.f15502c.put("action", str);
        this.f15502c.put("ad_format", str2);
    }

    /* renamed from: a */
    public final alz m19361a() {
        return m19362a(ar.k().elapsedRealtime());
    }

    @Nullable
    /* renamed from: a */
    public final alz m19362a(long j) {
        return !this.f15500a ? null : new alz(j, null, null);
    }

    /* renamed from: a */
    public final void m19363a(@Nullable amb amb) {
        synchronized (this.f15503d) {
            this.f15505f = amb;
        }
    }

    /* renamed from: a */
    public final void m19364a(String str) {
        if (this.f15500a) {
            synchronized (this.f15503d) {
                this.f15504e = str;
            }
        }
    }

    /* renamed from: a */
    public final void m19365a(String str, String str2) {
        if (this.f15500a && !TextUtils.isEmpty(str2)) {
            alr e = ar.i().m27307e();
            if (e != null) {
                synchronized (this.f15503d) {
                    alv a = e.m19347a(str);
                    Map map = this.f15502c;
                    map.put(str, a.mo4353a((String) map.get(str), str2));
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean m19366a(alz alz, long j, String... strArr) {
        synchronized (this.f15503d) {
            for (String alz2 : strArr) {
                this.f15501b.add(new alz(j, alz2, alz));
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean m19367a(@Nullable alz alz, String... strArr) {
        if (this.f15500a) {
            if (alz != null) {
                return m19366a(alz, ar.k().elapsedRealtime(), strArr);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String m19368b() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        synchronized (this.f15503d) {
            for (alz alz : this.f15501b) {
                long a = alz.m19355a();
                String b = alz.m19356b();
                alz alz2 = alz2.m19357c();
                if (alz2 != null && a > 0) {
                    long a2 = a - alz2.m19355a();
                    stringBuilder2.append(b);
                    stringBuilder2.append('.');
                    stringBuilder2.append(a2);
                    stringBuilder2.append(',');
                }
            }
            this.f15501b.clear();
            if (!TextUtils.isEmpty(this.f15504e)) {
                stringBuilder2.append(this.f15504e);
            } else if (stringBuilder2.length() > 0) {
                stringBuilder2.setLength(stringBuilder2.length() - 1);
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: c */
    final Map<String, String> m19369c() {
        synchronized (this.f15503d) {
            Map<String, String> a;
            alr e = ar.i().m27307e();
            if (e != null) {
                if (this.f15505f != null) {
                    a = e.m19348a(this.f15502c, this.f15505f.m19369c());
                    return a;
                }
            }
            a = this.f15502c;
            return a;
        }
    }

    /* renamed from: d */
    public final alz m19370d() {
        synchronized (this.f15503d) {
        }
        return null;
    }
}
