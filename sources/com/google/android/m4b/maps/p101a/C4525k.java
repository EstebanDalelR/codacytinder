package com.google.android.m4b.maps.p101a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.m4b.maps.p101a.C4515b.C4514a;
import com.google.android.m4b.maps.p101a.C4529m.C4527a;
import com.google.android.m4b.maps.p101a.C4535s.C4534a;
import com.tinder.api.ManagerWebServices;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.m4b.maps.a.k */
public abstract class C4525k<T> implements Comparable<C4525k<T>> {
    /* renamed from: a */
    private final C4534a f16809a;
    /* renamed from: b */
    private final int f16810b;
    /* renamed from: c */
    private final String f16811c;
    /* renamed from: d */
    private final int f16812d;
    /* renamed from: e */
    private final C4527a f16813e;
    /* renamed from: f */
    private Integer f16814f;
    /* renamed from: g */
    private C4526l f16815g;
    /* renamed from: h */
    private boolean f16816h;
    /* renamed from: i */
    private boolean f16817i;
    /* renamed from: j */
    private boolean f16818j;
    /* renamed from: k */
    private long f16819k;
    /* renamed from: l */
    private C4531o f16820l;
    /* renamed from: m */
    private C4514a f16821m;

    /* renamed from: com.google.android.m4b.maps.a.k$a */
    public enum C4524a {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* renamed from: a */
    protected static C4532r m20419a(C4532r c4532r) {
        return c4532r;
    }

    /* renamed from: a */
    protected abstract C4529m<T> mo4885a(C4522h c4522h);

    /* renamed from: a */
    protected abstract void mo4886a(T t);

    @Deprecated
    /* renamed from: i */
    public final byte[] m20440i() {
        return null;
    }

    /* renamed from: k */
    public byte[] mo4889k() {
        return null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        C4525k c4525k = (C4525k) obj;
        C4524a m = mo4904m();
        C4524a m2 = c4525k.mo4904m();
        return m == m2 ? this.f16814f.intValue() - c4525k.f16814f.intValue() : m2.ordinal() - m.ordinal();
    }

    public C4525k(int i, String str, C4527a c4527a) {
        this.f16809a = C4534a.f16846a ? new C4534a() : null;
        this.f16816h = true;
        int i2 = 0;
        this.f16817i = false;
        this.f16818j = false;
        this.f16819k = 0;
        this.f16821m = null;
        this.f16810b = i;
        this.f16811c = str;
        this.f16813e = c4527a;
        this.f16820l = new C4531o();
        if (TextUtils.isEmpty(str) == 0) {
            i = Uri.parse(str);
            if (i != 0) {
                i = i.getHost();
                if (i != 0) {
                    i2 = i.hashCode();
                }
            }
        }
        this.f16812d = i2;
    }

    /* renamed from: a */
    public final int m20422a() {
        return this.f16810b;
    }

    /* renamed from: b */
    public final int m20431b() {
        return this.f16812d;
    }

    /* renamed from: a */
    public final C4525k<?> m20426a(C4531o c4531o) {
        this.f16820l = c4531o;
        return this;
    }

    /* renamed from: a */
    public final void m20430a(String str) {
        if (C4534a.f16846a) {
            this.f16809a.m20466a(str, Thread.currentThread().getId());
            return;
        }
        if (this.f16819k == 0) {
            this.f16819k = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    final void m20433b(final String str) {
        if (this.f16815g != null) {
            this.f16815g.m20451b(this);
        }
        if (C4534a.f16846a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    /* renamed from: c */
                    private /* synthetic */ C4525k f16803c;

                    public final void run() {
                        this.f16803c.f16809a.m20466a(str, id);
                        this.f16803c.f16809a.m20465a(toString());
                    }
                });
                return;
            }
            this.f16809a.m20466a(str, id);
            this.f16809a.m20465a(toString());
            return;
        }
        if (SystemClock.elapsedRealtime() - this.f16819k >= 3000) {
            C4535s.m20469b("%d ms: %s", Long.valueOf(SystemClock.elapsedRealtime() - this.f16819k), toString());
        }
    }

    /* renamed from: a */
    public final C4525k<?> m20425a(C4526l c4526l) {
        this.f16815g = c4526l;
        return this;
    }

    /* renamed from: a */
    public final C4525k<?> m20423a(int i) {
        this.f16814f = Integer.valueOf(i);
        return this;
    }

    /* renamed from: c */
    public final String m20434c() {
        return this.f16811c;
    }

    /* renamed from: a */
    public final C4525k<?> m20424a(C4514a c4514a) {
        this.f16821m = c4514a;
        return this;
    }

    /* renamed from: e */
    public final C4514a m20436e() {
        return this.f16821m;
    }

    /* renamed from: f */
    public final void m20437f() {
        this.f16817i = true;
    }

    /* renamed from: g */
    public final boolean m20438g() {
        return this.f16817i;
    }

    /* renamed from: h */
    public Map<String, String> mo4887h() {
        return Collections.emptyMap();
    }

    /* renamed from: j */
    public String mo4888j() {
        StringBuilder stringBuilder = new StringBuilder("application/x-www-form-urlencoded; charset=");
        stringBuilder.append("UTF-8");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static byte[] m20421a(Map<String, String> map, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                stringBuilder.append(URLEncoder.encode((String) entry.getKey(), str));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String) entry.getValue(), str));
                stringBuilder.append(ManagerWebServices.QUERY_AMPERSAND);
            }
            return stringBuilder.toString().getBytes(str);
        } catch (Map<String, String> map2) {
            StringBuilder stringBuilder2 = new StringBuilder("Encoding not supported: ");
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString(), map2);
        }
    }

    /* renamed from: a */
    public final C4525k<?> m20427a(boolean z) {
        this.f16816h = false;
        return this;
    }

    /* renamed from: l */
    public final boolean m20443l() {
        return this.f16816h;
    }

    /* renamed from: m */
    public C4524a mo4904m() {
        return C4524a.NORMAL;
    }

    /* renamed from: n */
    public final int m20445n() {
        return this.f16820l.m20460a();
    }

    /* renamed from: o */
    public final C4531o m20446o() {
        return this.f16820l;
    }

    /* renamed from: p */
    public final void m20447p() {
        this.f16818j = true;
    }

    /* renamed from: q */
    public final boolean m20448q() {
        return this.f16818j;
    }

    /* renamed from: b */
    public final void m20432b(C4532r c4532r) {
        if (this.f16813e != null) {
            this.f16813e.mo4905a(c4532r);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("0x");
        stringBuilder.append(Integer.toHexString(this.f16812d));
        String stringBuilder2 = stringBuilder.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.f16817i ? "[X] " : "[ ] ");
        stringBuilder3.append(this.f16811c);
        stringBuilder3.append(" ");
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append(" ");
        stringBuilder3.append(mo4904m());
        stringBuilder3.append(" ");
        stringBuilder3.append(this.f16814f);
        return stringBuilder3.toString();
    }

    /* renamed from: d */
    public final String m20435d() {
        return this.f16811c;
    }
}
