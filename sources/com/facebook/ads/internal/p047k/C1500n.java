package com.facebook.ads.internal.p047k;

import com.facebook.ads.internal.view.p050a.C3325d;

/* renamed from: com.facebook.ads.internal.k.n */
public class C1500n {
    /* renamed from: a */
    private final C3325d f4156a;
    /* renamed from: b */
    private boolean f4157b = true;

    public C1500n(C3325d c3325d) {
        this.f4156a = c3325d;
    }

    /* renamed from: a */
    private static long m5280a(java.lang.String r6, java.lang.String r7) {
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
        r7 = r7.length();
        r6 = r6.substring(r7);
        r7 = android.text.TextUtils.isEmpty(r6);
        r0 = -1;
        if (r7 == 0) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r6 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x002a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ NumberFormatException -> 0x002a }
        r2 = r6.longValue();	 Catch:{ NumberFormatException -> 0x002a }
        r4 = 0;	 Catch:{ NumberFormatException -> 0x002a }
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x002a }
        if (r7 >= 0) goto L_0x0025;	 Catch:{ NumberFormatException -> 0x002a }
    L_0x0023:
        r6 = r0;	 Catch:{ NumberFormatException -> 0x002a }
        return r6;	 Catch:{ NumberFormatException -> 0x002a }
    L_0x0025:
        r6 = r6.longValue();	 Catch:{ NumberFormatException -> 0x002a }
        return r6;
    L_0x002a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.n.a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    public void m5281a() {
        if (this.f4157b) {
            if (!this.f4156a.canGoBack()) {
                if (!this.f4156a.canGoForward()) {
                    this.f4156a.m12846b("void((function() {try {  if (!window.performance || !window.performance.timing || !document ||       !document.body || document.body.scrollHeight <= 0 ||       !document.body.children || document.body.children.length < 1) {    return;  }  var nvtiming__an_t = window.performance.timing;  if (nvtiming__an_t.responseEnd > 0) {    console.log('ANNavResponseEnd:'+nvtiming__an_t.responseEnd);  }  if (nvtiming__an_t.domContentLoadedEventStart > 0) {    console.log('ANNavDomContentLoaded:' + nvtiming__an_t.domContentLoadedEventStart);  }  if (nvtiming__an_t.loadEventEnd > 0) {    console.log('ANNavLoadEventEnd:' + nvtiming__an_t.loadEventEnd);  }} catch(err) {  console.log('an_navigation_timing_error:' + err.message);}})());");
                    return;
                }
            }
            this.f4157b = false;
        }
    }

    /* renamed from: a */
    public void m5282a(String str) {
        if (!this.f4157b) {
            return;
        }
        if (str.startsWith("ANNavResponseEnd:")) {
            this.f4156a.m12843a(C1500n.m5280a(str, "ANNavResponseEnd:"));
        } else if (str.startsWith("ANNavDomContentLoaded:")) {
            this.f4156a.m12845b(C1500n.m5280a(str, "ANNavDomContentLoaded:"));
        } else {
            if (str.startsWith("ANNavLoadEventEnd:")) {
                this.f4156a.m12847c(C1500n.m5280a(str, "ANNavLoadEventEnd:"));
            }
        }
    }

    /* renamed from: a */
    public void m5283a(boolean z) {
        this.f4157b = z;
    }
}
