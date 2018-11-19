package okhttp3.internal.cache;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.C15957l;
import okhttp3.C15957l.C15956a;
import okhttp3.C15966s;
import okhttp3.Interceptor;
import okhttp3.internal.C15900a;
import okhttp3.internal.C15908c;
import okhttp3.internal.http.C17663g;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C15976k;
import okio.C15982q;
import okio.C18549c;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.cache.a */
public final class C17656a implements Interceptor {
    /* renamed from: a */
    final InternalCache f54882a;

    public C17656a(InternalCache internalCache) {
        this.f54882a = internalCache;
    }

    public okhttp3.C15966s intercept(okhttp3.Interceptor.Chain r6) throws java.io.IOException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r5 = this;
        r0 = r5.f54882a;
        if (r0 == 0) goto L_0x000f;
    L_0x0004:
        r0 = r5.f54882a;
        r1 = r6.request();
        r0 = r0.get(r1);
        goto L_0x0010;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        r1 = java.lang.System.currentTimeMillis();
        r3 = new okhttp3.internal.cache.b$a;
        r4 = r6.request();
        r3.<init>(r1, r4, r0);
        r1 = r3.m60186a();
        r2 = r1.f49275a;
        r3 = r1.f49276b;
        r4 = r5.f54882a;
        if (r4 == 0) goto L_0x002e;
    L_0x0029:
        r4 = r5.f54882a;
        r4.trackResponse(r1);
    L_0x002e:
        if (r0 == 0) goto L_0x0039;
    L_0x0030:
        if (r3 != 0) goto L_0x0039;
    L_0x0032:
        r1 = r0.m60560h();
        okhttp3.internal.C15908c.m60165a(r1);
    L_0x0039:
        if (r2 != 0) goto L_0x0075;
    L_0x003b:
        if (r3 != 0) goto L_0x0075;
    L_0x003d:
        r0 = new okhttp3.s$a;
        r0.<init>();
        r6 = r6.request();
        r6 = r0.m60543a(r6);
        r0 = okhttp3.Protocol.HTTP_1_1;
        r6 = r6.m60540a(r0);
        r0 = 504; // 0x1f8 float:7.06E-43 double:2.49E-321;
        r6 = r6.m60536a(r0);
        r0 = "Unsatisfiable Request (only-if-cached)";
        r6 = r6.m60538a(r0);
        r0 = okhttp3.internal.C15908c.f49247c;
        r6 = r6.m60545a(r0);
        r0 = -1;
        r6 = r6.m60537a(r0);
        r0 = java.lang.System.currentTimeMillis();
        r6 = r6.m60547b(r0);
        r6 = r6.m60546a();
        return r6;
    L_0x0075:
        if (r2 != 0) goto L_0x0088;
    L_0x0077:
        r6 = r3.m60561i();
        r0 = okhttp3.internal.cache.C17656a.m64295a(r3);
        r6 = r6.m60549b(r0);
        r6 = r6.m60546a();
        return r6;
    L_0x0088:
        r6 = r6.proceed(r2);	 Catch:{ all -> 0x0135 }
        if (r6 != 0) goto L_0x0097;
    L_0x008e:
        if (r0 == 0) goto L_0x0097;
    L_0x0090:
        r0 = r0.m60560h();
        okhttp3.internal.C15908c.m60165a(r0);
    L_0x0097:
        if (r3 == 0) goto L_0x00f2;
    L_0x0099:
        r0 = r6.m60555c();
        r1 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r0 != r1) goto L_0x00eb;
    L_0x00a1:
        r0 = r3.m60561i();
        r1 = r3.m60559g();
        r2 = r6.m60559g();
        r1 = okhttp3.internal.cache.C17656a.m64293a(r1, r2);
        r0 = r0.m60542a(r1);
        r1 = r6.m60565m();
        r0 = r0.m60537a(r1);
        r1 = r6.m60566n();
        r0 = r0.m60547b(r1);
        r1 = okhttp3.internal.cache.C17656a.m64295a(r3);
        r0 = r0.m60549b(r1);
        r1 = okhttp3.internal.cache.C17656a.m64295a(r6);
        r0 = r0.m60544a(r1);
        r0 = r0.m60546a();
        r6 = r6.m60560h();
        r6.close();
        r6 = r5.f54882a;
        r6.trackConditionalCacheHit();
        r6 = r5.f54882a;
        r6.update(r3, r0);
        return r0;
    L_0x00eb:
        r0 = r3.m60560h();
        okhttp3.internal.C15908c.m60165a(r0);
    L_0x00f2:
        r0 = r6.m60561i();
        r1 = okhttp3.internal.cache.C17656a.m64295a(r3);
        r0 = r0.m60549b(r1);
        r6 = okhttp3.internal.cache.C17656a.m64295a(r6);
        r6 = r0.m60544a(r6);
        r6 = r6.m60546a();
        r0 = r5.f54882a;
        if (r0 == 0) goto L_0x0134;
    L_0x010e:
        r0 = okhttp3.internal.http.C15925d.m60273d(r6);
        if (r0 == 0) goto L_0x0125;
    L_0x0114:
        r0 = okhttp3.internal.cache.C15910b.m60187a(r6, r2);
        if (r0 == 0) goto L_0x0125;
    L_0x011a:
        r0 = r5.f54882a;
        r0 = r0.put(r6);
        r6 = r5.m64294a(r0, r6);
        return r6;
    L_0x0125:
        r0 = r2.m60527b();
        r0 = okhttp3.internal.http.C15926e.m60275a(r0);
        if (r0 == 0) goto L_0x0134;
    L_0x012f:
        r0 = r5.f54882a;	 Catch:{ IOException -> 0x0134 }
        r0.remove(r2);	 Catch:{ IOException -> 0x0134 }
    L_0x0134:
        return r6;
    L_0x0135:
        r6 = move-exception;
        if (r0 == 0) goto L_0x013f;
    L_0x0138:
        r0 = r0.m60560h();
        okhttp3.internal.C15908c.m60165a(r0);
    L_0x013f:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.a.intercept(okhttp3.Interceptor$Chain):okhttp3.s");
    }

    /* renamed from: a */
    private static C15966s m64295a(C15966s c15966s) {
        return (c15966s == null || c15966s.m60560h() == null) ? c15966s : c15966s.m60561i().m60545a(null).m60546a();
    }

    /* renamed from: a */
    private C15966s m64294a(final CacheRequest cacheRequest, C15966s c15966s) throws IOException {
        if (cacheRequest == null) {
            return c15966s;
        }
        Sink body = cacheRequest.body();
        if (body == null) {
            return c15966s;
        }
        final BufferedSource source = c15966s.m60560h().source();
        final BufferedSink a = C15976k.m60608a(body);
        Source c176551 = new Source(this) {
            /* renamed from: a */
            boolean f54877a;
            /* renamed from: e */
            final /* synthetic */ C17656a f54881e;

            public long read(C18549c c18549c, long j) throws IOException {
                try {
                    j = source.read(c18549c, j);
                    if (j == -1) {
                        if (this.f54877a == null) {
                            this.f54877a = true;
                            a.close();
                        }
                        return -1;
                    }
                    c18549c.m66953a(a.buffer(), c18549c.m66945a() - j, j);
                    a.emitCompleteSegments();
                    return j;
                } catch (C18549c c18549c2) {
                    if (this.f54877a == null) {
                        this.f54877a = true;
                        cacheRequest.abort();
                    }
                    throw c18549c2;
                }
            }

            public C15982q timeout() {
                return source.timeout();
            }

            public void close() throws IOException {
                if (!(this.f54877a || C15908c.m60170a((Source) this, 100, TimeUnit.MILLISECONDS))) {
                    this.f54877a = true;
                    cacheRequest.abort();
                }
                source.close();
            }
        };
        return c15966s.m60561i().m60545a(new C17663g(c15966s.m60551a(ManagerWebServices.PARAM_CONTENT_TYPE), c15966s.m60560h().contentLength(), C15976k.m60609a(c176551))).m60546a();
    }

    /* renamed from: a */
    private static C15957l m64293a(C15957l c15957l, C15957l c15957l2) {
        C15956a c15956a = new C15956a();
        int a = c15957l.m60473a();
        for (int i = 0; i < a; i++) {
            String a2 = c15957l.m60474a(i);
            String b = c15957l.m60476b(i);
            if (!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) {
                if (C17656a.m64297b(a2) || !C17656a.m64296a(a2) || c15957l2.m60475a(a2) == null) {
                    C15900a.f49230a.mo13405a(c15956a, a2, b);
                }
            }
        }
        c15957l = c15957l2.m60473a();
        for (int i2 = 0; i2 < c15957l; i2++) {
            String a3 = c15957l2.m60474a(i2);
            if (!C17656a.m64297b(a3) && C17656a.m64296a(a3)) {
                C15900a.f49230a.mo13405a(c15956a, a3, c15957l2.m60476b(i2));
            }
        }
        return c15956a.m60466a();
    }

    /* renamed from: a */
    static boolean m64296a(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str) != null) ? null : true;
    }

    /* renamed from: b */
    static boolean m64297b(String str) {
        if (!("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str))) {
            if (ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(str) == null) {
                return null;
            }
        }
        return true;
    }
}
