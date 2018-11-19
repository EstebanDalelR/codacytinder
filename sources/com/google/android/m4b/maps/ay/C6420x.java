package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.util.Log;
import com.google.android.m4b.maps.p102b.C6423f.C4740a;
import com.google.android.m4b.maps.p104d.C5318a;
import com.google.android.m4b.maps.p104d.C5318a.C5316a;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.m4b.maps.ay.x */
public class C6420x implements C4740a {
    /* renamed from: a */
    private static final String f23820a = "x";
    /* renamed from: b */
    private static final long f23821b = TimeUnit.HOURS.toMillis(1);
    /* renamed from: c */
    private static ad f23822c;
    /* renamed from: d */
    private final aa f23823d;

    /* renamed from: com.google.android.m4b.maps.ay.x$1 */
    class C64191 extends ad {
        /* renamed from: a */
        private /* synthetic */ Context f23818a;
        /* renamed from: b */
        private /* synthetic */ String f23819b;

        C64191(long j, Context context, String str) {
            this.f23818a = context;
            this.f23819b = str;
            super(j);
        }

        /* renamed from: a */
        public final C5318a mo4897a() {
            Map a = new C6418w(this.f23818a, this.f23819b).mo4896a();
            if (a == null) {
                return null;
            }
            return C6420x.m28041a(a);
        }
    }

    public C6420x(Context context, String str) {
        this(context, str, ab.m27950c());
    }

    private C6420x(Context context, String str, aa aaVar) {
        this.f23823d = aaVar;
        C6420x.m28042a(context, str);
    }

    /* renamed from: a */
    private static synchronized void m28042a(Context context, String str) {
        synchronized (C6420x.class) {
            if (f23822c != null) {
                return;
            }
            f23822c = new C64191(f23821b, context, str);
        }
    }

    /* renamed from: a */
    static C5318a m28041a(Map<String, String> map) {
        C5316a[] c5316aArr = new C5316a[map.size()];
        map = map.entrySet().iterator();
        int i = 0;
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            try {
                c5316aArr[i] = new C5316a((String) entry.getKey(), (String) entry.getValue());
                i++;
            } catch (Throwable e) {
                if (C4728u.m21050a(f23820a, 6)) {
                    Log.e(f23820a, "Invalid rule from Gservices: ", e);
                }
            }
        }
        if (i == c5316aArr.length) {
            return new C5318a(c5316aArr);
        }
        return new C5318a((C5316a[]) Arrays.copyOf(c5316aArr, i));
    }

    /* renamed from: a */
    public final String mo4898a(String str) {
        this.f23823d.mo4876b();
        C5316a a = f23822c.m20916b().m23545a(str);
        if (a.f19720c) {
            return null;
        }
        if (a.f19719b == null) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a.f19719b);
        stringBuilder.append(str.substring(a.f19718a.length()));
        return stringBuilder.toString();
    }
}
