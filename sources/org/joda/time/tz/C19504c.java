package org.joda.time.tz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.c */
public class C19504c implements Provider {
    /* renamed from: a */
    private final File f60900a;
    /* renamed from: b */
    private final String f60901b;
    /* renamed from: c */
    private final ClassLoader f60902c;
    /* renamed from: d */
    private final Map<String, Object> f60903d;
    /* renamed from: e */
    private final Set<String> f60904e;

    public C19504c(File file) throws IOException {
        if (file == null) {
            throw new IllegalArgumentException("No file directory provided");
        } else if (!file.exists()) {
            r1 = new StringBuilder();
            r1.append("File directory doesn't exist: ");
            r1.append(file);
            throw new IOException(r1.toString());
        } else if (file.isDirectory()) {
            this.f60900a = file;
            this.f60901b = null;
            this.f60902c = null;
            this.f60903d = C19504c.m70373a(m70371a("ZoneInfoMap"));
            this.f60904e = Collections.unmodifiableSortedSet(new TreeSet(this.f60903d.keySet()));
        } else {
            r1 = new StringBuilder();
            r1.append("File doesn't refer to a directory: ");
            r1.append(file);
            throw new IOException(r1.toString());
        }
    }

    public C19504c(String str) throws IOException {
        this(str, null, false);
    }

    private C19504c(String str, ClassLoader classLoader, boolean z) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("No resource path provided");
        }
        if (!str.endsWith("/")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('/');
            str = stringBuilder.toString();
        }
        this.f60900a = null;
        this.f60901b = str;
        if (classLoader == null && !z) {
            classLoader = getClass().getClassLoader();
        }
        this.f60902c = classLoader;
        this.f60903d = C19504c.m70373a(m70371a("ZoneInfoMap"));
        this.f60904e = Collections.unmodifiableSortedSet(new TreeSet(this.f60903d.keySet()));
    }

    public DateTimeZone getZone(String str) {
        if (str == null) {
            return null;
        }
        Object obj = this.f60903d.get(str);
        if (obj == null) {
            return null;
        }
        if (obj instanceof SoftReference) {
            DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
            if (dateTimeZone != null) {
                return dateTimeZone;
            }
            return m70375b(str);
        } else if (str.equals(obj)) {
            return m70375b(str);
        } else {
            return getZone((String) obj);
        }
    }

    public Set<String> getAvailableIDs() {
        return this.f60904e;
    }

    /* renamed from: a */
    protected void m70376a(Exception exception) {
        exception.printStackTrace();
    }

    /* renamed from: a */
    private InputStream m70371a(String str) throws IOException {
        if (this.f60900a != null) {
            return new FileInputStream(new File(this.f60900a, str));
        }
        str = this.f60901b.concat(str);
        InputStream inputStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>(this) {
            /* renamed from: b */
            final /* synthetic */ C19504c f60299b;

            public /* synthetic */ Object run() {
                return m69338a();
            }

            /* renamed from: a */
            public InputStream m69338a() {
                if (this.f60299b.f60902c != null) {
                    return this.f60299b.f60902c.getResourceAsStream(str);
                }
                return ClassLoader.getSystemResourceAsStream(str);
            }
        });
        if (inputStream != null) {
            return inputStream;
        }
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Resource not found: \"");
        stringBuilder.append(str);
        stringBuilder.append("\" ClassLoader: ");
        stringBuilder.append(this.f60902c != null ? this.f60902c.toString() : "system");
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: b */
    private org.joda.time.DateTimeZone m70375b(java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.m70371a(r6);	 Catch:{ IOException -> 0x0020, all -> 0x001d }
        r2 = org.joda.time.tz.DateTimeZoneBuilder.m69337a(r1, r6);	 Catch:{ IOException -> 0x001b }
        r3 = r5.f60903d;	 Catch:{ IOException -> 0x001b }
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
        r5.m70376a(r2);	 Catch:{ all -> 0x0019 }
        r2 = r5.f60903d;	 Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.c.b(java.lang.String):org.joda.time.DateTimeZone");
    }

    /* renamed from: a */
    private static java.util.Map<java.lang.String, java.lang.Object> m70373a(java.io.InputStream r3) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = new java.util.concurrent.ConcurrentHashMap;
        r0.<init>();
        r1 = new java.io.DataInputStream;
        r1.<init>(r3);
        org.joda.time.tz.C19504c.m70374a(r1, r0);	 Catch:{ all -> 0x001d }
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
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.c.a(java.io.InputStream):java.util.Map<java.lang.String, java.lang.Object>");
    }

    /* renamed from: a */
    private static void m70374a(java.io.DataInputStream r5, java.util.Map<java.lang.String, java.lang.Object> r6) throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.tz.c.a(java.io.DataInputStream, java.util.Map):void");
    }
}
