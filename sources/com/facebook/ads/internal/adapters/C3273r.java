package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p041h.C3288g;
import com.facebook.ads.internal.p049l.C1517a;
import com.facebook.ads.internal.view.C1556b;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.r */
public class C3273r extends C1351a {
    /* renamed from: c */
    private static final String f10014c = "r";
    /* renamed from: d */
    private final C1556b f10015d;
    /* renamed from: e */
    private final Context f10016e;
    /* renamed from: f */
    private C3272q f10017f;
    /* renamed from: g */
    private boolean f10018g;

    /* renamed from: com.facebook.ads.internal.adapters.r$1 */
    class C13641 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3273r f3688a;

        C13641(C3273r c3273r) {
            this.f3688a = c3273r;
        }

        public void run() {
            if (this.f3688a.f10015d.m5423c()) {
                Log.w(C3273r.f10014c, "Webview already destroyed, cannot activate");
                return;
            }
            C1556b a = this.f3688a.f10015d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("javascript:");
            stringBuilder.append(this.f3688a.f10017f.m12574b());
            a.loadUrl(stringBuilder.toString());
        }
    }

    public C3273r(Context context, C1556b c1556b, C1517a c1517a, C1352b c1352b) {
        super(context, c1352b, c1517a);
        this.f10016e = context.getApplicationContext();
        this.f10015d = c1556b;
    }

    /* renamed from: a */
    public void m12583a(C3272q c3272q) {
        this.f10017f = c3272q;
    }

    /* renamed from: a */
    protected void mo1731a(Map<String, String> map) {
        if (this.f10017f != null && !TextUtils.isEmpty(this.f10017f.mo1728D())) {
            C3288g.m12671a(this.f10016e).mo1743a(this.f10017f.mo1728D(), (Map) map);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public synchronized void m12585b() {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f10018g;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0029;
    L_0x0005:
        r0 = r2.f10017f;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x0029;
    L_0x000a:
        r0 = 1;
        r2.f10018g = r0;	 Catch:{ all -> 0x002b }
        r0 = r2.f10015d;	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x0027;
    L_0x0011:
        r0 = r2.f10017f;	 Catch:{ all -> 0x002b }
        r0 = r0.m12574b();	 Catch:{ all -> 0x002b }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0027;
    L_0x001d:
        r0 = r2.f10015d;	 Catch:{ all -> 0x002b }
        r1 = new com.facebook.ads.internal.adapters.r$1;	 Catch:{ all -> 0x002b }
        r1.<init>(r2);	 Catch:{ all -> 0x002b }
        r0.post(r1);	 Catch:{ all -> 0x002b }
    L_0x0027:
        monitor-exit(r2);
        return;
    L_0x0029:
        monitor-exit(r2);
        return;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.r.b():void");
    }
}
