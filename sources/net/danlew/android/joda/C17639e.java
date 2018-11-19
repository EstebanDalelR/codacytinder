package net.danlew.android.joda;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.danlew.android.joda.C15883c.C15882a;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.Provider;

/* renamed from: net.danlew.android.joda.e */
public class C17639e implements Provider {
    /* renamed from: a */
    private Context f54830a;
    /* renamed from: b */
    private final Map<String, Object> f54831b;

    public C17639e(Context context) throws IOException {
        if (context == null) {
            throw new IllegalArgumentException("Context must not be null");
        }
        this.f54830a = context.getApplicationContext();
        this.f54831b = C17639e.m64254a(m64253a("ZoneInfoMap"));
    }

    public DateTimeZone getZone(String str) {
        if (str == null) {
            return null;
        }
        Object obj = this.f54831b.get(str);
        if (obj == null) {
            return null;
        }
        if (str.equals(obj)) {
            return m64256b(str);
        }
        if (!(obj instanceof SoftReference)) {
            return getZone((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        if (dateTimeZone != null) {
            return dateTimeZone;
        }
        return m64256b(str);
    }

    public Set<String> getAvailableIDs() {
        return new TreeSet(this.f54831b.keySet());
    }

    /* renamed from: a */
    protected void m64257a(Exception exception) {
        exception.printStackTrace();
    }

    /* renamed from: a */
    private InputStream m64253a(String str) throws IOException {
        if (this.f54830a == null) {
            throw new RuntimeException("Need to call JodaTimeAndroid.init() before using joda-time-android");
        }
        String a = C15884d.m59940a(str);
        int a2 = C15884d.m59939a(C15882a.class, a);
        if (a2 != 0) {
            return this.f54830a.getResources().openRawResource(a2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resource not found: \"");
        stringBuilder.append(str);
        stringBuilder.append("\" (resName: \"");
        stringBuilder.append(a);
        stringBuilder.append("\")");
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: b */
    private org.joda.time.DateTimeZone m64256b(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.m64253a(r6);	 Catch:{ IOException -> 0x0020, all -> 0x001d }
        r2 = org.joda.time.tz.DateTimeZoneBuilder.a(r1, r6);	 Catch:{ IOException -> 0x001b }
        r3 = r5.f54831b;	 Catch:{ IOException -> 0x001b }
        r4 = new java.lang.ref.SoftReference;	 Catch:{ IOException -> 0x001b }
        r4.<init>(r2);	 Catch:{ IOException -> 0x001b }
        r3.put(r6, r4);	 Catch:{ IOException -> 0x001b }
        if (r1 == 0) goto L_0x0018;
    L_0x0015:
        r1.close();	 Catch:{ IOException -> 0x0018 }
    L_0x0018:
        return r2;
    L_0x0019:
        r6 = move-exception;
        goto L_0x0030;
    L_0x001b:
        r2 = move-exception;
        goto L_0x0022;
    L_0x001d:
        r6 = move-exception;
        r1 = r0;
        goto L_0x0030;
    L_0x0020:
        r2 = move-exception;
        r1 = r0;
    L_0x0022:
        r5.m64257a(r2);	 Catch:{ all -> 0x0019 }
        r2 = r5.f54831b;	 Catch:{ all -> 0x0019 }
        r2.remove(r6);	 Catch:{ all -> 0x0019 }
        if (r1 == 0) goto L_0x002f;
    L_0x002c:
        r1.close();	 Catch:{ IOException -> 0x002f }
    L_0x002f:
        return r0;
    L_0x0030:
        if (r1 == 0) goto L_0x0035;
    L_0x0032:
        r1.close();	 Catch:{ IOException -> 0x0035 }
    L_0x0035:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.danlew.android.joda.e.b(java.lang.String):org.joda.time.DateTimeZone");
    }

    /* renamed from: a */
    private static java.util.Map<java.lang.String, java.lang.Object> m64254a(java.io.InputStream r3) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        r1 = new java.io.DataInputStream;
        r1.<init>(r3);
        net.danlew.android.joda.C17639e.m64255a(r1, r0);	 Catch:{ all -> 0x001d }
        r1.close();	 Catch:{ IOException -> 0x0010 }
    L_0x0010:
        r3 = "UTC";
        r1 = new java.lang.ref.SoftReference;
        r2 = org.joda.time.DateTimeZone.f8461a;
        r1.<init>(r2);
        r0.put(r3, r1);
        return r0;
    L_0x001d:
        r3 = move-exception;
        r1.close();	 Catch:{ IOException -> 0x0021 }
    L_0x0021:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.danlew.android.joda.e.a(java.io.InputStream):java.util.Map<java.lang.String, java.lang.Object>");
    }

    /* renamed from: a */
    private static void m64255a(java.io.DataInputStream r5, java.util.Map<java.lang.String, java.lang.Object> r6) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = r5.readUnsignedShort();
        r1 = new java.lang.String[r0];
        r2 = 0;
        r3 = 0;
    L_0x0008:
        if (r3 >= r0) goto L_0x0017;
    L_0x000a:
        r4 = r5.readUTF();
        r4 = r4.intern();
        r1[r3] = r4;
        r3 = r3 + 1;
        goto L_0x0008;
    L_0x0017:
        r0 = r5.readUnsignedShort();
    L_0x001b:
        if (r2 >= r0) goto L_0x0037;
    L_0x001d:
        r3 = r5.readUnsignedShort();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002f }
        r3 = r1[r3];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002f }
        r4 = r5.readUnsignedShort();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002f }
        r4 = r1[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002f }
        r6.put(r3, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x002f }
        r2 = r2 + 1;
        goto L_0x001b;
    L_0x002f:
        r5 = new java.io.IOException;
        r6 = "Corrupt zone info map";
        r5.<init>(r6);
        throw r5;
    L_0x0037:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.danlew.android.joda.e.a(java.io.DataInputStream, java.util.Map):void");
    }
}
