package com.foursquare.pilgrim;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.foursquare.api.PilgrimException;
import com.foursquare.api.types.PilgrimEvent;
import com.foursquare.api.types.PilgrimEvent.EventLevel;
import com.foursquare.api.types.PilgrimEvent.EventType;
import com.foursquare.api.types.PilgrimStackTraceElement;
import com.foursquare.internal.api.C1913a;
import com.foursquare.internal.util.C1939a;
import com.foursquare.internal.util.C1948m;
import com.foursquare.internal.util.CollectionUtils;
import com.foursquare.internal.util.Func1;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestrictTo({Scope.LIBRARY_GROUP})
final class aq {
    /* renamed from: a */
    private static final Object f5306a = new Object();
    /* renamed from: b */
    private static String f5307b;

    /* renamed from: com.foursquare.pilgrim.aq$a */
    static class C1967a extends AsyncTask<PilgrimEvent, Void, Void> {
        @NonNull
        /* renamed from: a */
        private PilgrimEvent f5305a;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m6956a((PilgrimEvent[]) objArr);
        }

        C1967a(@NonNull PilgrimEvent pilgrimEvent) {
            this.f5305a = pilgrimEvent;
        }

        /* renamed from: a */
        protected Void m6956a(PilgrimEvent... pilgrimEventArr) {
            aq.m6964b(this.f5305a);
            return null;
        }
    }

    /* renamed from: com.foursquare.pilgrim.aq$1 */
    class C35281 extends TypeToken<List<PilgrimEvent>> {
        C35281() {
        }
    }

    /* renamed from: com.foursquare.pilgrim.aq$2 */
    class C35292 implements Func1<StackTraceElement, PilgrimStackTraceElement> {
        C35292() {
        }

        public /* synthetic */ Object call(Object obj) {
            return m13319a((StackTraceElement) obj);
        }

        /* renamed from: a */
        public PilgrimStackTraceElement m13319a(StackTraceElement stackTraceElement) {
            return PilgrimStackTraceElement.create(stackTraceElement);
        }
    }

    /* renamed from: a */
    static void m6961a(PilgrimEvent pilgrimEvent) {
        if (C1971b.m7059a()) {
            new C1967a(pilgrimEvent).execute(new PilgrimEvent[null]);
        } else {
            m6964b(pilgrimEvent);
        }
    }

    /* renamed from: b */
    static void m6964b(PilgrimEvent pilgrimEvent) {
        m6966c(pilgrimEvent);
        if (m6968d(pilgrimEvent) != null && m6967c() != null) {
            m6962a((boolean) null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    /* renamed from: a */
    static void m6962a(boolean r5) {
        /*
        r0 = f5306a;
        monitor-enter(r0);
        if (r5 == 0) goto L_0x000b;
    L_0x0005:
        m6963b();	 Catch:{ all -> 0x0009 }
        goto L_0x0013;
    L_0x0009:
        r5 = move-exception;
        goto L_0x004a;
    L_0x000b:
        r5 = new java.util.Date;	 Catch:{ all -> 0x0009 }
        r5.<init>();	 Catch:{ all -> 0x0009 }
        com.foursquare.pilgrim.bh.m7130f(r5);	 Catch:{ all -> 0x0009 }
    L_0x0013:
        r5 = m6959a();	 Catch:{ all -> 0x0009 }
        r1 = com.foursquare.internal.util.CollectionUtils.m6792a(r5);	 Catch:{ all -> 0x0009 }
        if (r1 == 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r0);	 Catch:{ all -> 0x0009 }
        return;
    L_0x001f:
        r1 = com.foursquare.internal.network.C1928e.m6757a();	 Catch:{ all -> 0x0009 }
        r2 = com.foursquare.pilgrim.bf.m7089a();	 Catch:{ all -> 0x0009 }
        r3 = m6958a(r5);	 Catch:{ all -> 0x0009 }
        r4 = com.foursquare.pilgrim.PilgrimSdk.get();	 Catch:{ all -> 0x0009 }
        r4 = r4.f5253a;	 Catch:{ all -> 0x0009 }
        r4 = m6957a(r4);	 Catch:{ all -> 0x0009 }
        r2 = r2.m7096a(r3, r4);	 Catch:{ all -> 0x0009 }
        r1 = r1.m6763b(r2);	 Catch:{ all -> 0x0009 }
        if (r1 == 0) goto L_0x0048;
    L_0x003f:
        r1 = r1.m6777f();	 Catch:{ all -> 0x0009 }
        if (r1 == 0) goto L_0x0048;
    L_0x0045:
        m6965b(r5);	 Catch:{ all -> 0x0009 }
    L_0x0048:
        monitor-exit(r0);	 Catch:{ all -> 0x0009 }
        return;
    L_0x004a:
        monitor-exit(r0);	 Catch:{ all -> 0x0009 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.aq.a(boolean):void");
    }

    /* renamed from: a */
    static List<PilgrimEvent> m6959a() {
        return ar.m13321a();
    }

    /* renamed from: a */
    static String m6958a(List<PilgrimEvent> list) {
        byte[] a = C1948m.m6843a(C1913a.m6653a((Object) list, new C35281()));
        if (a == null) {
            return null;
        }
        return new String(C1939a.m6810a(a));
    }

    /* renamed from: a */
    static List<PilgrimException> m6960a(Exception exception) {
        List<PilgrimException> arrayList = new ArrayList();
        Set hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        while (exception != null && hashSet.add(exception)) {
            arrayList.add(new PilgrimException(exception, CollectionUtils.m6790a(Arrays.asList(exception.getStackTrace()), new C35292())));
            exception = (Exception) exception.getCause();
        }
        return arrayList;
    }

    /* renamed from: b */
    static void m6963b() {
        ar.m13327c();
    }

    /* renamed from: b */
    private static void m6965b(List<PilgrimEvent> list) {
        Collection hashSet = new HashSet();
        for (PilgrimEvent timestamp : list) {
            hashSet.add(Long.valueOf(timestamp.getTimestamp()));
        }
        ar.m13324a(new ArrayList(hashSet));
    }

    /* renamed from: c */
    static void m6966c(PilgrimEvent pilgrimEvent) {
        ar.m13323a(pilgrimEvent);
        ar.m13326b();
    }

    /* renamed from: d */
    private static boolean m6968d(PilgrimEvent pilgrimEvent) {
        return (EventType.ERROR == pilgrimEvent.getEventType() && EventLevel.ERROR == pilgrimEvent.getLevel()) ? true : null;
    }

    /* renamed from: c */
    private static boolean m6967c() {
        return (bh.m7127e(new Date()) >= 2 ? 1 : null) == null;
    }

    /* renamed from: a */
    static java.lang.String m6957a(android.content.Context r1) {
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
        r0 = f5307b;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r1 = f5307b;
        return r1;
    L_0x0007:
        r1 = r1.getAssets();	 Catch:{ Exception -> 0x0027 }
        r0 = "pilgrim-debugging.properties";	 Catch:{ Exception -> 0x0027 }
        r1 = r1.open(r0);	 Catch:{ Exception -> 0x0027 }
        r0 = new java.util.Properties;	 Catch:{ Exception -> 0x0027 }
        r0.<init>();	 Catch:{ Exception -> 0x0027 }
        r0.load(r1);	 Catch:{ Exception -> 0x0027 }
        r1.close();	 Catch:{ Exception -> 0x0027 }
        r1 = "com.foursquare.pilgrimsdk.debugging";	 Catch:{ Exception -> 0x0027 }
        r1 = r0.getProperty(r1);	 Catch:{ Exception -> 0x0027 }
        f5307b = r1;	 Catch:{ Exception -> 0x0027 }
        r1 = f5307b;	 Catch:{ Exception -> 0x0027 }
        return r1;
    L_0x0027:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.aq.a(android.content.Context):java.lang.String");
    }
}
