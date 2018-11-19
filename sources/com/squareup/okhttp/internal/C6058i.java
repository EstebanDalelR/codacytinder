package com.squareup.okhttp.internal;

import com.squareup.okhttp.HttpUrl;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* renamed from: com.squareup.okhttp.internal.i */
public final class C6058i {
    /* renamed from: a */
    public static final byte[] f22207a = new byte[0];
    /* renamed from: b */
    public static final String[] f22208b = new String[0];
    /* renamed from: c */
    public static final Charset f22209c = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m26246a(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j) {
            if (j - j2 >= j3) {
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    public static boolean m26251a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || obj.equals(obj2) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m26247a(java.io.Closeable r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.i.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    public static void m26249a(java.net.Socket r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r1 == 0) goto L_0x0010;
    L_0x0002:
        r1.close();	 Catch:{ AssertionError -> 0x0008, RuntimeException -> 0x0006, Exception -> 0x0010 }
        goto L_0x0010;
    L_0x0006:
        r1 = move-exception;
        throw r1;
    L_0x0008:
        r1 = move-exception;
        r0 = com.squareup.okhttp.internal.C6058i.m26250a(r1);
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        throw r1;
    L_0x0010:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.i.a(java.net.Socket):void");
    }

    /* renamed from: a */
    public static void m26248a(Closeable closeable, Closeable closeable2) throws IOException {
        try {
            closeable.close();
            closeable = null;
        } catch (Throwable th) {
            closeable = th;
        }
        try {
            closeable2.close();
        } catch (Closeable closeable22) {
            if (closeable == null) {
                closeable = closeable22;
            }
        }
        if (closeable != null) {
            if ((closeable instanceof IOException) != null) {
                throw ((IOException) closeable);
            } else if ((closeable instanceof RuntimeException) != null) {
                throw ((RuntimeException) closeable);
            } else if ((closeable instanceof Error) != null) {
                throw ((Error) closeable);
            } else {
                throw new AssertionError(closeable);
            }
        }
    }

    /* renamed from: a */
    public static boolean m26252a(okio.Source r0, int r1, java.util.concurrent.TimeUnit r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.squareup.okhttp.internal.C6058i.m26255b(r0, r1, r2);	 Catch:{ IOException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.i.a(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: b */
    public static boolean m26255b(okio.Source r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = java.lang.System.nanoTime();
        r2 = r11.timeout();
        r2 = r2.o_();
        r3 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r2 == 0) goto L_0x001e;
    L_0x0013:
        r2 = r11.timeout();
        r5 = r2.d();
        r7 = r5 - r0;
        goto L_0x001f;
    L_0x001e:
        r7 = r3;
    L_0x001f:
        r2 = r11.timeout();
        r5 = (long) r12;
        r12 = r13.toNanos(r5);
        r12 = java.lang.Math.min(r7, r12);
        r5 = r0 + r12;
        r2.a(r5);
        r12 = new okio.c;	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
        r12.<init>();	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
    L_0x0036:
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
        r5 = r11.read(r12, r5);	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
        r9 = -1;	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
        r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
        if (r13 == 0) goto L_0x0046;	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
    L_0x0042:
        r12.d();	 Catch:{ InterruptedIOException -> 0x0074, all -> 0x005d }
        goto L_0x0036;
    L_0x0046:
        r12 = 1;
        r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x0053;
    L_0x004b:
        r11 = r11.timeout();
        r11.f();
        goto L_0x005c;
    L_0x0053:
        r11 = r11.timeout();
        r2 = r0 + r7;
        r11.a(r2);
    L_0x005c:
        return r12;
    L_0x005d:
        r12 = move-exception;
        r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x006a;
    L_0x0062:
        r11 = r11.timeout();
        r11.f();
        goto L_0x0073;
    L_0x006a:
        r11 = r11.timeout();
        r2 = r0 + r7;
        r11.a(r2);
    L_0x0073:
        throw r12;
    L_0x0074:
        r12 = 0;
        r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x0081;
    L_0x0079:
        r11 = r11.timeout();
        r11.f();
        goto L_0x008a;
    L_0x0081:
        r11 = r11.timeout();
        r2 = r0 + r7;
        r11.a(r2);
    L_0x008a:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.i.b(okio.Source, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: a */
    public static String m26239a(String str) {
        try {
            return ByteString.a(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).f();
        } catch (String str2) {
            throw new AssertionError(str2);
        }
    }

    /* renamed from: a */
    public static ByteString m26245a(ByteString byteString) {
        try {
            return ByteString.a(MessageDigest.getInstance("SHA-1").digest(byteString.i()));
        } catch (ByteString byteString2) {
            throw new AssertionError(byteString2);
        }
    }

    /* renamed from: a */
    public static <T> List<T> m26240a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <T> List<T> m26241a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m26243a(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: a */
    public static ThreadFactory m26244a(final String str, final boolean z) {
        return new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* renamed from: a */
    public static <T> T[] m26254a(Class<T> cls, T[] tArr, T[] tArr2) {
        tArr = C6058i.m26242a((Object[]) tArr, (Object[]) tArr2);
        return tArr.toArray((Object[]) Array.newInstance(cls, tArr.size()));
    }

    /* renamed from: a */
    private static <T> List<T> m26242a(T[] tArr, T[] tArr2) {
        List<T> arrayList = new ArrayList();
        for (Object obj : tArr) {
            for (Object obj2 : tArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m26238a(HttpUrl httpUrl) {
        if (httpUrl.m25745h() == HttpUrl.m25720a(httpUrl.m25740c())) {
            return httpUrl.m25744g();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(httpUrl.m25744g());
        stringBuilder.append(":");
        stringBuilder.append(httpUrl.m25745h());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static boolean m26250a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || assertionError.getMessage().contains("getsockname failed") == null) ? null : true;
    }

    /* renamed from: a */
    public static boolean m26253a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    /* renamed from: b */
    public static String[] m26256b(String[] strArr, String str) {
        Object obj = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, obj, 0, strArr.length);
        obj[obj.length - 1] = str;
        return obj;
    }
}
