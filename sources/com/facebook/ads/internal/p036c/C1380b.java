package com.facebook.ads.internal.p036c;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: com.facebook.ads.internal.c.b */
public class C1380b {
    /* renamed from: a */
    private static final String f3733a = "b";
    /* renamed from: b */
    private static final ExecutorService f3734b = Executors.newFixedThreadPool(5);
    /* renamed from: c */
    private final Handler f3735c = new Handler();
    /* renamed from: d */
    private final C1381c f3736d;
    /* renamed from: e */
    private final C1383d f3737e;
    /* renamed from: f */
    private final List<Callable<Boolean>> f3738f;

    /* renamed from: com.facebook.ads.internal.c.b$a */
    private class C1378a implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1380b f3729a;
        /* renamed from: b */
        private final String f3730b;

        public C1378a(C1380b c1380b, String str) {
            this.f3729a = c1380b;
            this.f3730b = str;
        }

        /* renamed from: a */
        public Boolean m4799a() {
            this.f3729a.f3736d.m4814a(this.f3730b);
            return Boolean.valueOf(true);
        }

        public /* synthetic */ Object call() {
            return m4799a();
        }
    }

    /* renamed from: com.facebook.ads.internal.c.b$b */
    private class C1379b implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1380b f3731a;
        /* renamed from: b */
        private final String f3732b;

        public C1379b(C1380b c1380b, String str) {
            this.f3731a = c1380b;
            this.f3732b = str;
        }

        /* renamed from: a */
        public Boolean m4800a() {
            this.f3731a.f3737e.m4819a(this.f3732b);
            return Boolean.valueOf(true);
        }

        public /* synthetic */ Object call() {
            return m4800a();
        }
    }

    public C1380b(Context context) {
        this.f3736d = C1381c.m4810a(context);
        this.f3737e = C1383d.m4817a(context);
        this.f3738f = new ArrayList();
    }

    /* renamed from: a */
    public void m4806a(@Nullable final C1374a c1374a) {
        final ArrayList arrayList = new ArrayList(this.f3738f);
        f3734b.submit(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C1380b f3728c;

            /* renamed from: com.facebook.ads.internal.c.b$1$1 */
            class C13751 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C13771 f3724a;

                C13751(C13771 c13771) {
                    this.f3724a = c13771;
                }

                public void run() {
                    if (c1374a != null) {
                        c1374a.mo1674b();
                    }
                }
            }

            /* renamed from: com.facebook.ads.internal.c.b$1$2 */
            class C13762 implements Runnable {
                /* renamed from: a */
                final /* synthetic */ C13771 f3725a;

                C13762(C13771 c13771) {
                    this.f3725a = c13771;
                }

                public void run() {
                    if (c1374a != null) {
                        c1374a.mo1673a();
                    }
                }
            }

            public void run() {
                Handler a;
                Runnable c13762;
                List<Future> arrayList = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C1380b.f3734b.submit((Callable) it.next()));
                }
                try {
                    for (Future future : arrayList) {
                        future.get();
                    }
                    a = this.f3728c.f3735c;
                    c13762 = new C13762(this);
                } catch (Throwable e) {
                    Log.e(C1380b.f3733a, "Exception while executing cache downloads.", e);
                    a = this.f3728c.f3735c;
                    c13762 = new C13751(this);
                }
                a.post(c13762);
            }
        });
        this.f3738f.clear();
    }

    /* renamed from: a */
    public void m4807a(String str) {
        this.f3738f.add(new C1378a(this, str));
    }

    /* renamed from: b */
    public void m4808b(String str) {
        this.f3738f.add(new C1379b(this, str));
    }

    /* renamed from: c */
    public String m4809c(String str) {
        return this.f3737e.m4820b(str);
    }
}
