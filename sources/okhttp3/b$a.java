package okhttp3;

import java.io.IOException;
import okhttp3.internal.cache.C15915c.C15912a;
import okhttp3.internal.cache.CacheRequest;
import okio.C17703e;
import okio.Sink;

final class b$a implements CacheRequest {
    /* renamed from: a */
    boolean f54834a;
    /* renamed from: b */
    final /* synthetic */ C2670b f54835b;
    /* renamed from: c */
    private final C15912a f54836c;
    /* renamed from: d */
    private Sink f54837d;
    /* renamed from: e */
    private Sink f54838e;

    b$a(final C2670b c2670b, final C15912a c15912a) {
        this.f54835b = c2670b;
        this.f54836c = c15912a;
        this.f54837d = c15912a.m60188a(1);
        this.f54838e = new C17703e(this, this.f54837d) {
            /* renamed from: c */
            final /* synthetic */ b$a f57778c;

            public void close() throws IOException {
                synchronized (this.f57778c.f54835b) {
                    if (this.f57778c.f54834a) {
                        return;
                    }
                    this.f57778c.f54834a = true;
                    C2670b c2670b = this.f57778c.f54835b;
                    c2670b.f8456c++;
                    super.close();
                    c15912a.m60190b();
                }
            }
        };
    }

    public void abort() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = r4.f54835b;
        monitor-enter(r0);
        r1 = r4.f54834a;	 Catch:{ all -> 0x001f }
        if (r1 == 0) goto L_0x0009;	 Catch:{ all -> 0x001f }
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x001f }
        return;	 Catch:{ all -> 0x001f }
    L_0x0009:
        r1 = 1;	 Catch:{ all -> 0x001f }
        r4.f54834a = r1;	 Catch:{ all -> 0x001f }
        r2 = r4.f54835b;	 Catch:{ all -> 0x001f }
        r3 = r2.f8457d;	 Catch:{ all -> 0x001f }
        r3 = r3 + r1;	 Catch:{ all -> 0x001f }
        r2.f8457d = r3;	 Catch:{ all -> 0x001f }
        monitor-exit(r0);	 Catch:{ all -> 0x001f }
        r0 = r4.f54837d;
        okhttp3.internal.C15908c.m60165a(r0);
        r0 = r4.f54836c;	 Catch:{ IOException -> 0x001e }
        r0.m60191c();	 Catch:{ IOException -> 0x001e }
    L_0x001e:
        return;
    L_0x001f:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001f }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.b$a.abort():void");
    }

    public Sink body() {
        return this.f54838e;
    }
}
