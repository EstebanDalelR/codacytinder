package com.facebook.ads.internal.p041h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.C1418g;
import com.facebook.ads.internal.p043j.p044a.C1433a;
import com.facebook.ads.internal.p047k.p048a.C1475a;
import com.facebook.ads.internal.server.C1528b;
import com.facebook.ads.internal.server.C1529c;
import com.tinder.domain.fastmatch.model.DefaultFastMatchValues;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.h.e */
public class C1424e {
    /* renamed from: a */
    private static final String f3926a = "e";
    /* renamed from: b */
    private static final String f3927b = C1528b.m5384b();
    /* renamed from: c */
    private final C1423a f3928c;
    /* renamed from: d */
    private final ThreadPoolExecutor f3929d;
    /* renamed from: e */
    private final ConnectivityManager f3930e;
    /* renamed from: f */
    private final C1433a f3931f;
    /* renamed from: g */
    private final Handler f3932g;
    /* renamed from: h */
    private final long f3933h;
    /* renamed from: i */
    private final long f3934i;
    /* renamed from: j */
    private final C1529c f3935j;
    /* renamed from: k */
    private final Runnable f3936k = new C14221(this);
    /* renamed from: l */
    private volatile boolean f3937l;
    /* renamed from: m */
    private int f3938m;
    /* renamed from: n */
    private long f3939n;

    /* renamed from: com.facebook.ads.internal.h.e$1 */
    class C14221 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1424e f3925a;

        /* renamed from: com.facebook.ads.internal.h.e$1$1 */
        class C14211 extends AsyncTask<Void, Void, Void> {
            /* renamed from: a */
            final /* synthetic */ C14221 f3924a;

            C14211(C14221 c14221) {
                this.f3924a = c14221;
            }

            /* renamed from: a */
            protected java.lang.Void m4966a(java.lang.Void... r5) {
                /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
                /*
                r4 = this;
                r5 = r4.f3924a;
                r5 = r5.f3925a;
                com.facebook.ads.internal.p041h.C1424e.m4974b(r5);
                r5 = r4.f3924a;
                r5 = r5.f3925a;
                r0 = r5.f3939n;
                r2 = 0;
                r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
                if (r5 <= 0) goto L_0x0020;
            L_0x0015:
                r5 = r4.f3924a;	 Catch:{ InterruptedException -> 0x0020 }
                r5 = r5.f3925a;	 Catch:{ InterruptedException -> 0x0020 }
                r0 = r5.f3939n;	 Catch:{ InterruptedException -> 0x0020 }
                java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0020 }
            L_0x0020:
                r5 = r4.f3924a;
                r5 = r5.f3925a;
                r5.m4977d();
                r5 = 0;
                return r5;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.e.1.1.a(java.lang.Void[]):java.lang.Void");
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m4966a((Void[]) objArr);
            }
        }

        C14221(C1424e c1424e) {
            this.f3925a = c1424e;
        }

        public void run() {
            this.f3925a.f3937l = false;
            if (this.f3925a.f3929d.getQueue().isEmpty()) {
                new C14211(this).executeOnExecutor(this.f3925a.f3929d, new Void[0]);
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.h.e$a */
    interface C1423a {
        /* renamed from: a */
        JSONObject mo1740a();

        /* renamed from: a */
        boolean mo1745a(JSONArray jSONArray);

        /* renamed from: b */
        void mo1746b();

        /* renamed from: c */
        boolean mo1749c();
    }

    C1424e(Context context, C1423a c1423a) {
        this.f3928c = c1423a;
        this.f3929d = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f3930e = (ConnectivityManager) context.getSystemService("connectivity");
        this.f3931f = C1475a.m5156b(context);
        this.f3932g = new Handler(Looper.getMainLooper());
        this.f3933h = C1418g.m4936g(context);
        this.f3934i = C1418g.m4937h(context);
        this.f3935j = new C1529c(context);
    }

    /* renamed from: a */
    private void m4972a(long j) {
        this.f3932g.postDelayed(this.f3936k, j);
    }

    /* renamed from: b */
    static /* synthetic */ int m4974b(C1424e c1424e) {
        int i = c1424e.f3938m + 1;
        c1424e.f3938m = i;
        return i;
    }

    /* renamed from: c */
    private void m4976c() {
        if (this.f3938m >= 5) {
            m4979e();
            m4981b();
            return;
        }
        this.f3939n = this.f3938m == 1 ? DefaultFastMatchValues.BOOST_NEW_COUNT_FETCH_INTERVAL : this.f3939n * 2;
        m4980a();
    }

    @android.support.annotation.WorkerThread
    /* renamed from: d */
    private void m4977d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f3930e;	 Catch:{ Exception -> 0x009f }
        r0 = r0.getActiveNetworkInfo();	 Catch:{ Exception -> 0x009f }
        if (r0 == 0) goto L_0x0099;	 Catch:{ Exception -> 0x009f }
    L_0x0008:
        r0 = r0.isConnectedOrConnecting();	 Catch:{ Exception -> 0x009f }
        if (r0 != 0) goto L_0x0010;	 Catch:{ Exception -> 0x009f }
    L_0x000e:
        goto L_0x0099;	 Catch:{ Exception -> 0x009f }
    L_0x0010:
        r0 = r4.f3928c;	 Catch:{ Exception -> 0x009f }
        r0 = r0.mo1740a();	 Catch:{ Exception -> 0x009f }
        if (r0 != 0) goto L_0x001c;	 Catch:{ Exception -> 0x009f }
    L_0x0018:
        r4.m4979e();	 Catch:{ Exception -> 0x009f }
        return;	 Catch:{ Exception -> 0x009f }
    L_0x001c:
        r1 = new org.json.JSONObject;	 Catch:{ Exception -> 0x009f }
        r1.<init>();	 Catch:{ Exception -> 0x009f }
        r2 = "attempt";	 Catch:{ Exception -> 0x009f }
        r3 = r4.f3938m;	 Catch:{ Exception -> 0x009f }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x009f }
        r1.put(r2, r3);	 Catch:{ Exception -> 0x009f }
        r2 = r4.f3935j;	 Catch:{ Exception -> 0x009f }
        r2 = r2.m5387b();	 Catch:{ Exception -> 0x009f }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x009f }
        if (r2 != 0) goto L_0x0048;	 Catch:{ Exception -> 0x009f }
    L_0x0038:
        r2 = "client_response";	 Catch:{ Exception -> 0x009f }
        r3 = r4.f3935j;	 Catch:{ Exception -> 0x009f }
        r3 = r3.m5387b();	 Catch:{ Exception -> 0x009f }
        r1.put(r2, r3);	 Catch:{ Exception -> 0x009f }
        r2 = r4.f3935j;	 Catch:{ Exception -> 0x009f }
        r2.m5385a();	 Catch:{ Exception -> 0x009f }
    L_0x0048:
        r2 = "data";	 Catch:{ Exception -> 0x009f }
        r0.put(r2, r1);	 Catch:{ Exception -> 0x009f }
        r1 = new com.facebook.ads.internal.j.a.p;	 Catch:{ Exception -> 0x009f }
        r1.<init>();	 Catch:{ Exception -> 0x009f }
        r2 = "payload";	 Catch:{ Exception -> 0x009f }
        r0 = r0.toString();	 Catch:{ Exception -> 0x009f }
        r1.m5052a(r2, r0);	 Catch:{ Exception -> 0x009f }
        r0 = r4.f3931f;	 Catch:{ Exception -> 0x009f }
        r2 = f3927b;	 Catch:{ Exception -> 0x009f }
        r0 = r0.m5024b(r2, r1);	 Catch:{ Exception -> 0x009f }
        if (r0 == 0) goto L_0x006a;	 Catch:{ Exception -> 0x009f }
    L_0x0065:
        r1 = r0.m5046e();	 Catch:{ Exception -> 0x009f }
        goto L_0x006b;	 Catch:{ Exception -> 0x009f }
    L_0x006a:
        r1 = 0;	 Catch:{ Exception -> 0x009f }
    L_0x006b:
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Exception -> 0x009f }
        if (r2 == 0) goto L_0x0075;	 Catch:{ Exception -> 0x009f }
    L_0x0071:
        r4.m4976c();	 Catch:{ Exception -> 0x009f }
        return;	 Catch:{ Exception -> 0x009f }
    L_0x0075:
        r0 = r0.m5042a();	 Catch:{ Exception -> 0x009f }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ Exception -> 0x009f }
        if (r0 == r2) goto L_0x007e;	 Catch:{ Exception -> 0x009f }
    L_0x007d:
        goto L_0x0071;	 Catch:{ Exception -> 0x009f }
    L_0x007e:
        r0 = r4.f3928c;	 Catch:{ Exception -> 0x009f }
        r2 = new org.json.JSONArray;	 Catch:{ Exception -> 0x009f }
        r2.<init>(r1);	 Catch:{ Exception -> 0x009f }
        r0 = r0.mo1745a(r2);	 Catch:{ Exception -> 0x009f }
        if (r0 != 0) goto L_0x008c;	 Catch:{ Exception -> 0x009f }
    L_0x008b:
        goto L_0x0071;	 Catch:{ Exception -> 0x009f }
    L_0x008c:
        r0 = r4.f3928c;	 Catch:{ Exception -> 0x009f }
        r0 = r0.mo1749c();	 Catch:{ Exception -> 0x009f }
        if (r0 == 0) goto L_0x0095;	 Catch:{ Exception -> 0x009f }
    L_0x0094:
        goto L_0x0071;	 Catch:{ Exception -> 0x009f }
    L_0x0095:
        r4.m4979e();	 Catch:{ Exception -> 0x009f }
        return;	 Catch:{ Exception -> 0x009f }
    L_0x0099:
        r0 = r4.f3934i;	 Catch:{ Exception -> 0x009f }
        r4.m4972a(r0);	 Catch:{ Exception -> 0x009f }
        return;
    L_0x009f:
        r4.m4976c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.h.e.d():void");
    }

    /* renamed from: e */
    private void m4979e() {
        this.f3938m = 0;
        this.f3939n = 0;
        if (this.f3929d.getQueue().size() == 0) {
            this.f3928c.mo1746b();
        }
    }

    /* renamed from: a */
    void m4980a() {
        this.f3937l = true;
        this.f3932g.removeCallbacks(this.f3936k);
        m4972a(this.f3933h);
    }

    /* renamed from: b */
    void m4981b() {
        if (!this.f3937l) {
            this.f3937l = true;
            this.f3932g.removeCallbacks(this.f3936k);
            m4972a(this.f3934i);
        }
    }
}
