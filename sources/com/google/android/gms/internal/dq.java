package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

@zzzv
public final class dq implements zzahg, zzhj {
    /* renamed from: A */
    private long f23260A = 0;
    /* renamed from: B */
    private long f23261B = 0;
    /* renamed from: C */
    private int f23262C = -1;
    /* renamed from: D */
    private JSONObject f23263D = new JSONObject();
    /* renamed from: E */
    private int f23264E = 0;
    /* renamed from: F */
    private final AtomicInteger f23265F = new AtomicInteger(0);
    /* renamed from: G */
    private final ds f23266G = new ds();
    /* renamed from: a */
    private final Object f23267a = new Object();
    /* renamed from: b */
    private final du f23268b = new du(aja.m19218c());
    /* renamed from: c */
    private afd f23269c;
    /* renamed from: d */
    private BigInteger f23270d = BigInteger.ONE;
    /* renamed from: e */
    private final HashSet<dn> f23271e = new HashSet();
    /* renamed from: f */
    private final HashMap<String, dv> f23272f = new HashMap();
    /* renamed from: g */
    private boolean f23273g = false;
    /* renamed from: h */
    private boolean f23274h = true;
    /* renamed from: i */
    private int f23275i = 0;
    /* renamed from: j */
    private boolean f23276j = false;
    /* renamed from: k */
    private Context f23277k;
    /* renamed from: l */
    private zzakd f23278l;
    /* renamed from: m */
    private alr f23279m = null;
    /* renamed from: n */
    private boolean f23280n = true;
    /* renamed from: o */
    private boolean f23281o = true;
    /* renamed from: p */
    private ags f23282p = null;
    /* renamed from: q */
    private ago f23283q = null;
    /* renamed from: r */
    private String f23284r;
    /* renamed from: s */
    private String f23285s;
    /* renamed from: t */
    private Boolean f23286t = null;
    /* renamed from: u */
    private String f23287u;
    /* renamed from: v */
    private boolean f23288v = false;
    /* renamed from: w */
    private boolean f23289w = false;
    /* renamed from: x */
    private boolean f23290x = false;
    /* renamed from: y */
    private String f23291y = "";
    /* renamed from: z */
    private long f23292z = 0;

    public dq(fk fkVar) {
    }

    /* renamed from: b */
    private final Future m27282b(int i) {
        Future b;
        synchronized (this.f23267a) {
            this.f23262C = i;
            b = ee.m19659b(this.f23277k, i);
        }
        return b;
    }

    /* renamed from: b */
    private final Future m27283b(long j) {
        Future a;
        synchronized (this.f23267a) {
            this.f23260A = j;
            a = ee.m19655a(this.f23277k, j);
        }
        return a;
    }

    /* renamed from: a */
    public final Bundle m27284a(Context context, zzafy zzafy, String str) {
        Bundle bundle;
        synchronized (this.f23267a) {
            bundle = new Bundle();
            bundle.putBundle("app", this.f23268b.m19643a(context, str));
            Bundle bundle2 = new Bundle();
            for (String str2 : this.f23272f.keySet()) {
                bundle2.putBundle(str2, ((dv) this.f23272f.get(str2)).m19647a());
            }
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f23271e.iterator();
            while (it.hasNext()) {
                arrayList.add(((dn) it.next()).m19624d());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            zzafy.zza(this.f23271e);
            this.f23271e.clear();
        }
        return bundle;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final com.google.android.gms.internal.ags m27285a(android.content.Context r4) {
        /*
        r3 = this;
        r0 = com.google.android.gms.internal.alo.f15433K;
        r1 = com.google.android.gms.internal.aja.m19221f();
        r0 = r1.m19334a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r1 = 0;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = com.google.android.gms.internal.alo.f15441S;
        r2 = com.google.android.gms.internal.aja.m19221f();
        r0 = r2.m19334a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0039;
    L_0x0026:
        r0 = com.google.android.gms.internal.alo.f15439Q;
        r2 = com.google.android.gms.internal.aja.m19221f();
        r0 = r2.m19334a(r0);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0039;
    L_0x0038:
        return r1;
    L_0x0039:
        r0 = r3.m27299a();
        if (r0 == 0) goto L_0x0046;
    L_0x003f:
        r0 = r3.m27303b();
        if (r0 == 0) goto L_0x0046;
    L_0x0045:
        return r1;
    L_0x0046:
        r0 = r3.f23267a;
        monitor-enter(r0);
        r2 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x007b }
        if (r2 == 0) goto L_0x0079;
    L_0x004f:
        if (r4 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x0079;
    L_0x0052:
        r4 = r3.f23283q;	 Catch:{ all -> 0x007b }
        if (r4 != 0) goto L_0x005d;
    L_0x0056:
        r4 = new com.google.android.gms.internal.ago;	 Catch:{ all -> 0x007b }
        r4.<init>();	 Catch:{ all -> 0x007b }
        r3.f23283q = r4;	 Catch:{ all -> 0x007b }
    L_0x005d:
        r4 = r3.f23282p;	 Catch:{ all -> 0x007b }
        if (r4 != 0) goto L_0x0070;
    L_0x0061:
        r4 = new com.google.android.gms.internal.ags;	 Catch:{ all -> 0x007b }
        r1 = r3.f23283q;	 Catch:{ all -> 0x007b }
        r2 = r3.f23277k;	 Catch:{ all -> 0x007b }
        r2 = com.google.android.gms.internal.avy.m27264a(r2);	 Catch:{ all -> 0x007b }
        r4.<init>(r1, r2);	 Catch:{ all -> 0x007b }
        r3.f23282p = r4;	 Catch:{ all -> 0x007b }
    L_0x0070:
        r4 = r3.f23282p;	 Catch:{ all -> 0x007b }
        r4.m19149a();	 Catch:{ all -> 0x007b }
        r4 = r3.f23282p;	 Catch:{ all -> 0x007b }
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        return r4;
    L_0x0079:
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        return r1;
    L_0x007b:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007b }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.dq.a(android.content.Context):com.google.android.gms.internal.ags");
    }

    /* renamed from: a */
    public final zzakv m27286a(Context context, String str) {
        this.f23292z = ar.k().currentTimeMillis();
        synchronized (this.f23267a) {
            zzakv a;
            if (str != null) {
                if (!str.equals(this.f23291y)) {
                    this.f23291y = str;
                    a = ee.m19652a(context, str, this.f23292z);
                    return a;
                }
            }
            a = id.m19920a(null);
            return a;
        }
    }

    /* renamed from: a */
    public final Future m27287a(int i) {
        Future a;
        synchronized (this.f23267a) {
            this.f23264E = i;
            a = ee.m19654a(this.f23277k, i);
        }
        return a;
    }

    /* renamed from: a */
    final Future m27288a(long j) {
        Future b;
        synchronized (this.f23267a) {
            this.f23261B = j;
            b = ee.m19660b(this.f23277k, j);
        }
        return b;
    }

    /* renamed from: a */
    public final Future m27289a(Context context, String str, String str2, boolean z) {
        synchronized (this.f23267a) {
            JSONArray optJSONArray = this.f23263D.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (i < optJSONArray.length()) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null || !str2.equals(optJSONObject.optString("template_id"))) {
                    i++;
                } else if (z && optJSONObject.optBoolean("uses_media_view", false) == z) {
                    return null;
                } else {
                    length = i;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", ar.k().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.f23263D.put(str, optJSONArray);
            } catch (Throwable e) {
                hx.m19914c("Could not update native advanced settings", e);
            }
            Future c = ee.m19665c(this.f23277k, this.f23263D.toString());
            return c;
        }
    }

    /* renamed from: a */
    public final Future m27290a(Context context, boolean z) {
        synchronized (this.f23267a) {
            if (z != this.f23274h) {
                this.f23274h = z;
                Future a = ee.m19658a(context, z);
                return a;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final Future m27291a(String str) {
        synchronized (this.f23267a) {
            if (str != null) {
                if (!str.equals(this.f23284r)) {
                    this.f23284r = str;
                    Future a = ee.m19657a(this.f23277k, str);
                    return a;
                }
            }
            return null;
        }
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void m27292a(Context context, zzakd zzakd) {
        synchronized (this.f23267a) {
            if (!this.f23276j) {
                this.f23277k = context.getApplicationContext();
                this.f23278l = zzakd;
                ar.h().m19134a((zzhj) this);
                ee.m19656a(context, (zzahg) this);
                ee.m19661b(context, (zzahg) this);
                ee.m19671h(context, this);
                ee.m19669f(context, this);
                ee.m19664c(context, (zzahg) this);
                ee.m19667d(context, this);
                ee.m19668e(context, this);
                ee.m19670g(context, this);
                ee.m19672i(context, this);
                ee.m19673j(context, this);
                ee.m19674k(context, this);
                avy.m27264a(this.f23277k);
                this.f23287u = ar.e().m19746a(context, zzakd.zzcv);
                if (VERSION.SDK_INT >= 23 && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                    this.f23289w = true;
                }
                this.f23269c = new afd(context.getApplicationContext(), this.f23278l);
                alq alq = new alq(this.f23277k, this.f23278l.zzcv);
                try {
                    ar.m();
                    this.f23279m = alt.m19351a(alq);
                } catch (Throwable e) {
                    hx.m19914c("Cannot initialize CSI reporter.", e);
                }
                this.f23276j = true;
            }
        }
    }

    /* renamed from: a */
    public final void m27293a(dn dnVar) {
        synchronized (this.f23267a) {
            this.f23271e.add(dnVar);
        }
    }

    /* renamed from: a */
    public final void m27294a(Boolean bool) {
        synchronized (this.f23267a) {
            this.f23286t = bool;
        }
    }

    /* renamed from: a */
    public final void m27295a(String str, dv dvVar) {
        synchronized (this.f23267a) {
            this.f23272f.put(str, dvVar);
        }
    }

    /* renamed from: a */
    public final void m27296a(Throwable th, String str) {
        avy.m27264a(this.f23277k).zza(th, str);
    }

    /* renamed from: a */
    public final void m27297a(HashSet<dn> hashSet) {
        synchronized (this.f23267a) {
            this.f23271e.addAll(hashSet);
        }
    }

    /* renamed from: a */
    public final void m27298a(boolean z) {
        synchronized (this.f23267a) {
            if (this.f23280n != z) {
                ee.m19663b(this.f23277k, z);
            }
            this.f23280n = z;
            ags a = m27285a(this.f23277k);
            if (!(a == null || a.isAlive())) {
                hx.m19915d("start fetching content...");
                a.m19149a();
            }
        }
    }

    /* renamed from: a */
    public final boolean m27299a() {
        boolean z;
        synchronized (this.f23267a) {
            z = this.f23280n;
        }
        return z;
    }

    /* renamed from: b */
    public final Future m27300b(Context context, boolean z) {
        synchronized (this.f23267a) {
            if (z != this.f23290x) {
                this.f23290x = z;
                Future c = ee.m19666c(context, z);
                return c;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final Future m27301b(String str) {
        synchronized (this.f23267a) {
            if (str != null) {
                if (!str.equals(this.f23285s)) {
                    this.f23285s = str;
                    Future b = ee.m19662b(this.f23277k, str);
                    return b;
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m27302b(boolean z) {
        synchronized (this.f23267a) {
            if (this.f23281o != z) {
                ee.m19663b(this.f23277k, z);
            }
            ee.m19663b(this.f23277k, z);
            this.f23281o = z;
            ags a = m27285a(this.f23277k);
            if (!(a == null || a.isAlive())) {
                hx.m19915d("start fetching content...");
                a.m19149a();
            }
        }
    }

    /* renamed from: b */
    public final boolean m27303b() {
        boolean z;
        synchronized (this.f23267a) {
            z = this.f23281o;
        }
        return z;
    }

    /* renamed from: c */
    public final String m27304c() {
        String bigInteger;
        synchronized (this.f23267a) {
            bigInteger = this.f23270d.toString();
            this.f23270d = this.f23270d.add(BigInteger.ONE);
        }
        return bigInteger;
    }

    /* renamed from: c */
    public final void m27305c(boolean z) {
        this.f23266G.m19638a(z);
    }

    /* renamed from: d */
    public final du m27306d() {
        du duVar;
        synchronized (this.f23267a) {
            duVar = this.f23268b;
        }
        return duVar;
    }

    /* renamed from: e */
    public final alr m27307e() {
        alr alr;
        synchronized (this.f23267a) {
            alr = this.f23279m;
        }
        return alr;
    }

    /* renamed from: f */
    public final boolean m27308f() {
        boolean z;
        synchronized (this.f23267a) {
            if (!this.f23274h) {
                if (!this.f23289w) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: g */
    public final String m27309g() {
        String str;
        synchronized (this.f23267a) {
            str = this.f23284r;
        }
        return str;
    }

    /* renamed from: h */
    public final String m27310h() {
        String str;
        synchronized (this.f23267a) {
            str = this.f23285s;
        }
        return str;
    }

    /* renamed from: i */
    public final Boolean m27311i() {
        Boolean bool;
        synchronized (this.f23267a) {
            bool = this.f23286t;
        }
        return bool;
    }

    /* renamed from: j */
    public final boolean m27312j() {
        boolean z;
        synchronized (this.f23267a) {
            z = this.f23290x;
        }
        return z;
    }

    /* renamed from: k */
    final long m27313k() {
        long j;
        synchronized (this.f23267a) {
            j = this.f23260A;
        }
        return j;
    }

    /* renamed from: l */
    final long m27314l() {
        long j;
        synchronized (this.f23267a) {
            j = this.f23261B;
        }
        return j;
    }

    /* renamed from: m */
    public final int m27315m() {
        int i;
        synchronized (this.f23267a) {
            i = this.f23264E;
        }
        return i;
    }

    /* renamed from: n */
    final int m27316n() {
        int i;
        synchronized (this.f23267a) {
            i = this.f23262C;
        }
        return i;
    }

    /* renamed from: o */
    public final boolean m27317o() {
        return this.f23266G.m19639a();
    }

    /* renamed from: p */
    public final boolean m27318p() {
        return this.f23266G.m19640b();
    }

    /* renamed from: q */
    public final void m27319q() {
        this.f23266G.m19641c();
    }

    /* renamed from: r */
    public final dp m27320r() {
        dp dpVar;
        synchronized (this.f23267a) {
            dpVar = new dp(this.f23291y, this.f23292z);
        }
        return dpVar;
    }

    /* renamed from: s */
    public final JSONObject m27321s() {
        JSONObject jSONObject;
        synchronized (this.f23267a) {
            jSONObject = this.f23263D;
        }
        return jSONObject;
    }

    /* renamed from: t */
    public final Future m27322t() {
        Future a;
        synchronized (this.f23267a) {
            a = ee.m19653a(this.f23277k);
        }
        return a;
    }

    /* renamed from: u */
    public final afd m27323u() {
        return this.f23269c;
    }

    /* renamed from: v */
    public final Resources m27324v() {
        if (this.f23278l.zzdel) {
            return this.f23277k.getResources();
        }
        try {
            DynamiteModule a = DynamiteModule.a(this.f23277k, DynamiteModule.f7686a, ModuleDescriptor.MODULE_ID);
            return a != null ? a.a().getResources() : null;
        } catch (Throwable e) {
            hx.m19914c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: w */
    public final void m27325w() {
        this.f23265F.incrementAndGet();
    }

    /* renamed from: x */
    public final void m27326x() {
        this.f23265F.decrementAndGet();
    }

    /* renamed from: y */
    public final int m27327y() {
        return this.f23265F.get();
    }

    public final void zzb(Bundle bundle) {
        synchronized (this.f23267a) {
            this.f23274h = bundle.getBoolean("use_https", this.f23274h);
            this.f23275i = bundle.getInt("webview_cache_version", this.f23275i);
            if (bundle.containsKey("content_url_opted_out")) {
                m27298a(bundle.getBoolean("content_url_opted_out"));
            }
            if (bundle.containsKey("content_url_hashes")) {
                this.f23284r = bundle.getString("content_url_hashes");
            }
            this.f23290x = bundle.getBoolean("auto_collect_location", this.f23290x);
            if (bundle.containsKey("content_vertical_opted_out")) {
                m27302b(bundle.getBoolean("content_vertical_opted_out"));
            }
            if (bundle.containsKey("content_vertical_hashes")) {
                this.f23285s = bundle.getString("content_vertical_hashes");
            }
            if (bundle.containsKey("native_advanced_settings")) {
                try {
                    this.f23263D = new JSONObject(bundle.getString("native_advanced_settings"));
                } catch (Throwable e) {
                    hx.m19914c("Could not convert native advanced settings to json object", e);
                }
            }
            if (bundle.containsKey("version_code")) {
                this.f23264E = bundle.getInt("version_code");
            }
            this.f23291y = bundle.containsKey("app_settings_json") ? bundle.getString("app_settings_json") : this.f23291y;
            this.f23292z = bundle.getLong("app_settings_last_update_ms", this.f23292z);
            this.f23260A = bundle.getLong("app_last_background_time_ms", this.f23260A);
            this.f23262C = bundle.getInt("request_in_session_count", this.f23262C);
            this.f23261B = bundle.getLong("first_ad_req_time_ms", this.f23261B);
        }
    }

    public final void zzg(boolean z) {
        long currentTimeMillis = ar.k().currentTimeMillis();
        if (z) {
            if (currentTimeMillis - this.f23260A > ((Long) aja.m19221f().m19334a(alo.aw)).longValue()) {
                this.f23268b.f16033a = -1;
                return;
            }
            this.f23268b.f16033a = this.f23262C;
            return;
        }
        m27283b(currentTimeMillis);
        m27282b(this.f23268b.f16033a);
    }
}
