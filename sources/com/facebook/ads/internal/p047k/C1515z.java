package com.facebook.ads.internal.p047k;

import android.os.AsyncTask;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p043j.p044a.C1433a;
import com.facebook.ads.internal.p043j.p044a.C1440n;
import com.facebook.ads.internal.p043j.p044a.C1442p;
import com.facebook.ads.internal.p047k.p048a.C1475a;
import com.tinder.api.ManagerWebServices;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.k.z */
public class C1515z extends AsyncTask<String, Void, aa> {
    /* renamed from: a */
    private static final String f4197a = "z";
    /* renamed from: b */
    private static final Set<String> f4198b = new HashSet();
    /* renamed from: c */
    private Map<String, String> f4199c;
    /* renamed from: d */
    private Map<String, String> f4200d;
    /* renamed from: e */
    private C1440n f4201e;
    /* renamed from: f */
    private C1514a f4202f;

    /* renamed from: com.facebook.ads.internal.k.z$a */
    public interface C1514a {
        /* renamed from: a */
        void mo1649a();

        /* renamed from: a */
        void mo1650a(aa aaVar);
    }

    static {
        f4198b.add("#");
        f4198b.add(ManagerWebServices.NULL_STRING_VALUE);
    }

    public C1515z() {
        this(null, null);
    }

    public C1515z(Map<String, String> map) {
        this(map, null);
    }

    public C1515z(Map<String, String> map, Map<String, String> map2) {
        Map map3 = null;
        this.f4199c = map != null ? new HashMap(map) : null;
        if (map2 != null) {
            map3 = new HashMap(map2);
        }
        this.f4200d = map3;
    }

    /* renamed from: a */
    private String m5317a(String str, String str2, String str3) {
        if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
            if (TextUtils.isEmpty(str3)) {
                return str;
            }
            String str4 = str.contains("?") ? "&" : "?";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(str4);
            stringBuilder.append(str2);
            stringBuilder.append("=");
            stringBuilder.append(URLEncoder.encode(str3));
            str = stringBuilder.toString();
        }
        return str;
    }

    /* renamed from: a */
    private boolean m5318a(String str) {
        C1433a b = C1475a.m5155b();
        boolean z = false;
        try {
            C1440n b2;
            if (this.f4200d != null) {
                if (this.f4200d.size() != 0) {
                    C1442p c1442p = new C1442p();
                    c1442p.m5049a(this.f4200d);
                    b2 = b.m5024b(str, c1442p);
                    this.f4201e = b2;
                    if (this.f4201e != null && this.f4201e.m5042a() == Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                        z = true;
                    }
                    return z;
                }
            }
            b2 = b.m5015a(str, null);
            this.f4201e = b2;
            z = true;
            return z;
        } catch (Throwable e) {
            String str2 = f4197a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error opening url: ");
            stringBuilder.append(str);
            Log.e(str2, stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    private java.lang.String m5319b(java.lang.String r3) {
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
        r2 = this;
        r0 = com.facebook.ads.internal.p047k.C1476a.m5161a();	 Catch:{ Exception -> 0x000f }
        r1 = "analog";	 Catch:{ Exception -> 0x000f }
        r0 = com.facebook.ads.internal.p047k.C1490h.m5244a(r0);	 Catch:{ Exception -> 0x000f }
        r0 = r2.m5317a(r3, r1, r0);	 Catch:{ Exception -> 0x000f }
        return r0;
    L_0x000f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.z.b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    protected aa m5320a(String... strArr) {
        Object obj = strArr[0];
        if (TextUtils.isEmpty(obj) || f4198b.contains(obj)) {
            return null;
        }
        String b = m5319b(obj);
        if (!(this.f4199c == null || this.f4199c.isEmpty())) {
            for (Entry entry : this.f4199c.entrySet()) {
                b = m5317a(b, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        int i = 1;
        while (true) {
            int i2 = i + 1;
            if (i > 2) {
                break;
            } else if (m5318a(b)) {
                return new aa(this.f4201e);
            } else {
                i = i2;
            }
        }
        return null;
    }

    /* renamed from: a */
    protected void m5321a(aa aaVar) {
        if (this.f4202f != null) {
            this.f4202f.mo1650a(aaVar);
        }
    }

    /* renamed from: a */
    public void m5322a(C1514a c1514a) {
        this.f4202f = c1514a;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m5320a((String[]) objArr);
    }

    protected void onCancelled() {
        if (this.f4202f != null) {
            this.f4202f.mo1649a();
        }
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m5321a((aa) obj);
    }
}
