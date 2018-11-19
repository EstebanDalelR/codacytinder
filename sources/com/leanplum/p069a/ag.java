package com.leanplum.p069a;

import android.location.Location;
import com.facebook.ads.AdError;
import com.leanplum.ActionContext;
import com.leanplum.ActionContext.ContextualValues;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumException;
import com.leanplum.LeanplumLocationAccuracyType;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.callbacks.StartCallback;
import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.leanplum.a.ag */
public final class ag {
    /* renamed from: a */
    private static final String f7916a = "action";
    /* renamed from: b */
    private static boolean f7917b = false;
    /* renamed from: c */
    private static final Map<String, List<ActionCallback>> f7918c = new HashMap();
    /* renamed from: d */
    private static boolean f7919d = false;
    /* renamed from: e */
    private static boolean f7920e = false;
    /* renamed from: f */
    private static boolean f7921f = false;
    /* renamed from: g */
    private static boolean f7922g = false;
    /* renamed from: h */
    private static boolean f7923h = false;
    /* renamed from: i */
    private static boolean f7924i = false;
    /* renamed from: j */
    private static boolean f7925j = false;
    /* renamed from: k */
    private static final Object f7926k = new Object();
    /* renamed from: l */
    private static final Queue<Map<String, ?>> f7927l = new ConcurrentLinkedQueue();
    /* renamed from: m */
    private static final ArrayList<Runnable> f7928m = new ArrayList();
    /* renamed from: n */
    private static boolean f7929n = false;

    /* renamed from: com.leanplum.a.ag$2 */
    final class C25762 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ ActionCallback f7909a;
        /* renamed from: b */
        private /* synthetic */ ActionContext f7910b;
        /* renamed from: c */
        private /* synthetic */ VariablesChangedCallback f7911c;
        /* renamed from: d */
        private /* synthetic */ AtomicBoolean f7912d;

        C25762(ActionCallback actionCallback, ActionContext actionContext, VariablesChangedCallback variablesChangedCallback, AtomicBoolean atomicBoolean) {
            this.f7909a = actionCallback;
            this.f7910b = actionContext;
            this.f7911c = variablesChangedCallback;
            this.f7912d = atomicBoolean;
        }

        public final void run() {
            if (this.f7909a.onResponse(this.f7910b) && this.f7911c != null && !this.f7912d.getAndSet(true)) {
                this.f7911c.variablesChanged();
            }
        }
    }

    /* renamed from: com.leanplum.a.ag$4 */
    final class C25774 implements Comparator<ActionContext> {
        C25774() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((ActionContext) obj).getPriority() - ((ActionContext) obj2).getPriority();
        }

        /* renamed from: a */
        private static int m9471a(ActionContext actionContext, ActionContext actionContext2) {
            return actionContext.getPriority() - actionContext2.getPriority();
        }
    }

    /* renamed from: com.leanplum.a.ag$6 */
    final class C25786 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ String f7913a;
        /* renamed from: b */
        private /* synthetic */ Map f7914b;
        /* renamed from: c */
        private /* synthetic */ Map f7915c;

        C25786(String str, Map map, Map map2) {
            this.f7913a = str;
            this.f7914b = map;
            this.f7915c = map2;
        }

        public final void run() {
            try {
                ag.m9490c(this.f7913a, this.f7914b, this.f7915c);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.a.ag$1 */
    final class C38541 implements C2596x {
        C38541() {
        }

        /* renamed from: a */
        public final void mo2615a() {
            try {
                ag.m9508q();
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.a.ag$3 */
    final class C38553 extends VariablesChangedCallback {
        /* renamed from: a */
        private /* synthetic */ String f12098a;

        C38553(String str) {
            this.f12098a = str;
        }

        public final void variablesChanged() {
            try {
                Map hashMap = new HashMap();
                hashMap.put("messageId", this.f12098a);
                ag.m9479a("Cancel", 0.0d, null, null, hashMap);
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.a.ag$5 */
    final class C38565 extends VariablesChangedCallback {
        /* renamed from: a */
        private /* synthetic */ ActionContext f12099a;

        C38565(ActionContext actionContext) {
            this.f12099a = actionContext;
        }

        public final void variablesChanged() {
            try {
                C2587d.m9690a().m9708b(this.f12099a.getMessageId());
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: com.leanplum.a.ag$7 */
    final class C38577 extends StartCallback {
        /* renamed from: a */
        final /* synthetic */ Location f12100a;
        /* renamed from: b */
        final /* synthetic */ LeanplumLocationAccuracyType f12101b;
        /* renamed from: c */
        final /* synthetic */ aj f12102c;

        C38577(Location location, LeanplumLocationAccuracyType leanplumLocationAccuracyType, aj ajVar) {
            this.f12100a = location;
            this.f12101b = leanplumLocationAccuracyType;
            this.f12102c = ajVar;
        }

        public final void onResponse(boolean z) {
            bo.m9613a(false, new ag$7$1(this, z), new Void[0]);
        }
    }

    /* renamed from: com.leanplum.a.ag$8 */
    final class C38588 extends StartCallback {
        C38588() {
        }

        public final void onResponse(boolean z) {
            if (z) {
                if (C2590h.f8067l && !C2590h.m9712a()) {
                    bf.a();
                }
                ag.m9484a(new String[]{"start", "resume"}, null, 3, null, null);
                ag.m9486b();
            }
        }
    }

    /* renamed from: q */
    private static void m9508q() {
        if (!f7917b) {
            f7917b = true;
        }
    }

    /* renamed from: a */
    public static void m9473a() {
        synchronized (C2594s.f8115a) {
            if (C2594s.m9726a()) {
                C2594s.m9723a(new C38541());
            } else {
                ag.m9508q();
            }
        }
    }

    /* renamed from: a */
    public static void m9475a(ActionContext actionContext) {
        ag.m9476a(actionContext, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static void m9476a(com.leanplum.ActionContext r5, com.leanplum.callbacks.VariablesChangedCallback r6) {
        /*
        r0 = f7918c;
        monitor-enter(r0);
        r1 = f7918c;	 Catch:{ all -> 0x0042 }
        r2 = r5.actionName();	 Catch:{ all -> 0x0042 }
        r1 = r1.get(r2);	 Catch:{ all -> 0x0042 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0042 }
        if (r1 != 0) goto L_0x0018;
    L_0x0011:
        if (r6 == 0) goto L_0x0016;
    L_0x0013:
        r6.variablesChanged();	 Catch:{ all -> 0x0042 }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        return;
    L_0x0018:
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0042 }
        r2.<init>(r1);	 Catch:{ all -> 0x0042 }
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        r0 = new java.util.concurrent.atomic.AtomicBoolean;
        r1 = 0;
        r0.<init>(r1);
        r1 = r2.iterator();
    L_0x0028:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0041;
    L_0x002e:
        r2 = r1.next();
        r2 = (com.leanplum.callbacks.ActionCallback) r2;
        r3 = com.leanplum.p069a.aq.m9522a();
        r4 = new com.leanplum.a.ag$2;
        r4.<init>(r2, r5, r6, r0);
        r3.m9523a(r4);
        goto L_0x0028;
    L_0x0041:
        return;
    L_0x0042:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0042 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ag.a(com.leanplum.ActionContext, com.leanplum.callbacks.VariablesChangedCallback):void");
    }

    /* renamed from: a */
    public static void m9481a(String str, String str2, int i, String str3, ContextualValues contextualValues) {
        ag.m9484a(new String[]{str}, str2, i, str3, contextualValues);
    }

    /* renamed from: a */
    static void m9484a(String[] strArr, String str, int i, String str2, ContextualValues contextualValues) {
        String[] strArr2 = strArr;
        Map p = bq.m9672p();
        if (p != null) {
            int i2;
            ArrayList arrayList = new ArrayList();
            Iterator it = p.keySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (str3 == null) {
                    String str4 = str2;
                } else if (str3.equals(str2)) {
                }
                Map map = (Map) p.get(str3);
                String str5 = (String) map.get(f7916a);
                if (str5 != null) {
                    String stringBuilder;
                    if (str5.equals("__held_back")) {
                        StringBuilder stringBuilder2 = new StringBuilder("__held_back__");
                        stringBuilder2.append(str3);
                        stringBuilder = stringBuilder2.toString();
                    } else {
                        stringBuilder = str3;
                    }
                    if ((str5.equals("__Push Notification") ^ 1) == 0 || (i & 1) != 0) {
                        C2588e c2588e = new C2588e();
                        int length = strArr2.length;
                        while (i2 < length) {
                            C2588e a = C2587d.m9690a().m9705a(stringBuilder, map, strArr2[i2], str, contextualValues);
                            c2588e.f8051a |= a.f8051a;
                            c2588e.f8052b |= a.f8052b;
                            c2588e.f8053c = a.f8053c | c2588e.f8053c;
                            i2++;
                        }
                        if (c2588e.f8052b) {
                            StringBuilder stringBuilder3 = new StringBuilder("__Cancel");
                            stringBuilder3.append(map.get(f7916a));
                            ag.m9476a(new ActionContext(stringBuilder3.toString(), new HashMap(), str3), new C38553(str3));
                        }
                        if (c2588e.f8051a) {
                            C2587d.m9690a().m9706a(stringBuilder);
                            if (c2588e.f8053c) {
                                ActionContext actionContext = new ActionContext(map.get(f7916a).toString(), (Map) map.get("vars"), stringBuilder, str3, map.containsKey("priority") ? ((Integer) map.get("priority")).intValue() : AdError.NETWORK_ERROR_CODE);
                                actionContext.setContextualValues(contextualValues);
                                arrayList.add(actionContext);
                            }
                        }
                    }
                }
                ContextualValues contextualValues2 = contextualValues;
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new C25774());
                int priority = ((ActionContext) arrayList.get(0)).getPriority();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ActionContext actionContext2 = (ActionContext) it2.next();
                    if (actionContext2.getPriority() > priority) {
                        break;
                    } else if (actionContext2.actionName().equals("__held_back")) {
                        C2587d.m9690a().m9707a(actionContext2.getMessageId(), actionContext2.getOriginalMessageId());
                    } else if (i2 == 0) {
                        ag.m9476a(actionContext2, new C38565(actionContext2));
                        i2 = 1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9479a(String str, double d, String str2, Map<String, ?> map, Map<String, String> map2) {
        if (!C2590h.m9712a()) {
            try {
                Map hashMap = new HashMap();
                if (map2 != null) {
                    hashMap.putAll(map2);
                }
                hashMap.put("value", Double.toString(d));
                hashMap.put("info", str2);
                if (str != null) {
                    hashMap.put("event", str);
                }
                if (map != null) {
                    map = ag.m9472a((Map) map, "params", false);
                    hashMap.put("params", ab.m9450a((Map) map));
                }
                if (f7925j == null || LeanplumActivityHelper.isActivityPaused() != null) {
                    hashMap.put("allowOffline", Boolean.TRUE.toString());
                }
                if (f7919d != null) {
                    ag.m9490c(str, map, hashMap);
                } else {
                    ag.m9477a(new C25786(str, map, hashMap));
                }
            } catch (Throwable th) {
                bo.m9608a(th);
            }
        }
    }

    /* renamed from: b */
    private static void m9487b(String str, Map<String, ?> map, Map<String, Object> map2) {
        if (f7919d) {
            ag.m9490c(str, map, map2);
        } else {
            ag.m9477a(new C25786(str, map, map2));
        }
    }

    /* renamed from: c */
    private static void m9490c(java.lang.String r5, java.util.Map<java.lang.String, ?> r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r0 = "track";
        r0 = com.leanplum.p069a.aw.m9544b(r0, r7);
        r0.m9579h();
        r0 = "messageId";
        r0 = r7.get(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x0011:
        r0 = "messageId";
        r0 = r7.get(r0);
        r0 = r0.toString();
        r1 = new java.lang.StringBuilder;
        r2 = ".m";
        r1.<init>(r2);
        r1.append(r0);
        r1 = r1.toString();
        if (r5 == 0) goto L_0x0046;
    L_0x002b:
        r2 = r5.length();
        if (r2 <= 0) goto L_0x0046;
    L_0x0031:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r1);
        r1 = " ";
        r2.append(r1);
        r2.append(r5);
        r5 = r2.toString();
        goto L_0x0049;
    L_0x0046:
        r5 = r1;
        goto L_0x0049;
    L_0x0048:
        r0 = 0;
    L_0x0049:
        r1 = new com.leanplum.ActionContext$ContextualValues;
        r1.<init>();
        r1.parameters = r6;
        r1.arguments = r7;
        r6 = r1.arguments;
        r7 = "params";
        r6 = r6.containsKey(r7);
        if (r6 == 0) goto L_0x0074;
    L_0x005c:
        r6 = r1.arguments;	 Catch:{ JSONException -> 0x0074 }
        r7 = "params";	 Catch:{ JSONException -> 0x0074 }
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0074 }
        r3 = r1.arguments;	 Catch:{ JSONException -> 0x0074 }
        r4 = "params";	 Catch:{ JSONException -> 0x0074 }
        r3 = r3.get(r4);	 Catch:{ JSONException -> 0x0074 }
        r3 = r3.toString();	 Catch:{ JSONException -> 0x0074 }
        r2.<init>(r3);	 Catch:{ JSONException -> 0x0074 }
        r6.put(r7, r2);	 Catch:{ JSONException -> 0x0074 }
    L_0x0074:
        r6 = "event";
        r7 = 3;
        com.leanplum.p069a.ag.m9481a(r6, r5, r7, r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ag.c(java.lang.String, java.util.Map, java.util.Map):void");
    }

    /* renamed from: a */
    public static void m9480a(String str, String str2) {
        Map p = bq.m9672p();
        if (p != null) {
            p = (Map) p.get(str2);
            if (p != null) {
                new ActionContext(p.get(f7916a).toString(), (Map) p.get("vars"), str2).runTrackedActionNamed(str);
            }
        }
    }

    /* renamed from: a */
    public static void m9474a(Location location, LeanplumLocationAccuracyType leanplumLocationAccuracyType, aj ajVar) {
        Leanplum.addStartResponseHandler(new C38577(location, leanplumLocationAccuracyType, ajVar));
    }

    /* renamed from: b */
    public static void m9486b() {
        Object obj = null;
        for (Map map : f7927l) {
            Map q = bq.m9673q();
            if (q == null) {
                q = new HashMap();
            }
            for (String str : map.keySet()) {
                Object obj2 = q.get(str);
                Object obj3 = map.get(str);
                if ((obj2 == null && obj3 != null) || !(obj2 == null || obj2.equals(obj3))) {
                    ContextualValues contextualValues = new ContextualValues();
                    contextualValues.previousAttributeValue = obj2;
                    contextualValues.attributeValue = obj3;
                    q.put(str, obj3);
                    ag.m9481a("userAttribute", str, 3, null, contextualValues);
                    obj = 1;
                }
            }
        }
        f7927l.clear();
        if (obj != null) {
            bq.m9674r();
        }
    }

    /* renamed from: c */
    public static void m9489c() {
        synchronized (f7926k) {
            if (f7925j) {
                return;
            }
            f7925j = true;
            Leanplum.addStartResponseHandler(new C38588());
        }
    }

    /* renamed from: a */
    public static void m9477a(Runnable runnable) {
        if (runnable == null) {
            ao.m9516a("addStartIssuedHandler - Invalid handler parameter provided.");
            return;
        }
        synchronized (f7928m) {
            if (f7919d) {
                runnable.run();
                return;
            }
            f7928m.add(runnable);
        }
    }

    /* renamed from: d */
    public static void m9492d() {
        synchronized (f7928m) {
            f7919d = true;
            Iterator it = f7928m.iterator();
            while (it.hasNext()) {
                aq.m9522a().m9523a((Runnable) it.next());
            }
            f7928m.clear();
        }
    }

    /* renamed from: a */
    public static <T> java.util.Map<java.lang.String, T> m9472a(java.util.Map<java.lang.String, T> r6, java.lang.String r7, boolean r8) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        if (r6 != 0) goto L_0x0004;
    L_0x0002:
        r6 = 0;
        return r6;
    L_0x0004:
        r0 = new java.util.HashMap;
        r0.<init>();
        r6 = r6.entrySet();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r6 = r6.iterator();	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0011:
        r1 = r6.hasNext();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r1 == 0) goto L_0x0070;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0017:
        r1 = r6.next();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r1 = (java.util.Map.Entry) r1;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r2 = r1.getValue();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r8 == 0) goto L_0x0043;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0023:
        r3 = r2 instanceof java.lang.Iterable;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r3 == 0) goto L_0x0043;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0027:
        r3 = 1;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r4 = r2;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r4 = (java.lang.Iterable) r4;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r4 = r4.iterator();	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x002f:
        r5 = r4.hasNext();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r5 == 0) goto L_0x0040;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0035:
        r5 = r4.next();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r5 = com.leanplum.p069a.ag.m9485a(r5, r7);	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r5 != 0) goto L_0x002f;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x003f:
        r3 = 0;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0040:
        if (r3 == 0) goto L_0x0011;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0042:
        goto L_0x0059;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0043:
        r3 = r2 instanceof java.util.Date;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r3 == 0) goto L_0x0051;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0047:
        r2 = (java.util.Date) r2;	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r2 = r2.getTime();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0051:
        if (r2 == 0) goto L_0x0059;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0053:
        r3 = com.leanplum.p069a.ag.m9485a(r2, r7);	 Catch:{ ConcurrentModificationException -> 0x0061 }
        if (r3 == 0) goto L_0x0011;	 Catch:{ ConcurrentModificationException -> 0x0061 }
    L_0x0059:
        r1 = r1.getKey();	 Catch:{ ConcurrentModificationException -> 0x0061 }
        r0.put(r1, r2);	 Catch:{ ConcurrentModificationException -> 0x0061 }
        goto L_0x0011;
    L_0x0061:
        r6 = new com.leanplum.LeanplumException;
        r7 = "ConcurrentModificationException: You cannot modify Map<String, ?> attributes/parameters. Will override with an empty map";
        r6.<init>(r7);
        com.leanplum.p069a.ag.m9478a(r6);
        r0 = new java.util.HashMap;
        r0.<init>();
    L_0x0070:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.leanplum.a.ag.a(java.util.Map, java.lang.String, boolean):java.util.Map<java.lang.String, T>");
    }

    /* renamed from: a */
    private static boolean m9485a(Object obj, String str) {
        if ((obj instanceof Number) || (obj instanceof String) || (obj instanceof Boolean) != null) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" values must be of type String, Number, or Boolean.");
        ag.m9478a(new LeanplumException(stringBuilder.toString()));
        return null;
    }

    /* renamed from: a */
    public static void m9478a(RuntimeException runtimeException) {
        if (C2590h.f8067l) {
            throw runtimeException;
        }
        Object[] objArr = new Object[2];
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(runtimeException.getMessage());
        stringBuilder.append(" This error is only thrown in development mode.");
        objArr[0] = stringBuilder.toString();
        objArr[1] = runtimeException;
        ao.m9516a(objArr);
    }

    /* renamed from: e */
    public static boolean m9495e() {
        return f7917b;
    }

    /* renamed from: f */
    public static Map<String, List<ActionCallback>> m9496f() {
        return f7918c;
    }

    /* renamed from: g */
    public static boolean m9498g() {
        return f7919d;
    }

    /* renamed from: f */
    private static void m9497f(boolean z) {
        f7919d = true;
    }

    /* renamed from: h */
    public static boolean m9499h() {
        return f7920e;
    }

    /* renamed from: a */
    public static void m9483a(boolean z) {
        f7920e = true;
    }

    /* renamed from: i */
    public static boolean m9500i() {
        return f7921f;
    }

    /* renamed from: b */
    public static void m9488b(boolean z) {
        f7921f = z;
    }

    /* renamed from: j */
    public static boolean m9501j() {
        return f7922g;
    }

    /* renamed from: c */
    public static void m9491c(boolean z) {
        f7922g = true;
    }

    /* renamed from: k */
    public static boolean m9502k() {
        return f7923h;
    }

    /* renamed from: d */
    public static void m9493d(boolean z) {
        f7923h = z;
    }

    /* renamed from: l */
    public static boolean m9503l() {
        return f7924i;
    }

    /* renamed from: e */
    public static void m9494e(boolean z) {
        f7924i = z;
    }

    /* renamed from: m */
    public static Queue<Map<String, ?>> m9504m() {
        return f7927l;
    }

    /* renamed from: n */
    public static boolean m9505n() {
        return f7929n;
    }

    /* renamed from: o */
    public static void m9506o() {
        f7929n = true;
    }
}
