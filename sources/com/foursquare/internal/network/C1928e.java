package com.foursquare.internal.network;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.foursquare.api.types.FoursquareType;
import com.foursquare.internal.network.C1931f.C1930a;
import com.foursquare.internal.util.FsLog;
import java.lang.ref.WeakReference;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.foursquare.internal.network.e */
public class C1928e {
    /* renamed from: a */
    public static final String f5192a = "com.foursquare.internal.network.e";
    /* renamed from: b */
    private static C1928e f5193b;
    /* renamed from: c */
    private static Map<String, C1926b> f5194c = new Hashtable();
    /* renamed from: d */
    private ThreadPoolExecutor f5195d = new C1925a(this, 100);
    /* renamed from: e */
    private Handler f5196e = new Handler(Looper.getMainLooper(), new C19241(this));

    /* renamed from: com.foursquare.internal.network.e$1 */
    class C19241 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C1928e f5185a;

        C19241(C1928e c1928e) {
            this.f5185a = c1928e;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r11) {
            /*
            r10 = this;
            r0 = r11.what;
            r1 = 1;
            r2 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
            if (r0 != r2) goto L_0x0020;
        L_0x0007:
            r11 = r11.obj;
            r11 = (com.foursquare.internal.network.C1928e.C1926b) r11;
            r11 = r11.m6753b();
            r11 = r11.get();
            r11 = (com.foursquare.internal.network.C1919a) r11;
            if (r11 != 0) goto L_0x0018;
        L_0x0017:
            return r1;
        L_0x0018:
            r0 = r11.getId();
            r11.m6685a(r0);
            return r1;
        L_0x0020:
            r0 = r11.what;
            r2 = 801; // 0x321 float:1.122E-42 double:3.957E-321;
            r3 = 0;
            if (r0 != r2) goto L_0x0136;
        L_0x0027:
            r11 = r11.obj;
            r11 = (com.foursquare.internal.network.C1928e.C1927c) r11;
            r0 = r11.f5191a;
            r0 = r0.m6753b();
            r0 = r0.get();
            r0 = (com.foursquare.internal.network.C1919a) r0;
            r2 = r11.f5191a;
            r2 = r2.isCancelled();
            if (r2 == 0) goto L_0x0044;
        L_0x0043:
            return r1;
        L_0x0044:
            r2 = r11.f5191a;	 Catch:{ Exception -> 0x00ec }
            r2 = r2.get();	 Catch:{ Exception -> 0x00ec }
            r2 = (com.foursquare.internal.network.C1932g) r2;	 Catch:{ Exception -> 0x00ec }
            if (r0 != 0) goto L_0x0061;
        L_0x0050:
            r11 = r11.f5191a;
            r11.m6752a(r1);
            if (r0 == 0) goto L_0x0060;
        L_0x0059:
            r11 = r0.getId();
            r0.m6687b(r11);
        L_0x0060:
            return r3;
        L_0x0061:
            r8 = r2.m6772b();	 Catch:{ Exception -> 0x00ec }
            r4 = r2.m6775d();	 Catch:{ Exception -> 0x00ec }
            if (r4 == 0) goto L_0x0098;
        L_0x006b:
            r5 = r0.getId();	 Catch:{ Exception -> 0x00ec }
            r6 = r2.m6775d();	 Catch:{ Exception -> 0x00ec }
            r7 = r2.m6776e();	 Catch:{ Exception -> 0x00ec }
            r8 = r2.m6772b();	 Catch:{ Exception -> 0x00ec }
            r2 = r11.f5191a;	 Catch:{ Exception -> 0x00ec }
            r9 = r2.m6749c();	 Catch:{ Exception -> 0x00ec }
            r4 = r0;
            r4.m6686a(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x00ec }
            r11 = r11.f5191a;
            r11.m6752a(r1);
            if (r0 == 0) goto L_0x0097;
        L_0x0090:
            r11 = r0.getId();
            r0.m6687b(r11);
        L_0x0097:
            return r3;
        L_0x0098:
            if (r8 != 0) goto L_0x00be;
        L_0x009a:
            r5 = r0.getId();	 Catch:{ Exception -> 0x00ec }
            r6 = com.foursquare.internal.network.FoursquareError.NO_RESPONSE;	 Catch:{ Exception -> 0x00ec }
            r7 = 0;
            r2 = r11.f5191a;	 Catch:{ Exception -> 0x00ec }
            r9 = r2.m6749c();	 Catch:{ Exception -> 0x00ec }
            r4 = r0;
            r4.m6686a(r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x00ec }
            r11 = r11.f5191a;
            r11.m6752a(r1);
            if (r0 == 0) goto L_0x00bd;
        L_0x00b6:
            r11 = r0.getId();
            r0.m6687b(r11);
        L_0x00bd:
            return r3;
        L_0x00be:
            r2 = new com.foursquare.internal.network.a$b;	 Catch:{ Exception -> 0x00ec }
            r4 = r0.getId();	 Catch:{ Exception -> 0x00ec }
            r2.<init>(r4, r3);	 Catch:{ Exception -> 0x00ec }
            r3 = r8.getMeta();	 Catch:{ Exception -> 0x00ec }
            r2.m6679a(r3);	 Catch:{ Exception -> 0x00ec }
            r3 = r11.f5191a;	 Catch:{ Exception -> 0x00ec }
            r3 = r3.m6749c();	 Catch:{ Exception -> 0x00ec }
            r2.m6680a(r3);	 Catch:{ Exception -> 0x00ec }
            r3 = r8.getResult();	 Catch:{ Exception -> 0x00ec }
            r0.m6684a(r3, r2);	 Catch:{ Exception -> 0x00ec }
            r11 = r11.f5191a;
            r11.m6752a(r1);
            if (r0 == 0) goto L_0x0124;
        L_0x00e9:
            goto L_0x011d;
        L_0x00ea:
            r2 = move-exception;
            goto L_0x0125;
        L_0x00ec:
            r2 = move-exception;
            r3 = com.foursquare.internal.network.C1928e.f5192a;	 Catch:{ all -> 0x00ea }
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ea }
            r4.<init>();	 Catch:{ all -> 0x00ea }
            r5 = com.foursquare.internal.network.C1928e.f5192a;	 Catch:{ all -> 0x00ea }
            r4.append(r5);	 Catch:{ all -> 0x00ea }
            r5 = ": Exception";
            r4.append(r5);	 Catch:{ all -> 0x00ea }
            r4 = r4.toString();	 Catch:{ all -> 0x00ea }
            com.foursquare.internal.util.FsLog.m6806c(r3, r4, r2);	 Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0114;
        L_0x0107:
            r5 = r0.getId();	 Catch:{ all -> 0x00ea }
            r6 = com.foursquare.internal.network.FoursquareError.IO_EXCEPTION;	 Catch:{ all -> 0x00ea }
            r7 = 0;
            r8 = 0;
            r9 = 0;
            r4 = r0;
            r4.m6686a(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00ea }
        L_0x0114:
            r11 = r11.f5191a;
            r11.m6752a(r1);
            if (r0 == 0) goto L_0x0124;
        L_0x011d:
            r11 = r0.getId();
            r0.m6687b(r11);
        L_0x0124:
            return r1;
        L_0x0125:
            r11 = r11.f5191a;
            r11.m6752a(r1);
            if (r0 == 0) goto L_0x0135;
        L_0x012e:
            r11 = r0.getId();
            r0.m6687b(r11);
        L_0x0135:
            throw r2;
        L_0x0136:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.e.1.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: com.foursquare.internal.network.e$a */
    private class C1925a extends ThreadPoolExecutor {
        /* renamed from: a */
        final /* synthetic */ C1928e f5186a;

        public C1925a(C1928e c1928e, int i) {
            this.f5186a = c1928e;
            super(i, i, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }

        protected void beforeExecute(Thread thread, Runnable runnable) {
            String str = C1928e.f5192a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("before Execute ");
            stringBuilder.append(runnable);
            FsLog.m6800a(str, stringBuilder.toString());
            super.beforeExecute(thread, runnable);
            C1926b c1926b = (C1926b) runnable;
            c1926b.m6752a((boolean) null);
            this.f5186a.f5196e.sendMessage(this.f5186a.f5196e.obtainMessage(800, c1926b));
        }

        protected void afterExecute(Runnable runnable, Throwable th) {
            String str = C1928e.f5192a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("after Execute ");
            stringBuilder.append(runnable);
            FsLog.m6800a(str, stringBuilder.toString());
            super.afterExecute(runnable, th);
            C1926b c1926b = (C1926b) runnable;
            th = c1926b.m6751a();
            str = C1928e.f5192a;
            stringBuilder = new StringBuilder();
            stringBuilder.append("notify id: ");
            stringBuilder.append(th);
            FsLog.m6800a(str, stringBuilder.toString());
            C1927c c1927c = new C1927c();
            c1927c.f5191a = c1926b;
            this.f5186a.f5196e.sendMessage(this.f5186a.f5196e.obtainMessage(801, c1927c));
            C1928e.f5194c.remove(th);
        }
    }

    /* renamed from: com.foursquare.internal.network.e$b */
    private static class C1926b extends FutureTask<C1932g<? extends FoursquareType>> implements Comparable<C1926b> {
        /* renamed from: a */
        private String f5187a;
        /* renamed from: b */
        private WeakReference<C1919a> f5188b;
        /* renamed from: c */
        private Request f5189c;
        /* renamed from: d */
        private boolean f5190d;

        /* renamed from: a */
        public int m6750a(C1926b c1926b) {
            return 0;
        }

        public /* synthetic */ int compareTo(Object obj) {
            return m6750a((C1926b) obj);
        }

        C1926b(Request request) {
            super(request);
        }

        /* renamed from: a */
        private void m6747a(String str) {
            this.f5187a = str;
        }

        /* renamed from: a */
        public String m6751a() {
            return this.f5187a;
        }

        /* renamed from: a */
        private void m6743a(C1919a c1919a) {
            this.f5188b = new WeakReference(c1919a);
        }

        /* renamed from: b */
        public WeakReference<C1919a> m6753b() {
            return this.f5188b;
        }

        /* renamed from: a */
        private void m6742a(Request request) {
            this.f5189c = request;
        }

        /* renamed from: c */
        private Request m6749c() {
            return this.f5189c;
        }

        /* renamed from: a */
        public void m6752a(boolean z) {
            this.f5190d = z;
        }
    }

    /* renamed from: com.foursquare.internal.network.e$c */
    private static class C1927c {
        /* renamed from: a */
        private C1926b f5191a;

        private C1927c() {
        }
    }

    /* renamed from: a */
    public static C1928e m6757a() {
        if (f5193b == null) {
            f5193b = new C1928e();
        }
        return f5193b;
    }

    private C1928e() {
    }

    /* renamed from: a */
    public void m6760a(Request<?> request) {
        m6761a(request, null);
    }

    /* renamed from: a */
    public <T extends FoursquareType> void m6761a(Request<T> request, C1919a<T> c1919a) {
        m6762a(request, c1919a, new C1930a().m6766a());
    }

    /* renamed from: a */
    public <T extends FoursquareType> void m6762a(@NonNull Request<T> request, @Nullable C1919a<T> c1919a, @NonNull C1931f c1931f) {
        request.mo2010b();
        request.m6674a(c1931f.f5199a);
        if (c1919a != null) {
            c1919a.setId(c1931f.f5200b);
        }
        if (TextUtils.isEmpty(c1931f.f5200b)) {
            c1931f.f5200b = C1928e.m6758b();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(".");
        stringBuilder.append(c1931f.f5200b);
        String stringBuilder2 = stringBuilder.toString();
        C1926b c1926b = new C1926b(request);
        c1926b.m6747a(stringBuilder2);
        c1926b.m6743a((C1919a) c1919a);
        c1926b.m6742a((Request) request);
        this.f5195d.execute(c1926b);
        f5194c.put(stringBuilder2, c1926b);
    }

    @WorkerThread
    @NonNull
    /* renamed from: b */
    public <T extends FoursquareType> C1932g<T> m6763b(Request<T> request) {
        request.mo2010b();
        return request.m6677c();
    }

    /* renamed from: b */
    static String m6758b() {
        String valueOf = String.valueOf(UUID.randomUUID());
        while (f5194c.containsKey(valueOf)) {
            valueOf = String.valueOf(UUID.randomUUID());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f5192a);
        stringBuilder.append(":");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }
}
